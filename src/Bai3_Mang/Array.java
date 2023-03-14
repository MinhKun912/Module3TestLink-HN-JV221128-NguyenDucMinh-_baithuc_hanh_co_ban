package Bai3_Mang;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void  addToArray(int[] array){
        int n;
        Scanner scanner=new Scanner(System.in);
        n=50;
        Random random=new Random();
        for(int i=1;i<n;i++){
            array[i]=random.nextInt(200);
        }

    }
}
