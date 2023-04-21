package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {
    public static void main(String[] args) {
        System.out.println("current number of washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        WashMachine samsung = new WashMachine("Samsung", "1x2");
        System.out.println("Current number of created washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung serial number is: " + samsung.getSerialNumber());
        samsung.setSerialNumber(5);
        System.out.println("samsung serial number is: " + samsung.getSerialNumber());
        // DO NOT USE INSTANCE REFERENCES TO ACCESS STATIC MEMBERS (FIELDS/METHODS), example: samsung.set ..
        WashMachine.setNumberOfCreatedMachines(1000);
        samsung.increaseSerialNumber();
        samsung.increaseSerialNumber();
        System.out.println("samsung serial number is: " + samsung.getSerialNumber());

        WashMachine samsung2 = new WashMachine("Samsung", "1x2");
        System.out.println("Current number of created washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung2 serial number is: " + samsung2.getSerialNumber());

        for (int i = 0; i < 10; i++) {
            makeSomeWashMachines();
        }

        // some generic way to obtain number of produced washing machines
        System.out.println("Hey we've made lots of wash machines: " + WashMachine.getNumberOfCreatedMachines());
    }
    public static void makeSomeWashMachines() {
        new WashMachine("LG", "1111");
        new WashMachine("LG", "112");
        new WashMachine("LG", "113451");
        new WashMachine("LG", "14551");
        new WashMachine("LG", "114555");
    }
}