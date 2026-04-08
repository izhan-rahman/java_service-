package com.integration.general.helpers.exception.custom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
    private String message;

    public ResourceNotFoundException() {
        super();
    }
    public ResourceNotFoundException(String message) {
        super();
        this.message = message;
    }
}
