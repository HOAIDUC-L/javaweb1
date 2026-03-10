package service;

import java.util.List;

import entity.EipMPosition;
import entity.EipMPost;
import entity.TurbineUser;

public interface UserService {
	List<TurbineUser> getAllUsers();

	void saveUser(TurbineUser user);

	List<EipMPosition> getAllPositions();

	List<EipMPost> getAllDepartments();
}