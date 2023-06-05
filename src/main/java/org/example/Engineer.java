package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engineer {

    @Autowired
    @Qualifier("laptop")
    private Computer computer;

    public Engineer() {
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Engineer(Computer computer) {
        this.computer = computer;
    }

    public void designAlgorith() {
        System.out.println("Engineer is designing algorithm");
    }

    public void developAlgorithm() {
        computer.powerOn();
        System.out.println("Engineer is developing algorithm");
    }

}
