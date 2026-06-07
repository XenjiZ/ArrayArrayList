// Nama: ZunioFarinbi
// NPM: 2410010346
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Struktur Data", "Basis Data"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Andi", "220101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "220102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "220103", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "220104", 92.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "220105", 45.0));

        System.out.println("== Data Mahasiswa ==");
        kelas.tampilkanSemua();
        System.out.println();

        System.out.println("Rata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());
        System.out.println();

        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "220106", 88.0));
        System.out.println(">> Berhasil menambahkan 1 mahasiswa baru.");
        System.out.println("Jumlah data terbaru: " + kelas.getJumlahData());
    }
}