package TinhCanChi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập Số tuổi");
        int input  =scanner.nextInt();
        int namsinh=2023-input;

       String can= TinhCanChi.TinhCan(namsinh);
       String chi= TinhCanChi.tinhChi(namsinh);
        System.out.println("Can Chi cuả bạn là: "+can+" "+chi);
    }
}
