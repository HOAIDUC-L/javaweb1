package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.TurbineUser;

@Repository
public interface UserRepository extends JpaRepository<TurbineUser, Integer> {
	// Kế thừa JpaRepository là đã có sẵn findAll(), save(), deleteById()...
	// Sau này nếu cần search theo tên, bạn chỉ cần định nghĩa thêm hàm ở đây.
}