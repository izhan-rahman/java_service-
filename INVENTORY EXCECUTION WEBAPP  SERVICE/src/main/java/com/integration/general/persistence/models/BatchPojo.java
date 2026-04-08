package com.integration.general.persistence.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatchPojo {
    private int doLineNo;
    private String batch;
    private String location;
}
