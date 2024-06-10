package com.a2.pocketA3.features.auth.dto;

import com.a2.pocketA3.constants.ValidationConstants;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RegisterResendOTPRequest {
    @NotEmpty(message = ValidationConstants.referenceIdRequired)
    private String referenceId;
}
