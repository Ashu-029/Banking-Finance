package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.exception.ResourceNotFoundException;
import com.admin.model.User;
import com.admin.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public User addUser(User user) {
		
		return adminRepository.save(user);
	}

	@Override
	public User getUserById(int id) {
	
	return adminRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User", " id ", id));
	}

	@Override
	public List<User> getAllUser() {
		
		return adminRepository.findAll();
				
	}

	@Override
	public void deleteUserById(int id) {
		
		User user = adminRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User", " id ", id));
		
		adminRepository.deleteById(user.getUserId());
	}

	
	
	
	
}
