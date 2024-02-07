package com.example.Evenements.services;

import com.example.Evenements.Entity.User;

import java.util.List;

public interface userservice {
    List<User> getalluser();
    User getuser(Long id) ;
    void deleteuser(Long id);
    User updateuser(User user);
    User createuser(User user );
}
