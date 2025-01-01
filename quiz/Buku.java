package quiz;

public class Buku {
    private String judul;
    private String penulis;
    private String isbn;

    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", ISBN: " + isbn;
    }
}
