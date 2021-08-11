package com.tpt.sportwagertpt.Models.API;

import java.util.List;

public class Response {
    List<Object> data;
    List<String[]> errors;

    public Response() {
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public List<String[]> getErrors() {
        return errors;
    }

    public void setErrors(List<String[]> errors) {
        this.errors = errors;
    }
}
