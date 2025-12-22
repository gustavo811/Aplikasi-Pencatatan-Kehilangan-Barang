import java.time.LocalDate;

public class BarangHilang {
    private String namaBarang;
    private String lokasi;
    private LocalDate tanggal;
    private String pelapor;

    public BarangHilang(String namaBarang, String lokasi, LocalDate tanggal, String pelapor) {
        this.namaBarang = namaBarang;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.pelapor = pelapor;
    }

    public String getNamaBarang() { return namaBarang; }
    public String getLokasi() { return lokasi; }
    public LocalDate getTanggal() { return tanggal; }
    public String getPelapor() { return pelapor; }

    public String toCSV() {
        return namaBarang + "," + lokasi + "," + tanggal + "," + pelapor;
    }
}