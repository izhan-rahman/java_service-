package com.integration.general.usecases.auth.dao;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    private String token;
    private String user_id;
    private String plant;
}
