   import java.util.Scanner;
public class Tugas305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;
        int maxBarang = -1;       // -1 agar toko pertama pasti tercatat
        int tokoTerbanyak = 0;
        String ringkasan = "";

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int pelanggan;
            do {
                System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Tidak boleh negatif. Ulangi input!");
                }
            } while (pelanggan < 0);

            int totalBarang = 0;
            for (int p = 1; p <= pelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarang += barang;
            }

            ringkasan += "Toko " + toko + " - pelanggan: " + pelanggan
                    + ", total barang: " + totalBarang + "\n";
            totalSemua += totalBarang;

            if (totalBarang > maxBarang) {   // > agar toko bernomor kecil dipilih jika sama
                maxBarang = totalBarang;
                tokoTerbanyak = toko;
            }
        }

        System.out.println();
        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}