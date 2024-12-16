package Assignment_1;

import java.util.Scanner;

public class Task_2_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt(), end = in.nextInt(), multiple = in.nextInt();

        int sum = 0;

        for(int i = start; i < end; i++){
            if(i % multiple != 0){
                continue;
            }
            sum += i;
        }

        System.out.println(sum);

        in.close();
    }
}
