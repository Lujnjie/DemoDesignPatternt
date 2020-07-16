package com.lujunjie.chain;

public class App {
    public static void main(String[] args) {
        RequestBuild requestBuild = new RequestBuild();
        requestBuild.processHandle(new Request(RequestType.GET, "get request"));
        requestBuild.processHandle(new Request(RequestType.POST, "post request"));
        requestBuild.processHandle(new Request(RequestType.DELETE, "post request"));
    }
}
