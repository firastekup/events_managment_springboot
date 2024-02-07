package com.example.Evenements.services;

import com.example.Evenements.Entity.Evenements;
import com.example.Evenements.Entity.Participant;
import com.example.Evenements.Entity.User;
import com.example.Evenements.Repository.ParticipantRepository;
import com.example.Evenements.Repository.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Userserviceimpl implements userservice {
    @Autowired
    private Userrepository userrepository;

    @Override
    public List<User> getalluser() {
        return userrepository.findAll();
    }

    @Override
    public User getuser(Long id) {
        Optional<User> optionalUser= userrepository.findById(id);
        return null;

    }

    @Override
    public void deleteuser(Long id) {
        userrepository.deleteById(id);


    }

    @Override
    public User updateuser(User user) {
        if (userrepository.existsById(user.getId()))
        {
            return userrepository.save(user);
        }
        return null;
    }

    @Override
    public User createuser(User user) {
        return userrepository.save(user);
    }
}
