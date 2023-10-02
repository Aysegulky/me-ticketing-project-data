package com.cydeo.converter;

import com.cydeo.dto.UserDTO;
//import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationPropertiesBinding
public class UserConverter implements Converter<String, UserDTO> {
    @Override
    public UserDTO convert(String source) {
        return null;
    }

//    UserService userService;
//
//    public UserConverter(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public UserDTO convert(String source) {
//
//        if (source == null || source.equals("")) {
//            return null;
//        }
//
//        return userService.findById(source);
//
//    }

}
