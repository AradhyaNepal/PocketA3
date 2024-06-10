package com.a2.pocketA3.features.auth.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseRegisterStepRequest {
    private String referenceId;
    private String otp;
}
