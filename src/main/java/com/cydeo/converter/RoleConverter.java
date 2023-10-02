package com.cydeo.converter;

import com.cydeo.dto.RoleDTO;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class RoleConverter implements Converter<String, RoleDTO> {
    @Override
    public RoleDTO convert(String source) {
        return null;
    }

//    RoleService roleService;
//
//    public RoleConverter(RoleService roleService) {
//        this.roleService = roleService;
//    }
//
//    @Override
//    public RoleDTO convert(String source) {
//
//        if (source == null || source.equals("")) {  //  Select  -> ""
//            return null;
//        }
//
//        return roleService.findById(Long.parseLong(source));
//
//    }

}
