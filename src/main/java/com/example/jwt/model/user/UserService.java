package com.example.jwt.model.user;

import com.example.jwt.model.role.Role;
import com.example.jwt.model.role.RoleName;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, RoleName roleName);
    User getUser(String username);
    List<User> getUsers();

}
