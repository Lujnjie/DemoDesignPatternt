package com.lujunjie.chain;

public class RequestHandle {

    private final RequestHandle next;

    public RequestHandle(final RequestHandle next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("not support request");
        }
    }

    public void printHandling(Request request) {
        System.out.println(request);
    }
}
