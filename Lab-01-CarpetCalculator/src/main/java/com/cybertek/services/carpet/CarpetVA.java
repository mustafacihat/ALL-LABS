package com.cybertek.services.carpet;


import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

@Component
public class CarpetVA implements Carpet {

    @Override
    public double getUnitPrice(City city) {
        try {
            UNIT_PRICES.put(City.FAIRFAX, City.FAIRFAX.getUnitPrice());
            UNIT_PRICES.put(City.ARLINGTON, City.ARLINGTON.getUnitPrice());
            UNIT_PRICES.put(City.MCLEAN, City.MCLEAN.getUnitPrice());
            if (!(city.equals(City.FAIRFAX) || city.equals(City.ARLINGTON) || city.equals(City.MCLEAN))) {
                throw new Exception("THE CITY IS ALREADY NOT DEFINED OR NOT DEFINED IN THIS STATE");
            } else {
                return UNIT_PRICES.get(city);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return UNIT_PRICES.get(city);
    }
}



