package com.company;

public class Main {

    public static void main(String[] args) {
	// инкапсуляция
        Phone phone = new Phone();
        phone.setName("samsung.");
        phone.setPrice(12000);
        phone.setModel("");
        phone.fuu();
        System.out.println(phone.getName()+"\n"+phone.getPrice()+"\n"+phone.getModel());

    }
}
