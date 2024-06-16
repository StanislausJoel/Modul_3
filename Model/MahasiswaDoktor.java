package Model;

public class MahasiswaDoktor extends Mahasiswa {

    private String judulPenelitianDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public MahasiswaDoktor(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, String judulPenelitianDisertasi, int nilaiSidang1, int nilaiSidang2, int nilaiSidang3) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return super.toString() + ", Judul Penelitian Disertasi: " + judulPenelitianDisertasi +
                ", Nilai Sidang 1: " + nilaiSidang1 + ", Nilai Sidang 2: " + nilaiSidang2 + ", Nilai Sidang 3: "
                + nilaiSidang3;
    }
    
}
