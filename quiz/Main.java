package quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\n=== Menu Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Lihat Buku Teratas");
            System.out.println("4. Tampilkan Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan ISBN buku: ");
                    String isbn = scanner.nextLine();
                    Buku buku = new Buku(judul, penulis, isbn);
                    perpustakaan.tambahBuku(buku);
                    break;

                case 2:
                    perpustakaan.pinjamBuku();
                    break;

                case 3:
                    perpustakaan.lihatBukuTeratas();
                    break;

                case 4:
                    perpustakaan.tampilkanSemuaBuku();
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
