package Assignment_1;

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperature = in.nextInt();

        if(temperature < 0){
            System.out.println("it’s cold outside");
        } else{
            System.out.println("it’s warm outside");
        }
    }
}
