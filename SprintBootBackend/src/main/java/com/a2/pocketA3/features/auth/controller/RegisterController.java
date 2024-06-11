package com.a2.pocketA3.features.auth.controller;

import com.a2.pocketA3.features.auth.dto.*;
import com.a2.pocketA3.features.auth.services.RegisterService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "register")
@RestController
@AllArgsConstructor
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


}
