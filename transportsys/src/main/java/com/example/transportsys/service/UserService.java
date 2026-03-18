
package com.example.transportsys.service;

import com.example.transportsys.model.*;
import com.example.transportsys.repo.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        user.setRole(Role.NONE);
        user.setEnabled(false);
        return repo.save(user);
    }

    public User approve(Long id) {
        User u = repo.findById(id).orElseThrow();
        u.setRole(Role.EMPLOYEE);
        u.setEnabled(true);
        return repo.save(u);
    }
}
