package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import entity.TurbineUser;
import service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	// 1. Hiển thị trang chủ Index
	@GetMapping("/")
	public String indexPage() {
		return "index"; // Trỏ tới file /WEB-INF/views/index.jsp
	}

	// 2. Hiển thị danh sách User (Search Page)
	@GetMapping("/user/search")
	public String searchUserPage(Model model) {
		// Lấy danh sách user từ DB đẩy ra giao diện
		model.addAttribute("users", userService.getAllUsers());
		return "search-user"; // Trỏ tới file /WEB-INF/views/search-user.jsp
	}

	// 3. Hiển thị form Add User (Popup/Page)
	@GetMapping("/user/add")
	public String showAddUserForm(Model model) {
		model.addAttribute("userForm", new TurbineUser());
		// Load data cho Combobox Position và Department list [cite: 77]
		model.addAttribute("positions", userService.getAllPositions());
		model.addAttribute("departments", userService.getAllDepartments());

		return "add-user"; // Trỏ tới file /WEB-INF/views/add-user.jsp
	}

	// 4. Xử lý khi bấm nút "Adding" trên form [cite: 78]
	@PostMapping("/user/save")
	public String saveUser(@ModelAttribute("userForm") TurbineUser userForm) {
		userService.saveUser(userForm);
		// Lưu xong thì redirect về trang danh sách
		return "redirect:/user/search";
	}
}