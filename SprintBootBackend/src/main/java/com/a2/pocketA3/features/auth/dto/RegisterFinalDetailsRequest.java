package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public final class RegisterFinalDetailsRequest extends BaseRegisterStepRequest {
    @NotEmpty(message = ValidationConstants.profileRequired)
    private File profile;

    @NotEmpty(message = ValidationConstants.heightRequired)
    private double heightCm;

    @NotEmpty(message = ValidationConstants.weightRequired)
    private double weightKg;

    @NotEmpty(message = ValidationConstants.fatPercentageRequired)
    private double fatPercentage;
}
