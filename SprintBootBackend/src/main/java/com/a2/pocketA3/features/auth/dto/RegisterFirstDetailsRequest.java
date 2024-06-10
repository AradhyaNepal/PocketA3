package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class RegisterFirstDetailsRequest extends BaseRegisterStepRequest {

    @NotEmpty(message = ValidationConstants.fullNameRequired)
    private String fullName;

    @NotEmpty(message = ValidationConstants.birthDateRequired)
    private LocalDate birthDate;

    @NotEmpty(message = ValidationConstants.countryRequired)
    private String country;

    @NotEmpty(message = ValidationConstants.phoneNumberRequired)
    private String phoneNumber;


}
