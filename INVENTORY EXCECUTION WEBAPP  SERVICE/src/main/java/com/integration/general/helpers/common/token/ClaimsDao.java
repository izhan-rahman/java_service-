package com.integration.general.helpers.common.token;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClaimsDao {
    private String iat;
    private String sub;
    private String exp;
    private String plt;
    private String eid;
    private String unt;
    private String usr;
}
