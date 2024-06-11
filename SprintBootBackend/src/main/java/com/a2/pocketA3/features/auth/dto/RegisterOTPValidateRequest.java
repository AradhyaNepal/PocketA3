package com.a2.pocketA3.features.auth.dto;


import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@AllArgsConstructor
@Data
public class RegisterOTPValidateRequest {
    @NotEmpty(message = ValidationConstants.emailRequired)
    @Email(message = ValidationConstants.emailNotValid)
    private String email;
    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;
}
