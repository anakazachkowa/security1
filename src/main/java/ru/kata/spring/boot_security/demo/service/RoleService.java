package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    void addRole(Role role);

    Role getRoleById(Long id);

    Set<Role> getAllRoles();

    Set<Role> getByName(List<String> name);

    Role getRoleByName(String name);
}
