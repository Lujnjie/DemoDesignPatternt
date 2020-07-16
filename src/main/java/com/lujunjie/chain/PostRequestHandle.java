package com.lujunjie.chain;

public class PostRequestHandle extends RequestHandle {

    public PostRequestHandle(RequestHandle next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.POST)) {
            printHandling(request);
        } else {
            super.handleRequest(request);
        }
    }
}
