package com.thepinkdev.navaidjagf.enums;

public enum ErrorHandler {

    ERROR_GETTING_WEATHERINFO("E01", "Error getting weather info from Open Weather API");

    private String errorCode;
    private String description;

    private ErrorHandler(String errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getDescription() {
        return this.description;
    }
    
}
