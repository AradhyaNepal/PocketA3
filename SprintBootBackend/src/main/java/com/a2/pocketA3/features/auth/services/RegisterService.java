package com.a2.pocketA3.features.auth.services;

import com.a2.pocketA3.features.auth.dto.*;

public class RegisterService {
    public String registerEmail(RegisterEmailRequest request){
        return "";
    }

    public  String registerStep(BaseRegisterStepRequest stepRequest){
        if(stepRequest instanceof RegisterFirstDetailsRequest){
            return  "";
        }else if(stepRequest instanceof RegisterSecondDetailsRequest){
            return  "";
        }else if(stepRequest instanceof RegisterFinalDetailsRequest){
            return  "";
        }
        return  "";
    }
}
