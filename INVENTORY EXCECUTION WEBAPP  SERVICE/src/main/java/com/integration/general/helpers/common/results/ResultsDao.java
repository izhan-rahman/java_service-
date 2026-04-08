package com.integration.general.helpers.common.results;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResultsDao {
    private Object results;
    private int pageNumber;
    private int pageSize;
    private String message;
    private int totalCount;
    private double totalAmount;
}
