package com.a2.pocketA3.features.auth.services;

import com.a2.pocketA3.features.auth.dto.*;
import com.a2.pocketA3.features.auth.enums.GenderType;
import com.a2.pocketA3.features.auth.enums.MBTIType;
import com.a2.pocketA3.features.auth.enums.MaritalStatus;
import com.a2.pocketA3.features.auth.enums.Occasion;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RegisterService {
    public RegisterToSendOTPResponse registerToSendOTP(RegisterEmailRequest request) {
        return new RegisterToSendOTPResponse("12345");
    }

    public RegisteringUserDetailsResponse registerOTPValidate(RegisterOTPValidateRequest request) {
        return new RegisteringUserDetailsResponse("aaaaa");
    }

    public RegisteringUserDetailsResponse registerFirstDetails(RegisterFirstDetailsRequest request) {
        return new RegisteringUserDetailsResponse("aaaaa");
    }

    public RegisteringUserDetailsResponse registerSecondDetails(RegisterSecondDetailsRequest request) {
        return new RegisteringUserDetailsResponse("aaaaa");
    }

    public RegisteringUserDetailsResponse registerThirdDetails(RegisterFinalDetailsRequest request) {
        return new RegisteringUserDetailsResponse("aaaaa");
    }

    public AuthResponse setPassword(RegisterSetPasswordRequest request) {
        return new AuthResponse(
                "",
                ""
        );
    }

    public List<GenderType> genderType() {
        return Arrays.stream(GenderType.values()).toList();
    }

    public List<Occasion> occasions() {
        return Arrays.stream(Occasion.values()).toList();
    }

    public List<MaritalStatus> maritalStatuses() {
        return Arrays.stream(MaritalStatus.values()).toList();
    }

    public List<MBTIType> mbtiTypes() {
        return Arrays.stream(MBTIType.values()).toList();
    }


}
