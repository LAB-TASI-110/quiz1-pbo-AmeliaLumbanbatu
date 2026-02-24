// Amelia Renata Lumbanbatu - 12S24031

import java.util.*;

public class Driver1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Daftar harga (GANTI sesuai gambar menu)
        Map<String, String> namaMenu = new HashMap<>();
        Map<String, Integer> hargaMenu = new HashMap<>();

        namaMenu.put("NGS", "Nasi Goreng Spesial");
        hargaMenu.put("NGS", 25000);

        namaMenu.put("AP", "Ayam Penyet");
        hargaMenu.put("AP", 20000);

        namaMenu.put("GG", "Es Teh");
        hargaMenu.put("GG", 10000);

        int totalBelanja = 0;

        System.out.println("========================================");
        System.out.printf("%-20s %-5s %-10s %-10s\n", 
                          "Menu", "Porsi", "Harga", "Total");
        System.out.println("========================================");

        while (true) {
            String kode = sc.nextLine().toUpperCase();

            if (kode.equals("END")) {
                break;
            }

            int porsiButet = Integer.parseInt(sc.nextLine());

            // Perbandingan berat 100kg : 50kg = 2 : 1
            int totalPorsi = 3 * porsiButet;

            if (hargaMenu.containsKey(kode)) {
                int harga = hargaMenu.get(kode);
                int subtotal = harga * totalPorsi;
                totalBelanja += subtotal;

                System.out.printf("%-20s %-5d %-10d %-10d\n",
                        namaMenu.get(kode),
                        totalPorsi,
                        harga,
                        subtotal);
            }
        }

        System.out.println("========================================");
        System.out.println("Total Belanja : " + totalBelanja);

        double diskon = 0;
        String jenisKupon = "Tidak Ada";

        if (totalBelanja >= 300000) {
            diskon = 0.15;
            jenisKupon = "Kupon Merah (15%)";
        } else if (totalBelanja >= 200000) {
            diskon = 0.10;
            jenisKupon = "Kupon Kuning (10%)";
        } else if (totalBelanja >= 100000) {
            diskon = 0.05;
            jenisKupon = "Kupon Biru (5%)";
        }

        int potongan = (int)(totalBelanja * diskon);
        int totalBayar = totalBelanja - potongan;

        System.out.println("Kupon          : " + jenisKupon);
        System.out.println("Diskon         : " + potongan);
        System.out.println("Total Bayar    : " + totalBayar);
        System.out.println("========================================");

        sc.close();
    }
    
  
}
