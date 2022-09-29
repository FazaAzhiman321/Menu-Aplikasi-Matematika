
package percabangan;
import java.util.Scanner;

public class Matematika {
     public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        int pilihan;
        double angka1, angka2, hasil = 0;
        String operator = "";
        
        System.out.println("Menu Aplikasi Matematika :");
        System.out.print("1. Penambahan" + '\n' + "2. Pengurangan" + '\n' + "3. Perkalian" + '\n' + "4. Pembagian" + '\n');
        System.out.print("Pilih Menu = ");
        pilihan = nilai.nextInt();
        
      if (pilihan > 0 && pilihan < 5){
          System.out.print("Masukkaan angka pertama = ");
         angka1 = nilai.nextDouble();
          System.out.print("Masukkan angka kedua = ");
          angka2 = nilai.nextDouble();
          if(pilihan == 1){
              operator ="penambahan";
              hasil = angka1 + angka2;}
          else if(pilihan == 2){
              operator ="pengurangan";
              hasil = angka1 - angka2;
          } else if(pilihan == 3){
              operator ="perkalian";
              hasil = angka1*angka2;
          } else if(pilihan == 4){
              operator ="pembagian";
              hasil = angka1 / angka2;        
          }
              System.out.println("Hasil "+ operator +" antara "+ angka1+" dan "+angka2+" adalah "+hasil);
          } else {
             System.out.println("Maaf pilihan Anda Tidak Tersedia");
      }
         
      }
    }   

