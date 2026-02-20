package com.example.hcc.cognito;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdminDeleteUserRequestModel {

    private String email;

}
