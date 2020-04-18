package com.example.jpademo.dao;

import com.example.jpademo.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRespository extends JpaRepository<Message,Integer> {
}
