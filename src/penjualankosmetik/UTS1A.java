package penjualankosmetik;

import java.util.Scanner;

public class UTS1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi variabel
        int kodeBarang;
        String namaBarang;
        int quantity;
        double harga;
        double totalInvoice;

        // Mencetak header
        System.out.println(" Penjualan Kosmetik ");

        // Menampilkan daftar kosmetik
        System.out.println("Daftar Kosmetik");
        System.out.println("Kode | Nama | Harga");
        System.out.println("--- | --- | ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " | " + "Kosmetik " + i + " | " + 100000 * i);
        }

        // Menerima input dari pengguna
        System.out.println("Masukkan kode barang: ");
        kodeBarang = scanner.nextInt();
        System.out.println("Masukkan nama barang: ");
        namaBarang = scanner.next();
        System.out.println("Masukkan quantity: ");
        quantity = scanner.nextInt();

        // Menghitung harga total
        harga = 100000 * kodeBarang;
        totalInvoice = harga * quantity;

        // Mencetak hasil transaksi
        System.out.println("Kode barang: " + kodeBarang);
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Quantity: " + quantity);
        System.out.println("Harga: " + harga);
        System.out.println("Total invoice: " + totalInvoice);
    }
}
