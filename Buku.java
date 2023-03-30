public class Buku {
    public String judul;
    public String autor;
    public String penerbit;
    public double kategori;
    public String keterangan;
    public Integer tahun;

    public Buku(String judul, String autor, String penerbit, double kategori,Integer tahun) {
        this.judul = judul.length() < 8 ? judul+"\t" : judul;
        this.autor = autor.length() < 8 ? autor+"\t" : autor;
        this.penerbit = penerbit.length() < 8 ? penerbit+"\t\t" : (penerbit.length() < 16 ? penerbit+"\t" : penerbit);
        this.kategori = kategori;
        this.tahun = tahun;
        if (kategori == 1) {
            this.keterangan = "Teknik";
        } else if (kategori == 2) {
            this.keterangan = "Manajemen";
        } else if (kategori == 3) {
            this.keterangan = "Fiksi";
        } else {
            this.keterangan = "Lainnya";
        }
    }
}