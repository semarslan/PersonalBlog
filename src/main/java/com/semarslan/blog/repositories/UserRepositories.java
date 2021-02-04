package com.semarslan.blog.repositories;

import com.semarslan.blog.com.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositories extends JpaRepository<User,Long> {
}
