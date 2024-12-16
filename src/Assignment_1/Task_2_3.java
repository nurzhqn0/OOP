package Assignment_1;

import java.util.Scanner;

public class Task_2_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double bodyTemperature = in.nextDouble();
        boolean isHigh, isLow;

        isHigh = bodyTemperature > 37.5;
        isLow = bodyTemperature < 36.0;

        if (isHigh) {
            System.out.println("Body temperature is high.");
        } else if (isLow) {
            System.out.println("Body temperature is low.");
        } else {
            System.out.println("Body temperature is normal.");
        }

        in.close();
    }
}
