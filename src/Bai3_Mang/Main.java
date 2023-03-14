package Bai3_Mang;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[50];
        Array.addToArray(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
        min=arr[0];
        if (arr[i]<min)
            min=arr[i];
            if (arr[i]>max)
                max=arr[i];
    }
        System.out.println("Số Nhỏ Nhất là :"+min);
        System.out.println("Sô Lớn nhất là"+max);

        System.out.println("Dãy số được sắp xếp tăng dần: \n");
        sortASC(arr);
        show(arr);

        int count=0;

for (int i=0;i<arr.length;i++){
    if (laSoNguyenTo(arr[i])){
        System.out.println("Các số Nguyên tố có trong mảng : "+ arr[i]);
    count++;}
}
        System.out.println("Tổng số nguyên tố là :"+ count);


    }
    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public  static boolean laSoNguyenTo(int n)
    {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt (n); i ++)
            if (n% i == 0) return false;
        return true;
    }

}
