package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import com.a2.pocketA3.features.auth.enums.GenderType;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import com.a2.pocketA3.features.auth.enums.MaritalStatus;
import com.a2.pocketA3.features.auth.enums.Occasion;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public final class RegisterSecondDetailsRequest extends BaseRegisterStepRequest {


    @NotEmpty(message = ValidationConstants.maritalStatusRequired)
    private MaritalStatus maritalStatus;

    @NotEmpty(message = ValidationConstants.genderRequired)
    private GenderType gender;

    @NotEmpty(message = ValidationConstants.occasionRequired)
    private Occasion occasion;

    @NotEmpty(message = ValidationConstants.mbtiTypeRequired)
    private MBTIType mbtiType;


}
