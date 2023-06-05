package org.example;

public class LaptopComputer  implements Computer{
    private  String brand;

    public void powerOn() {
        System.out.println("Laptop Computer is booting...");
    }
    public void powerOff() {
        System.out.println("Laptop Computer is shutting down...");
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        System.out.println(
                "Computer brand is set to " + brand
        );
        this.brand = brand;
    }
}
