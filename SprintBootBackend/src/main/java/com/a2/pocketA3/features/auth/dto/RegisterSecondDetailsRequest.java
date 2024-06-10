package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import com.a2.pocketA3.features.auth.enums.MaritalStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class RegisterSecondDetailsRequest extends BaseRegisterStepRequest {
    @NotEmpty(message = ValidationConstants.birthDateRequired)
    private LocalDate birthDate;
    @NotEmpty(message = ValidationConstants.countryRequired)
    private String country;

    @NotEmpty(message = ValidationConstants.phoneNumberRequired)
    private String phoneNumber;

    @NotEmpty(message = ValidationConstants.maritalStatusRequired)
    private MaritalStatus maritalStatus;


}
