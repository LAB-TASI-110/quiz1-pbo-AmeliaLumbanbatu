// Amelia Renata Lumbanbatu
package driver;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] nilaiSiswa = new int[n];
        for (int i = 0; i < n; i++) {
            nilaiSiswa[i] = sc.nextInt();
        }

        if (!sc.hasNextInt()) return;
        int kodeKelompok = sc.nextInt();

        int totalNilai = 0;

        for (int i = 0; i < n; i++) {
            if (i % 4 == kodeKelompok) {
                totalNilai += nilaiSiswa[i];
            }
        }

        System.out.println(totalNilai);

        sc.close();
    }
    
}
