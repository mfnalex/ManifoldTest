package test;

import manifold.ext.rt.api.Jailbreak;

public class Main {

    public static void main(String[] args) {
        @Jailbreak ClassWithPrivateField classWithPrivateField = new ClassWithPrivateField();
        System.out.println(classWithPrivateField.privateField);
    }
}
