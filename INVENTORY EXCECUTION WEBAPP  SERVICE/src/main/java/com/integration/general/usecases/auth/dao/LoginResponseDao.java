package com.integration.general.usecases.auth.dao;

import com.integration.general.helpers.common.results.ResultPlantListDao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseDao {
    private Boolean status;
    private ResultPlantListDao result;
}
