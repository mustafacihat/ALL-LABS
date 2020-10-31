package com.cybertek.enums;

import lombok.Getter;

@Getter
public enum City {
    DALLAS(9.1),
    AUSTIN(8.2),
    SAN_ANTONIO(7.1),
    ARLINGTON(5.1),
    FAIRFAX(5.7),
    MCLEAN(6.1);

    private final double unitPrice;

    City(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
