package Bai2_TinhTongSoChan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập 1 số bất kì");
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer += i;
            }
        }
        System.out.println("Tông của tất cả số chẵn từ 0 -> "+n+"là :"+ answer );
    }
}
