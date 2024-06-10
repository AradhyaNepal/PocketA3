package com.a2.pocketA3.features.auth.dto;


public class RegisterOTPValidateRequest extends BaseRegisterStepRequest {


    public RegisterOTPValidateRequest(String referenceId, String otp) {
        super(referenceId, otp);
    }
}
