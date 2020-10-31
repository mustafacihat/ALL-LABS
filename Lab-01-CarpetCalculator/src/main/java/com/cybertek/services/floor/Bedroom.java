package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Floor {

    @Value("${side}")
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }
}
