package com.a2.pocketA3.features.auth.controller;

import com.a2.pocketA3.constants.GenericSuccessResponse;
import com.a2.pocketA3.constants.ResponseMessageConstants;
import com.a2.pocketA3.features.auth.dto.*;
import com.a2.pocketA3.features.auth.enums.GenderType;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import com.a2.pocketA3.features.auth.enums.MaritalStatus;
import com.a2.pocketA3.features.auth.enums.Occasion;
import com.a2.pocketA3.features.auth.services.RegisterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping(value = "register")
@RestController
@RequiredArgsConstructor
public class RegisterController {

    private RegisterService registerService;

    @PostMapping(value = "s1-add-email")
    public void registerEmail(@RequestBody @Valid RegisterEmailRequest request) {

    }

    @PostMapping(value = "s2-verify-otp")
    public void verifyOTP(@RequestBody @Valid RegisterEmailRequest request) {

    }

    @PostMapping(value = "s2-resend-otp")
    public void resendOTP(@RequestBody @Valid RegisterResendOTPRequest request) {

    }


    @PostMapping(value = "s3-first-details")
    public void setFirstDetails(@RequestBody @Valid RegisterFirstDetailsRequest request) {

    }

    @PostMapping(value = "s4-second-details")
    public void setSecondDetails(@RequestBody @Valid RegisterSecondDetailsRequest request) {

    }

    @PostMapping(value = "s5-third-details")
    public void setThirdDetails(@RequestBody @Valid RegisterFinalDetailsRequest request) {

    }

    @PostMapping(value = "s6-set-password")
    public void setPassword(@RequestBody @Valid RegisterSetPasswordRequest request) {

    }


    @GetMapping(value = "available-gender")
    public GenericSuccessResponse<List<GenderType>> availableGender() {
        var value = Arrays.stream(GenderType.values()).toList();
        return new GenericSuccessResponse<>(value, ResponseMessageConstants.genericSuccess);
    }

    @GetMapping(value = "available-marital-status")
    public GenericSuccessResponse<List<MaritalStatus>> availableMaritalStatus() {
        var value = Arrays.stream(MaritalStatus.values()).toList();
        return new GenericSuccessResponse<>(value, ResponseMessageConstants.genericSuccess);
    }

    @GetMapping(value = "available-MBTI")
    public GenericSuccessResponse<List<MBTIType>> availableMBTI() {
        var value = Arrays.stream(MBTIType.values()).toList();
        return new GenericSuccessResponse<>(value, ResponseMessageConstants.genericSuccess);
    }


    @GetMapping(value = "available-occasion")
    public GenericSuccessResponse<List<Occasion>> availableOccasion() {
        var value = Arrays.stream(Occasion.values()).toList();
        return new GenericSuccessResponse<>(value, ResponseMessageConstants.genericSuccess);
    }


}
