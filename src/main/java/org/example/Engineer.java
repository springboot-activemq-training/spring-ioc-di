package org.example;

public class Engineer {

    public Engineer(){

    }

    private  Field field;
    private Computer computer;

    public Engineer(Field field, Computer computer) {
        this.field = field;
        this.computer = computer;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void designAlgorithms() {
        System.out.println("Engineer is designing Algorithms");
    }

    public void developAlgorithms() {
        computer.powerOn();
        System.out.println("Engineer is developing Algorithms");
    }
}
