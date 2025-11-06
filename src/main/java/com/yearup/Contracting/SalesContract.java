package com.yearup.Contracting;

import com.yearup.Vehicle;

public class SalesContract extends Contract {

    private final static double salesTaxAmount = 0.05;
    private final static double recordingFee = 100;
    private final double processingFeeUnder = 295;
    private final double processingFeeOver = 495;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(dateOfContract, customerName, customerEmail, vehicleSold);
    }

    public double getProcessingFee() {
        return 0;
    }

    public static double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public static double getRecordingFee() {
        return recordingFee;
    }

    @Override
    public double getTotalPrice(){
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }

}
