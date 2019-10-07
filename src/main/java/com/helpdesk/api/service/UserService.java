package com.helpdesk.api.service;

import com.helpdesk.api.security.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	User findById(String id);
	
	void delete(String id);
	
	Page<User> findAll(int page, int count);
}
