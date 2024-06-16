package Model;

import java.util.List;

public class MatkulAjar {

    private MataKuliah matkul;
    private List<PresensiStaff> presensiStaff;

    public MatkulAjar(MataKuliah matkul, List<PresensiStaff> presensiStaff) {
        this.matkul = matkul;
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    @Override
    public String toString() {
        return "Matkul: " + matkul + ", Presensi Staff: " + presensiStaff;
    }
    
}
