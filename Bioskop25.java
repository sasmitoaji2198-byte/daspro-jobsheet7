import java.util.Scanner;

public class Bioskop25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalTiketTerjual = 0;
        double totalPenjualanHarian = 0;
        int hargaTiket = 50000;
        String pilihan;
        
        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 'selesai' untuk keluar): ");
            pilihan = sc.next();
            
            if (pilihan.equalsIgnoreCase("selesai")) {
                break;
            }
            
            int jumlahTiket = Integer.parseInt(pilihan);
            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka positif.");
                continue;
            }
            
            double hargaTotal = jumlahTiket * hargaTiket;
            double diskon = 0;
            
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            
            hargaTotal = hargaTotal - (hargaTotal * diskon);
            
            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += hargaTotal;
            
            System.out.println("Total harga untuk pembelian ini: Rp " + hargaTotal);
            
        } while (true);
        
        System.out.println("\n--- Rekap Penjualan Tiket Bioskop Hari Ini ---");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total pendapatan: Rp " + totalPenjualanHarian);
        
        sc.close();
    }
}