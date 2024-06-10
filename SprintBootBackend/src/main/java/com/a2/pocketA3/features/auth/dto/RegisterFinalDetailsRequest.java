package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class RegisterFinalDetailsRequest extends BaseRegisterStepRequest {
    @NotEmpty(message = ValidationConstants.mbtiTypeRequired)
    private MBTIType mbtiType;
    @NotEmpty(message = ValidationConstants.heightRequired)
    private double heightCm;
    @NotEmpty(message = ValidationConstants.weightRequired)
    private double weightKg;
    @NotEmpty(message = ValidationConstants.fatPercentageRequired)
    private double fatPercentage;
}
