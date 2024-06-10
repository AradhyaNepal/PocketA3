package com.a2.pocketA3.features.auth.dto;


import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterOTPValidateRequest {

    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;

    @NotEmpty(message = ValidationConstants.referenceIdRequired)
    private String referenceId;
}
