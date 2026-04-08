package com.alphabit.isbnscanner.helpers.common.results;

import java.util.List;

public class ResultDao {
    private Object results;
    private String message;
    private List<plantList> plantlist;

    public Object getResults() { return results; }
    public void setResults(Object results) { this.results = results; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public List<plantList> getPlantlist() { return plantlist; }
    public void setPlantlist(List<plantList> plantlist) { this.plantlist = plantlist; }
}
