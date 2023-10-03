package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {

        List<Role> roleList = roleRepository.findAll();

        return roleList.stream().map(roleMapper::convertToDto).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}


//Controller called me and requestiond all RoleDTOs so it can show in the drop-down in the ui
//I need to ,ake a call to db and get all the roles from table
//Go To repository and find a service(method) which gives me the roles from db
//How i will call any service here?==> dependency injection



//I have Role entities from DB
//I have Role entities from DB
//I need to concert those Role entities to DTOs
//I nedd to use Modelmapper.
//I already created a class called RoleMapper and there are methods for me that will make this conversion ==>injection

