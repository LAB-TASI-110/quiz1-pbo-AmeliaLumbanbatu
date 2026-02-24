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

package model;

public class JadwalLaundry {
    private String nama, asrama, hari;
    private double berat;

    public JadwalLaundry(String n, String a, double b, String h) {
        this.nama = n; this.asrama = a; this.berat = b; this.hari = h;
    }

    public String getKembali() {
       if(hari.equalsIgnoreCase("senin")) return "Selasa Sore";
        if(hari.equalsIgnoreCase("selasa")) return "Rabu Sore";
        if(hari.equalsIgnoreCase("rabu")) return "Kamis Sore";
        if(hari.equalsIgnoreCase("jumat")) return "Sabtu Sore";
        return "Jadwal Tidak Ada"; 
    }

    public void tampilkanDetail() {
      System.out.println("\n--- Hasil ---");
        System.out.println("Mahasiswa: " + nama + " (" + asrama + ")");
        System.out.println("Kembali: " + getKembali());  
    }
}

