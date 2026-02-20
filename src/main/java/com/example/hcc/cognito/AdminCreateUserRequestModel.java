package com.example.hcc.cognito;

import com.example.hcc.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class AdminCreateUserRequestModel {

    private String email;

    private String password;

    private List<Role> groups;

}
