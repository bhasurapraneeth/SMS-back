package com.sms.studentmanagementsytem.repository;

import com.sms.studentmanagementsytem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
