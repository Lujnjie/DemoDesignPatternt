package com.lujunjie.command;

public class Light {

    private String descriptor;

    public String getDescriptor() {
        return descriptor;
    }

    public Light(String descriptor) {
        this.descriptor = descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public void on() {
        System.out.println(this.descriptor + " light is on");
    }

    public void off() {
        System.out.println(this.descriptor + "light is off");
    }
}
