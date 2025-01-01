package quiz;

import java.util.Stack;

public class Perpustakaan{
    private Stack<Buku> stackBuku;

    public Perpustakaan() {
        stackBuku = new Stack<>();
    }    

    public void tambahBuku(Buku buku) {
        stackBuku.push(buku);
        System.out.println("Buku berhasil ditambahkan: " + buku.getJudul());
    }
    public void pinjamBuku() {
        if (stackBuku.isEmpty()) {
            System.out.println("Stack kosong! Tidak ada buku yang dapat dihapus.");
        } else {
            Buku buku = stackBuku.pop();
            System.out.println("Buku yang dihapus: " + buku.getJudul());
        }
    }

    public void lihatBukuTeratas() {
        if (stackBuku.isEmpty()) {
            System.out.println("Stack kosong! Tidak ada buku yang tersedia.");
        } else {
            System.out.println("Buku teratas: " + stackBuku.peek());
        }
    }

    public void tampilkanSemuaBuku() {
        if (stackBuku.isEmpty()) {
            System.out.println("Stack kosong! Tidak ada buku yang tersedia.");
        } else {
            System.out.println("Daftar semua buku dalam stack:");
            for (int i = stackBuku.size() - 1; i >= 0; i--) {
                System.out.println((stackBuku.size() - i) + ". " + stackBuku.get(i));
            }
        }
    }
}
