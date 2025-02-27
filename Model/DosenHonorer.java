package Model;

import java.util.List;

public class DosenHonorer extends Dosen {

    private double honorPerSKS;

    public DosenHonorer(String nama, String alamat, String TTL, String telepon, String NIK, String departemen, List<MatkulAjar> matkulDiajar, double honorPerSKS) {
        super(nama, alamat, TTL, telepon, NIK, departemen, matkulDiajar);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(double honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + ", Honor per SKS: " + honorPerSKS;
    }
    
}
