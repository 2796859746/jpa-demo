package com.example.jpademo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Lenovo
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer msgId;
    @Column(nullable = false)
    private String msgText;
    @Column(length = 32)
    private String msgSummary;
}