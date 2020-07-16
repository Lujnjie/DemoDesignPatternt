package com.lujunjie.chain;

public class RequestBuild {

    private RequestHandle handle;

    public RequestBuild() {
        buildHandle();
    }

    private void buildHandle() {
        handle = new PostRequestHandle(new GetRequestHandle(null));
    }

    protected void processHandle(Request request) {
        handle.handleRequest(request);
    }
}
