package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import com.a2.pocketA3.features.auth.enums.GenderType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.File;
@Data
@AllArgsConstructor
public class RegisterPublicDetailsRequest {

    @NotEmpty(message = ValidationConstants.fullNameRequired)
    private String fullName;

    @NotEmpty(message = ValidationConstants.genderRequired)
    private GenderType genderType;

    @NotEmpty(message = ValidationConstants.nickNotRequired)
    private String nickName;

    @NotEmpty(message = ValidationConstants.profileRequired)
    private File profile;

    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;

    @NotEmpty(message = ValidationConstants.referenceIdRequired)
    private String referenceId;
}
