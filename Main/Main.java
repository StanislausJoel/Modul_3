package Main;

import Model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MataKuliah matkul1 = new MataKuliah("MK-001", 3, "Pemrograman Java");
        MataKuliah matkul2 = new MatkulPilihan("MK-002", 3, "Web Programming", 5);

        Presensi presensi1 = new Presensi("2024-01-01", StatusKehadiran.HADIR);
        Presensi presensi2 = new Presensi("2024-01-02", StatusKehadiran.ALPHA);
        List<Presensi> presensiList = new ArrayList<>(Arrays.asList(presensi1, presensi2));

        MatkulAmbil matkulAmbil1 = new MatkulAmbil(matkul1, presensiList, 80, 85, 90);
        List<MatkulAmbil> matkulAmbilList = new ArrayList<>(Arrays.asList(matkulAmbil1));

        MahasiswaSarjana mhsSarjana = new MahasiswaSarjana("Mahasiswa 1", "Jakarta", "2000-01-01", "08123456789", "NIM-001", "Informatika", matkulAmbilList);
        MahasiswaMagister mhsMagister = new MahasiswaMagister("Mahasiswa 2", "Bandung", "1998-01-01", "08123456780", "NIM-002", "Sistem Informasi", matkulAmbilList, "Artificial Intelligence");

        System.out.println(mhsSarjana.toString());
        System.out.println(mhsMagister.toString());

        PresensiStaff presensiStaff1 = new PresensiStaff("2024-01-01", StatusKehadiran.HADIR, "08:00");
        List<PresensiStaff> presensiStaffList = new ArrayList<>(Arrays.asList(presensiStaff1));

        MatkulAjar matkulAjar1 = new MatkulAjar(matkul1, presensiStaffList);
        List<MatkulAjar> matkulAjarList = new ArrayList<>(Arrays.asList(matkulAjar1));

        DosenTetap dosenTetap = new DosenTetap("Dosen 1", "Surabaya", "1975-01-01", "08123456781", "NIK-001", "Informatika", matkulAjarList, 10000000);
        DosenHonorer dosenHonorer = new DosenHonorer("Dosen 2", "Yogyakarta", "1980-01-01", "08123456782", "NIK-002", "Sistem Informasi", matkulAjarList, 300000);

        System.out.println(dosenTetap.toString());
        System.out.println(dosenHonorer.toString());

        Karyawan karyawan = new Karyawan("Employee 1", "Malang", "1985-01-01", "08123456783", "NIK-003", 5000000, presensiStaffList);

        System.out.println(karyawan.toString());

    }

}
