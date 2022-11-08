package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake user list

    List<User> list=List.of(
           new User(1344L,"arjun pal","9567813660"),
            new User(1345L,"Rahul pal","9567813661"),
            new User(1346L,"anuj pal","9567813662")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
