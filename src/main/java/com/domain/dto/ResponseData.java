package com.domain.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {
    private boolean status;
    private List<String> messege = new ArrayList<>();
    private T payload;
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public List<String> getMessege() {
        return messege;
    }
    public void setMessege(List<String> messege) {
        this.messege = messege;
    }
    public T getPayload() {
        return payload;
    }
    public void setPayload(T payload) {
        this.payload = payload;
    }

    

}
