package Model;

import java.util.List;

public class MahasiswaMagister extends MahasiswaSarjana {
    private String judulPenelitianTesis;

    public MahasiswaMagister(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, List<MatkulAmbil> matkulDiambil, String judulPenelitianTesis) {
        super(nama, alamat, TTL, telepon, NIM, jurusan, matkulDiambil);
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Judul Penelitian Tesis: " + judulPenelitianTesis;
    }

}
