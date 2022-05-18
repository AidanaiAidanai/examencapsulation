package com.company;

public class Phone {
    private String name;
    private int price;
    private String model;
    void fuu(){
        System.out.println("you can call me with his phone");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.contains(".")){
            System.out.println("write the any simvols");
        }else{
        this.name = name;}
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price<0){
            System.out.println("this is wrong");
        }else
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.isEmpty()){
            System.out.println("not be empty");
        }else{
        this.model = model;
    }
    }
}
