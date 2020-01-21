package com.example.techmantra.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_profile")
@Data
@NoArgsConstructor @AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String userName;
}
