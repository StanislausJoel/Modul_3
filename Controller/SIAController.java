package Controller;

import Model.*;
import java.util.List;

public class SIAController {

    private List<User> users;

    public SIAController(List<User> users) {
        this.users = users;
    }

    public String printUserData(String nama) {

        for (User user : users) {

            if (user.getNama().equalsIgnoreCase(nama)) {

                return user.toString();

            }

        }

        return "User tidak ditemukan";

    }

    public String printNilaiAkhir(String NIM, String kodeMK) {

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa.getNIM().equals(NIM)) {

                    if (mahasiswa instanceof MahasiswaSarjana) {

                        MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;

                        for (MatkulAmbil matkulAmbil : sarjana.getMatkulDiambil()) {

                            if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {

                                double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;

                                return "Nilai Akhir: " + nilaiAkhir;

                            }

                        }

                    } 
                    else if (mahasiswa instanceof MahasiswaDoktor) {

                        MahasiswaDoktor doktor = (MahasiswaDoktor) mahasiswa;

                        double nilaiAkhir = (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3.0;

                        return "Nilai Akhir: " + nilaiAkhir;

                    }

                }

            }

        }

        return "Data tidak ditemukan";

    }

    public String printRataRataNilaiAkhir(String kodeMK) {

        double totalNilai = 0;
        int jumlahMahasiswa = 0;

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof MahasiswaSarjana) {

                    MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;

                    for (MatkulAmbil matkulAmbil : sarjana.getMatkulDiambil()) {

                        if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {

                            totalNilai += (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;
                            jumlahMahasiswa++;

                        }

                    }

                } 
                else if (mahasiswa instanceof MahasiswaDoktor) {

                    MahasiswaDoktor doktor = (MahasiswaDoktor) mahasiswa;

                    totalNilai += (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3.0;

                    jumlahMahasiswa++;

                }

            }

        }

        if (jumlahMahasiswa == 0) {

            return "Tidak ada mahasiswa yang mengambil matkul ini";

        }

        double rataRata = totalNilai / jumlahMahasiswa;

        return "Rata-Rata Nilai Akhir: " + rataRata;

    }

    public String printJumlahTidakLulus(String kodeMK) {

        int jumlahTidakLulus = 0;
        int jumlahMahasiswa = 0;
        String namaMK = "";

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa instanceof MahasiswaSarjana) {

                    MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;
                    
                    for (MatkulAmbil matkulAmbil : sarjana.getMatkulDiambil()) {

                        if (matkulAmbil.getMatkul().getKode().equals(kodeMK)) {
                            
                            namaMK = matkulAmbil.getMatkul().getNama();
                            double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3.0;

                            if (nilaiAkhir < 56) {

                                jumlahTidakLulus++;

                            }

                            jumlahMahasiswa++;

                        }

                    }

                } 
                else if (mahasiswa instanceof MahasiswaDoktor) {

                    MahasiswaDoktor doktor = (MahasiswaDoktor) mahasiswa;
                    double nilaiAkhir = (doktor.getNilaiSidang1() + doktor.getNilaiSidang2() + doktor.getNilaiSidang3()) / 3.0;

                    if (nilaiAkhir < 56) {

                        jumlahTidakLulus++;

                    }

                    jumlahMahasiswa++;

                }

            }

        }

        return "<" + jumlahTidakLulus + "> dari <" + jumlahMahasiswa + "> mahasiswa tidak lulus matakuliah <" + namaMK + ">";

    }

    public String printMatkulDiambilMahasiswa(String NIM) {

        for (User user : users) {

            if (user instanceof Mahasiswa) {

                Mahasiswa mahasiswa = (Mahasiswa) user;

                if (mahasiswa.getNIM().equals(NIM)) {

                    if (mahasiswa instanceof MahasiswaSarjana) {

                        MahasiswaSarjana sarjana = (MahasiswaSarjana) mahasiswa;
                        String result = "Matkul Diambil: ";

                        for (MatkulAmbil matkulAmbil : sarjana.getMatkulDiambil()) {
                            
                            result += matkulAmbil.getMatkul().getNama() + " (Total Presensi: " + matkulAmbil.getListPresensi().size() + "), ";

                        }

                        return result;

                    } 
                    else {

                        return "Mahasiswa bukan dari program Sarjana";

                    }

                }

            }

        }

        return "Mahasiswa tidak ditemukan";

    }

    public String printTotalJamMengajar(String NIK) {

        for (User user : users) {

            if (user instanceof Dosen) {

                Dosen dosen = (Dosen) user;

                if (dosen.getNIK().equals(NIK)) {

                    int totalJamMengajar = 0;

                    for (MatkulAjar matkulAjar : dosen.getMatkulDiajar()) {

                        for (Presensi presensi : matkulAjar.getPresensiStaff()) {

                            if (presensi.getStatus() == StatusKehadiran.HADIR) {

                                totalJamMengajar += matkulAjar.getMatkul().getSKS();

                            }

                        }

                    }

                    return "Total Jam Mengajar: " + totalJamMengajar;

                }

            }

        }

        return "Dosen tidak ditemukan";

    }

    public String printGaji(String NIK) {

        for (User user : users) {

            if (user instanceof Karyawan) {

                Karyawan karyawan = (Karyawan) user;

                if (karyawan.getNIK().equals(NIK)) {

                    int unit = karyawan.getUnit();
                    double gaji = karyawan.getSalary() * (unit / 22.0);

                    return "Gaji Karyawan: " + gaji;

                }
            } 
            else if (user instanceof DosenTetap) {

                DosenTetap dosenTetap = (DosenTetap) user;

                if (dosenTetap.getNIK().equals(NIK)) {

                    int unit = dosenTetap.getUnit();
                    double gaji = dosenTetap.getSalary() + (unit * 25000);

                    return "Gaji Dosen Tetap: " + gaji;

                }

            } 
            else if (user instanceof DosenHonorer) {

                DosenHonorer dosenHonor = (DosenHonorer) user;

                if (dosenHonor.getNIK().equals(NIK)) {

                    int unit = dosenHonor.getUnit();
                    double gaji = unit * dosenHonor.getHonorPerSKS();

                    return "Gaji Dosen Honor: " + gaji;

                }

            }

        }

        return "User tidak ditemukan";
    }

}
