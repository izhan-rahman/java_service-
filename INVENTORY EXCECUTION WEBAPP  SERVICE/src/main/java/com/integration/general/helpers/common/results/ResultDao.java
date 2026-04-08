package com.integration.general.helpers.common.results;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ResultDao {
    private Object results;
    private String message;
    private List<plantList> plantlist;
}
