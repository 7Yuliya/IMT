package com.example.imt;
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75; // килограмм
        double growth = 1.8; // метр(а)

        double myIMT = service.calculate(weight, growth);

        System.out.println("ИМТ: " + myIMT + "кг/м^2");
    }
}
