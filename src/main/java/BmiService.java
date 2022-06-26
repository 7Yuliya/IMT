package com.example.imt;

public class BmiService {


    public double calculate(int weight, double growth) {
        double growth2;
        growth2 = Math.pow(growth, 2);
        double IMT = weight / growth2;


        return IMT;
    }
}