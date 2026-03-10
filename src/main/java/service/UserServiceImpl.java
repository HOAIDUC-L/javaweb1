package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.EipMPosition;
import entity.EipMPost;
import entity.TurbineUser;
import repository.PositionRepository;
import repository.PostRepository;
import repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PositionRepository positionRepository;

	@Autowired
	private PostRepository postRepository;

	@Override
	public List<TurbineUser> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void saveUser(TurbineUser user) {
		userRepository.save(user);
	}

	@Override
	public List<EipMPosition> getAllPositions() {
		return positionRepository.findAll();
	}

	@Override
	public List<EipMPost> getAllDepartments() {
		return postRepository.findAll();
	}
}