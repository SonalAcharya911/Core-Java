package com.xworkz.extraordinary.runner;

import com.xworkz.extraordinary.dto.UserNameDto;
import com.xworkz.extraordinary.service.UserNameService;
import com.xworkz.extraordinary.service.UserNameServiceImpl;

public class UserNameRunner {
    public static void main(String[] args) {
        UserNameDto userNameDto=new UserNameDto();

        userNameDto.setNickName("baby");

        UserNameService userNameService=new UserNameServiceImpl();

        userNameService.validate(userNameDto);

    }
}
