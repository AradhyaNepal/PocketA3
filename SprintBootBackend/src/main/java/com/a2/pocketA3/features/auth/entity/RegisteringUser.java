package com.a2.pocketA3.features.auth.entity;

import com.a2.pocketA3.features.auth.enums.MBTIType;
import jakarta.persistence.*;

import java.time.LocalDate;

public class RegisteringUser {
    @Id
    @GeneratedValue
    private int id;


    private String email;
    private String fullName;
    private String profileUrl;
    private String gender;
    private LocalDate birthDate;
    private String country;
    private MBTIType mbtiType;
    private double heightCM;
    private double weightKg;
    private double fatPercentage;
}
