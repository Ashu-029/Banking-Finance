package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.model.User;

@Repository
public interface AdminRepository extends JpaRepository<User, Integer> {

}
