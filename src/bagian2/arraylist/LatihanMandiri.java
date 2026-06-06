package bagian2.arraylist;
import java.util.ArrayList;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Susu");
        daftarBelanja.add("Roti");
        daftarBelanja.add("Telur");
        daftarBelanja.add("Kopi");
        
        System.out.println("Daftar awal: " + daftarBelanja);
        daftarBelanja.remove(1);
        System.out.println("Isi list setelah dihapus: " + daftarBelanja);
        System.out.println("Jumlah akhir item: " + daftarBelanja.size());
        System.out.println();

        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); 
        nilai.add(95); 
        nilai.add(60);
        nilai.add(88); 
        nilai.add(75);
        
        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Terbesar: " + max);
        System.out.println();

        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);
        for (String n : nama) {
            if (n.startsWith("A")) System.out.println(n);
        }
        
    }
}