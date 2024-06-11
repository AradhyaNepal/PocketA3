package com.a2.pocketA3.features.auth.controller;

import com.a2.pocketA3.constants.GenericResponse;
import com.a2.pocketA3.features.auth.dto.*;
import com.a2.pocketA3.features.auth.enums.GenderType;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import com.a2.pocketA3.features.auth.enums.MaritalStatus;
import com.a2.pocketA3.features.auth.enums.Occasion;
import com.a2.pocketA3.features.auth.services.RegisterService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RequestMapping(value = "register")
@RestController
@AllArgsConstructor
public class RegisterController {

    private RegisterService registerService;

    @PostMapping(value = "s1-register-to-send-otp")
    public ResponseEntity<GenericResponse<RegisterToSendOTPResponse>> registerToSendOTP(@RequestBody @Valid RegisterEmailRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.registerToSendOTP(request)));
    }

    @PostMapping(value = "s2-verify-otp")
    public ResponseEntity<GenericResponse<RegisteringUserDetailsResponse>> verifyOTP(@RequestBody @Valid RegisterOTPValidateRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.registerOTPValidate(request)));

    }

    @PostMapping(value = "s3-first-details")
    public ResponseEntity<GenericResponse<RegisteringUserDetailsResponse>> setFirstDetails(@RequestBody @Valid RegisterFirstDetailsRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.registerFirstDetails(request)));
    }

    @PostMapping(value = "s4-second-details")
    public ResponseEntity<GenericResponse<RegisteringUserDetailsResponse>> setSecondDetails(@RequestBody @Valid RegisterSecondDetailsRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.registerSecondDetails(request)));
    }

    @PostMapping(value = "s5-third-details")
    public ResponseEntity<GenericResponse<RegisteringUserDetailsResponse>> setThirdDetails(@RequestBody @Valid RegisterFinalDetailsRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.registerThirdDetails(request)));
    }

    @PostMapping(value = "s6-set-password")
    public ResponseEntity<GenericResponse<AuthResponse>> setPassword(@RequestBody @Valid RegisterSetPasswordRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.setPassword(request)));
    }


    @GetMapping(value = "available-gender")
    public ResponseEntity<GenericResponse<List<GenderType>>> availableGender() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.genderType()));
    }

    @GetMapping(value = "available-marital-status")
    public ResponseEntity<GenericResponse<List<MaritalStatus>>> availableMaritalStatus() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.maritalStatuses()));
    }

    @GetMapping(value = "available-MBTI")
    public ResponseEntity<GenericResponse<List<MBTIType>>> availableMBTI() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.mbtiTypes()));
    }


    @GetMapping(value = "available-occasion")
    public ResponseEntity<GenericResponse<List<Occasion>>> availableOccasion() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(GenericResponse.success(registerService.occasions()));
    }


}
