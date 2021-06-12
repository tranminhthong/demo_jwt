package com.example.springbootjwt.service.role;

import com.example.springbootjwt.model.Role;
import com.example.springbootjwt.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}
