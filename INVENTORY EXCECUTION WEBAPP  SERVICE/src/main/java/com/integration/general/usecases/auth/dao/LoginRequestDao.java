package com.integration.general.usecases.auth.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestDao {
    private String email;
    private String password;
    private String plant;
}
