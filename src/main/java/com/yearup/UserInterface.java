package com.yearup;

import java.io.IOException;

public class UserInterface {

    DealerShip dealerShip;

    public UserInterface() {

    }

    private DealerShip init() throws IOException {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        DealerShip dealerShip = dealershipFileManager.getDealership();
        return dealerShip;
    }

    public void display() {

    }

    public void processGetByPriceRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }
}
