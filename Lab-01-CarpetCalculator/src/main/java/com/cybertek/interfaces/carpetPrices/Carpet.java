package com.cybertek.interfaces.carpetPrices;


import com.cybertek.enums.City;

import java.util.HashMap;
import java.util.Map;

public interface Carpet {

    Map<City,Double> UNIT_PRICES= new HashMap<>();

    double getUnitPrice(City city);
}
