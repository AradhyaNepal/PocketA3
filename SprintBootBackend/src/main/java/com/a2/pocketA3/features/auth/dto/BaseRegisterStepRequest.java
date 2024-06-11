package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
sealed public abstract class BaseRegisterStepRequest permits RegisterFinalDetailsRequest, RegisterFirstDetailsRequest, RegisterSecondDetailsRequest {
    @NotEmpty(message = ValidationConstants.referenceIdRequired)
    private String referenceId;
    @NotEmpty(message = ValidationConstants.otpRequired)
    private String otp;
}
