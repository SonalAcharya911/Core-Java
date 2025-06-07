package com.xworkz.extraordinary.service;

import com.xworkz.extraordinary.dto.UserNameDto;

public class UserNameServiceImpl implements UserNameService{
    @Override
    public boolean validate(UserNameDto userNameDto) {
        try{
            if(userNameDto!=null){
                try{
                    if(userNameDto.getNickName()==null){
                        throw new NullPointerException("nickname is null");
                    }
                    else{
                        System.out.println("nick name is valid");
                    }
                }
                catch(NullPointerException n){
                    System.out.println(n.getMessage());
                }
            }
            else {
                throw new NullPointerException("dtoo is null");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return true;
    }
}
