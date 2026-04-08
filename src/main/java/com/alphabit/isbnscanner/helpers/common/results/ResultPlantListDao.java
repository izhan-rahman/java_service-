package com.alphabit.isbnscanner.helpers.common.results;

import java.util.List;

public class ResultPlantListDao {
    private boolean loginstatus;
    private List<plantList> plantlist;

    public boolean isLoginstatus() { return loginstatus; }
    public void setLoginstatus(boolean loginstatus) { this.loginstatus = loginstatus; }
    public List<plantList> getPlantlist() { return plantlist; }
    public void setPlantlist(List<plantList> plantlist) { this.plantlist = plantlist; }
}
