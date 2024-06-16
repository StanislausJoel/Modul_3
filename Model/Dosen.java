package Model;

import java.util.List;

public abstract class Dosen extends Staff {

    private String departemen;
    private List<MatkulAjar> matkulDiajar;

    public Dosen(String nama, String alamat, String TTL, String telepon, String NIK, String departemen, List<MatkulAjar> matkulDiajar) {
        super(nama, alamat, TTL, telepon, NIK);
        this.departemen = departemen;
        this.matkulDiajar = matkulDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<MatkulAjar> getMatkulDiajar() {
        return matkulDiajar;
    }

    public void setMatkulDiajar(List<MatkulAjar> matkulDiajar) {
        this.matkulDiajar = matkulDiajar;
    }

    public int getUnit() {

        int unit = 0;

        for (MatkulAjar matkulAjar : matkulDiajar) {

            for (Presensi presensi : matkulAjar.getPresensiStaff()) {

                if (presensi.isHadir()) {

                    unit++;

                }

            }

        }

        return unit;

    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen + ", Matkul Diajar: " + matkulDiajar;
    }
    
}
