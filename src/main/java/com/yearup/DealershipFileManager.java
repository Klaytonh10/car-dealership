package com.yearup;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    static String file = "src/main/resources/inventory2.csv";
    ArrayList<DealerShip> dealerShips = new ArrayList<>();

    //responsible for reading the dealership file,
    //parsing the data, and creating a Dealership object full of vehicles from the
    //file

    public DealerShip getDealership() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String input;
        int titleCount = 0;
        DealerShip dealerShip = new DealerShip();
        while ((input = reader.readLine()) != null) {
            String[] sections = input.split("\\|");
            if (titleCount == 0) {
                String title = sections[0];
                String address = sections[1];
                String phone = sections[2];
                dealerShip.setName(title);
                dealerShip.setAddress(address);
                dealerShip.setPhone(phone);
                ++titleCount;
            } else {
                int vin = Integer.parseInt(sections[0]);
                int year = Integer.parseInt(sections[1]);
                String make = sections[2];
                String model = sections[3];
                String vehicleType = sections[4];
                String color = sections[5];
                int odometer = Integer.parseInt(sections[6]);
                double price = Double.parseDouble(sections[7]);
                dealerShip.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }
        }
        //System.out.println("\n" + dealerShip.getName() + " created! \nWould you like to save this dealership?\n");
        return dealerShip;
    }


    // this could be completely wrong so let's not touch that right now
    public void saveDealership(DealerShip dealerShip) throws IOException {
        dealerShips.add(dealerShip);
        List<Vehicle> vehicles = dealerShip.getAllVehicles();

        FileWriter writer = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for(DealerShip thisDealership : dealerShips){
            String titleString = dealerShip.getName() + "|" + dealerShip.getAddress() + "|" + dealerShip.getPhone();
            bufferedWriter.write(titleString);
            bufferedWriter.newLine();
            for (Vehicle vehicle : vehicles) {
                String dealString = vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getOdometer() + "|" + vehicle.getPrice();
                bufferedWriter.write(dealString);
                bufferedWriter.newLine();
            }
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        System.out.println(dealerShip.getName() + " saved!\n");
    }
}


