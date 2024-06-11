package com.a2.pocketA3.features.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String accessKey;
    private String refreshKey;
}
