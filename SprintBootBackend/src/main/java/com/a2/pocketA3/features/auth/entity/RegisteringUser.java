package com.a2.pocketA3.features.auth.entity;
import com.a2.pocketA3.features.auth.enums.GenderType;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import com.a2.pocketA3.features.auth.enums.MaritalStatus;
import com.a2.pocketA3.features.auth.enums.Occasion;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class RegisteringUser {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String fullName;
    private LocalDate birthDate;
    private String country;
    private String phoneNumber;

    private MaritalStatus maritalStatus;
    private GenderType gender;
    private Occasion occasion;
    private MBTIType mbtiType;

    private String profileUrl;
    private double heightCM;
    private double weightKg;
    private double fatPercentage;
}
