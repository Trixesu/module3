package AlproModule3;

import java.util.Scanner;

public class Soal5BeratIdeal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Anda               : ");
        String nama = input.nextLine();
        
        System.out.print("Tinggi Badan Anda (Cm)  : ");
        int tinggiBadan = input.nextInt();
        
        int beratIdeal = tinggiBadan - 100;
        
        System.out.println("Berat Ideal Anda Adalah : "+beratIdeal);

        input.close();
    }
}
