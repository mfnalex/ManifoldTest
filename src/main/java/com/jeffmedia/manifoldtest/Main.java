package com.jeffmedia.manifoldtest;

import manifold.ext.rt.api.Jailbreak;

public class Main {

    public static void main(String[] args) {
        @Jailbreak ClassWithPrivateField object = new ClassWithPrivateField();
        System.out.println(object.privateField);
    }
}
