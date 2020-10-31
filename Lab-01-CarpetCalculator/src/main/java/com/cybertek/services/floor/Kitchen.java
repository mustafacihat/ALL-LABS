package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {

    @Value("${radius}")
    private double radius;
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
