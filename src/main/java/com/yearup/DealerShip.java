package com.yearup;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class DealerShip {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public DealerShip() {}

    public DealerShip(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public List<Vehicle> getVehicleByPrice(int min, int max) {
        ArrayList<Vehicle> carsInRange = new ArrayList<>();

        for(Vehicle vehicle : inventory) {
            if(min <= vehicle.getPrice() && vehicle.getPrice() <= max) {
                carsInRange.add(vehicle);
            }
        }

        return carsInRange;
    }

    public List<Vehicle> getVehicleByYear(int min, int max) {
        ArrayList<Vehicle> carsInRange = new ArrayList<>();

        for(Vehicle vehicle : inventory) {
            if(min <= vehicle.getYear() && vehicle.getYear() <= max) {
                carsInRange.add(vehicle);
            }
        }

        return carsInRange;
    }

    public List<Vehicle> getVehicleByMileage(int min, int max) {
        ArrayList<Vehicle> carsInRange = new ArrayList<>();

        for(Vehicle vehicle : inventory) {
            if(min <= vehicle.getOdometer() && vehicle.getOdometer() <= max) {
                carsInRange.add(vehicle);
            }
        }

        return carsInRange;
    }

    public List<Vehicle> getVehicleByMakeModel(String make, String model) {
        ArrayList<Vehicle> carsInRange = new ArrayList<>();

        for(Vehicle vehicle : inventory) {
            if(vehicle.getMake().trim().equalsIgnoreCase(make) && vehicle.getModel().trim().equalsIgnoreCase(model)) {
                carsInRange.add(vehicle);
            }
        }

        return carsInRange;
    }

    public List<Vehicle> getVehicleByColor(String color) {
        ArrayList<Vehicle> carsInRange = new ArrayList<>();

        for(Vehicle vehicle : inventory) {
            if(vehicle.getColor().trim().equalsIgnoreCase(color)) {
                carsInRange.add(vehicle);
            }
        }

        return carsInRange;
    }

    public List<Vehicle> getVehicleByType(String type) {
        ArrayList<Vehicle> carsInRange = new ArrayList<>();

        for(Vehicle vehicle : inventory) {
            if(vehicle.getVehicleType().trim().equalsIgnoreCase(type)) {
                carsInRange.add(vehicle);
            }
        }

        return carsInRange;
    }

    public void getAllVehicles() {
        DecimalFormat formater = new DecimalFormat(".00");
        String output;
        for (Vehicle vehicle : inventory) {
            output = "Price: $"+ formater.format(vehicle.getPrice()) + ", Year: " + vehicle.getYear() + ", Make: " + vehicle.getMake() + ", Model: " + vehicle.getModel() + ", Color: " + vehicle.getColor() + ", Miles: " + vehicle.getOdometer();
            System.out.println(output);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        inventory.remove(vehicle);
    }

}
