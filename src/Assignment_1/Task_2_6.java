package Assignment_1;

import java.util.Scanner;

public class Task_2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true){
           String number = in.nextLine();

           if(number.equals("ENTER")) {
               break;
           }

           sum += Integer.parseInt(number);
        }

        System.out.println(sum);

        in.close();
    }
}
