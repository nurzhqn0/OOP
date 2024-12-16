package Assignment_1;

import java.util.Scanner;

public class Task_2_3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while(true){
            String n = in.nextLine();

            if(n.equals("ENTER")){
                break;
            } else{
                sum += Integer.parseInt(n);
            }
        }

        System.out.println(sum);
        in.close();
    }
}
