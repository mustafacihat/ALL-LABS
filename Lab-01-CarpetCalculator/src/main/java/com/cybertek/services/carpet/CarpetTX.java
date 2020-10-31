package com.cybertek.services.carpet;


import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

@Component
public class CarpetTX implements Carpet {


    @Override
    public double getUnitPrice(City city) {
        try{
            UNIT_PRICES.put(City.DALLAS, City.DALLAS.getUnitPrice());
            UNIT_PRICES.put(City.AUSTIN, City.AUSTIN.getUnitPrice());
            UNIT_PRICES.put(City.SAN_ANTONIO, City.SAN_ANTONIO.getUnitPrice());
            if (!(city.equals(City.AUSTIN) || city.equals(City.DALLAS) || city.equals(City.SAN_ANTONIO))) {
                throw new Exception("THE CITY IS ALREADY NOT DEFINED OR NOT DEFINED IN THIS STATE");
           } else {
                return UNIT_PRICES.get(city);
            }
        } catch(Exception e){
                e.printStackTrace();
            }


        return UNIT_PRICES.get(city);

    }
}
