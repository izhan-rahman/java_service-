package com.integration.general.helpers.common.results;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResultPlantListDao {
    private boolean loginstatus;
    private List<plantList> plantlist;
}
