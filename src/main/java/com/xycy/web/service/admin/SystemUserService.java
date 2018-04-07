package com.xycy.web.service.admin;

import java.util.List;
import com.xycy.web.admin.entity.User;

public interface SystemUserService {
	public List<User> queryAll();
	public User queryOneById(Integer id);
	public User addUser();
}
