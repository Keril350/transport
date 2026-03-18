
package com.example.transportsys.config;

import com.example.transportsys.model.*;
import com.example.transportsys.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository repo;

    public DataInitializer(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        if (repo.findByUsername("manager").isEmpty()) {
            User m = new User();
            m.setUsername("manager");
            m.setPassword("12345");
            m.setRole(Role.MANAGER);
            m.setEnabled(true);
            repo.save(m);
        }
    }
}
