package com.yearup.Contracting;

public class SalesContract extends Contract {

    private final static double salesTaxAmount = 0.05;
    private final static double recordingFee = 100;
    private double processingFee;
    private boolean isFinancing = false;
    private double monthlyPaymentIfFinanced;

    public SalesContract() {

    }

    public SalesContract(boolean isFinancing) {
        this.isFinancing = isFinancing;
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
