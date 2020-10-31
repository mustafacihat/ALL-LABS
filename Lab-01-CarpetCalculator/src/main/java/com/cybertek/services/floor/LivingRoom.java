package com.cybertek.services.floor;

import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Floor {

    @Value("${width}")
    private double width;
    @Value("${length}")
    private double length;

    @Override
    public double getArea() {
        return width*length;
    }
}
