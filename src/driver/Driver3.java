package driver;

import model.JadwalLaundry;
import java.util.Scanner;

public class Driver3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("=== SISTEM LAUNDRY DEL ===");
        System.out.print("Nama: "); String nama = sc.nextLine();
        System.out.print("Asrama: "); String asrama = sc.nextLine();
        System.out.print("Hari: "); String hari = sc.nextLine();
        System.out.print("Berat (kg): "); double berat = sc.nextDouble();

        JadwalLaundry laundry = new JadwalLaundry(nama, asrama, berat, hari);
        laundry.tampilkanDetail();
  }  
}
