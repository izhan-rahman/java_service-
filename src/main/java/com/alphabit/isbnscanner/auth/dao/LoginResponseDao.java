package com.alphabit.isbnscanner.auth.dao;

import com.alphabit.isbnscanner.helpers.common.results.ResultPlantListDao;

public class LoginResponseDao {
    private Boolean status;
    private ResultPlantListDao result;

    public Boolean getStatus() { return status; }
    public void setStatus(Boolean status) { this.status = status; }
    public ResultPlantListDao getResult() { return result; }
    public void setResult(ResultPlantListDao result) { this.result = result; }
}
