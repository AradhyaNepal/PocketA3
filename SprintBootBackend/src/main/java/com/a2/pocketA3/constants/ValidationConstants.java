package com.a2.pocketA3.constants;

import com.a2.pocketA3.features.auth.enums.MBTIType;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDate;

public class ValidationConstants {
    public static final String fullNameRequired = "Full name is Required";
    public static final String passwordRequired = "Password is Required";
    public static final String passwordRegex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[\\sA-Za-z\\d@$!%*?&]+$";
    public static final String passwordRegexMessage = "Password must have one upper case, one lower case, one symbol and one digit";
    public static final int passwordMinLength = 8;
    public static final String passwordMinLengthMessage = "Password must be 8 character long";

    public static final String genderRequired = "Gender is Required";
    public static final String nickNotRequired = "Nick name is Required";
    public static final String emailNotValid = "Please enter valid email";
    public static final String emailRequired = "Email is Required";
    public static final String referenceIdRequired = "Reference id is Required";
    public static final String otpRequired = "OTP is Required";
    public static final String birthDateRequired = "BirthDate is Required";
    public static final String countryRequired = "Country is Required";
    public static final String mbtiTypeRequired = "MBTI type is Required";
    public static final String heightRequired = "Height is Required";
    public static final String weightRequired = "Weight is Required";
    public static final String fatPercentageRequired = "Fat Percentage Required";
    public static final String profileRequired = "Profile Required";
}
