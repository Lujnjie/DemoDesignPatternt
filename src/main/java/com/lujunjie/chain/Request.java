package com.lujunjie.chain;

import java.util.Objects;

public class Request {
    private RequestType requestType;
    private String desc;

    public Request(final RequestType requestType, final String desc) {
        this.requestType = Objects.requireNonNull(requestType);
        this.desc = Objects.requireNonNull(desc);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return getDesc();
    }
}
