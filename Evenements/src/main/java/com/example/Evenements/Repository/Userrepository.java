package com.example.Evenements.Repository;

import com.example.Evenements.Entity.Participant;
import com.example.Evenements.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Long> {
}
