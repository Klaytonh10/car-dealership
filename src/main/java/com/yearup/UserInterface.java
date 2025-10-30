package com.yearup;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

public class UserInterface {

    private DealerShip dealerShip;
    private boolean isRunning = false;

    public UserInterface() {

    }

    private void init() throws IOException {
        DealershipFileManager dfm = new DealershipFileManager();
        this.dealerShip = dfm.getDealership();
    }

    public void display() {
        try {
            init();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        isRunning = true;
        //while(isRunning) {
        //    System.out.println("""
        //            Fairly Reliable Car Dealership
        //
        //
        //            """);
        //}
        processGetAllVehiclesRequest();

    }

    private void displayVehicles(List<Vehicle> inventory) {
        DecimalFormat formater = new DecimalFormat(".00");
        String output;
        for (Vehicle vehicle : inventory) {
            output = "Price: $"+ formater.format(vehicle.getPrice()) + ", Year: " + vehicle.getYear() + ", Make: " + vehicle.getMake() + ", Model: " + vehicle.getModel() + ", Color: " + vehicle.getColor() + ", Miles: " + vehicle.getOdometer();
            System.out.println(output);
        }
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
        List<Vehicle> inventory = this.dealerShip.getAllVehicles();
        displayVehicles(inventory);
    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }
}
