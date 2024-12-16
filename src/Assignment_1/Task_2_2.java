package Assignment_1;

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        int age = in.nextInt();

        if(age >= 18 && age <= 28){
            System.out.println(name + ", come to the military registration and enlistment office");
        }
    }
}
