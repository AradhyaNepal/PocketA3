package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class RegisterPrivateDetailsRequest {
    @NotEmpty(message = ValidationConstants.birthDateRequired)
    private LocalDate birthDate;
    @NotEmpty(message = ValidationConstants.countryRequired)
    private String country;
    @NotEmpty(message = ValidationConstants.mbtiTypeRequired)
    private MBTIType mbtiType;
    @NotEmpty(message = ValidationConstants.heightRequired)
    private double heightCm;
    @NotEmpty(message = ValidationConstants.weightRequired)
    private double weightKg;
    @NotEmpty(message = ValidationConstants.fatPercentageRequired)
    private double fatPercentage;

    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;
    @NotEmpty(message = ValidationConstants.referenceIdRequired)
    private String referenceId;

}
