import java.util.Scanner;

public class PenjualanTiketBioskop18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTiket;
        int totalTiketTerjual = 0;
        double totalHarga = 0;

        final double hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (negatif untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                break;
            }
            if (jumlahTiket <= 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah yang benar.");
                continue;  
            }

            totalTiketTerjual += jumlahTiket;

            double harga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                harga *= 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                harga *= 0.90; // Diskon 10%
            }
            totalHarga += harga;
        }
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total harga penjualan: Rp " + totalHarga);
    }
}
