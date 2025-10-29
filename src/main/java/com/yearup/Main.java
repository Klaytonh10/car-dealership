package com.yearup;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //Load Cars into list
        DealershipFileManager dfm = new DealershipFileManager();
        DealerShip dealerShip = new DealerShip();
        dfm.getDealership();
        dfm.saveDealership(dealerShip);
        dealerShip.getAllVehicles();
    }
}