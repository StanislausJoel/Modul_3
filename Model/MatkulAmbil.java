package Model;

import java.util.List;

public class MatkulAmbil {
    
    private MataKuliah matkul;
    private List<Presensi> presensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(MataKuliah matkul, List<Presensi> presensi, int n1, int n2, int n3) {
        this.matkul = matkul;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public List<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(List<Presensi> presensi) {
        this.presensi = presensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Matkul: " + matkul + ", Presensi: " + presensi + ", N1: " + n1 + ", N2: " + n2 + ", N3: " + n3;
    }

}
