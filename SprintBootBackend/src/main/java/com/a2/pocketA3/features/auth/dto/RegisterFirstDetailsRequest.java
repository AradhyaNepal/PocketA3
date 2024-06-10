package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import com.a2.pocketA3.features.auth.enums.GenderType;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class RegisterFirstDetailsRequest extends BaseRegisterStepRequest {

    @NotEmpty(message = ValidationConstants.fullNameRequired)
    private String fullName;

    @NotEmpty(message = ValidationConstants.genderRequired)
    private GenderType gender;

    @NotEmpty(message = ValidationConstants.nickNotRequired)
    private String nickName;

    @NotEmpty(message = ValidationConstants.profileRequired)
    private File profile;

}
