package com.lujunjie.chain;

public class GetRequestHandle extends RequestHandle{
    public GetRequestHandle(RequestHandle next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.GET)) {
            printHandling(request);
        } else {
            super.handleRequest(request);
        }
    }
}
