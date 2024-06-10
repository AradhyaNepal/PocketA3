package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class RegisterSetPasswordRequest extends BaseRegisterStepRequest {


    @NotEmpty(message = ValidationConstants.passwordRequired)
    @Pattern(regexp = ValidationConstants.passwordRegex, message = ValidationConstants.passwordRegexMessage)
    @Size(min = ValidationConstants.passwordMinLength, message = ValidationConstants.passwordMinLengthMessage)
    private String password;

}
