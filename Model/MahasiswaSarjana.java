package Model;

import java.util.List;

public class MahasiswaSarjana extends Mahasiswa {

    private List<MatkulAmbil> matkulDiambil;

    public MahasiswaSarjana(String nama, String alamat, String TTL, String telepon, String NIM, String jurusan, List<MatkulAmbil> matkulDiambil) {
        super(nama, alamat, TTL, telepon, NIM, jurusan);
        this.matkulDiambil = matkulDiambil;
    }

    public List<MatkulAmbil> getMatkulDiambil() {
        return matkulDiambil;
    }

    public void setMatkulDiambil(List<MatkulAmbil> matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    @Override
    public String toString() {
        return super.toString() + ", Matkul Diambil: " + matkulDiambil;
    }

}
