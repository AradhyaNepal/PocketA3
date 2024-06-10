package com.a2.pocketA3.features.auth.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseRegisterStepRequest {
    private String referenceId;
    private String otp;
}
