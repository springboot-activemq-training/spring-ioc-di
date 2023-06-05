package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public interface Computer {
    void powerOn();

    void powerOff();

}
