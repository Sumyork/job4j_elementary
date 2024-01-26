package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input1 = 140;
        float expected1 = 2;
        float output1 = Converter.rubleToEuro(input1);
        boolean passed1 = expected1 == output1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float input2 = 180;
        float expected2 = 3;
        float output2 = Converter.rubleToDollar(input2);
        boolean passed2 = expected2 == output2;
        System.out.println("180 rubles are 3. Test result : " + passed2);
    }
}
