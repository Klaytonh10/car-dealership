package com.yearup;

import java.io.IOException;

public class UserInterface {

    DealerShip dealerShip;

    public UserInterface() {

    }

    private DealerShip init() throws IOException {
        DealershipFileManager dfm = new DealershipFileManager();
        DealerShip dealerShip = new DealerShip();
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
