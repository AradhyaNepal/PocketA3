package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class RegisterSetPasswordRequest {

    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;

    @NotEmpty(message = ValidationConstants.referenceIdRequired)
    private String referenceId;

    @NotEmpty(message = ValidationConstants.passwordRequired)
    @Pattern(regexp = ValidationConstants.passwordRegex, message = ValidationConstants.passwordRegexMessage)
    @Size(min = ValidationConstants.passwordMinLength, message = ValidationConstants.passwordMinLengthMessage)
    private String password;

}
