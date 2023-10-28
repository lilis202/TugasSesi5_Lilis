
import java.util.Scanner;

public class TugasDaftarNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlahData = input.nextInt();
        
        String[] nama = new String[jumlahData];
        double[] nilai = new double[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("____________");
            System.out.println("Mahasiswa Ke : " + (i + 1));
            
            System.out.print("Nama: ");
            nama[i] = input.next();
            
            System.out.print("Nilai: ");
            nilai[i] = input.nextDouble();
        }

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No Nama Nilai Status");

        double totalNilai = 0.0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.print((i + 1) + " " + nama[i] + " " + nilai[i] + " ");
            
            if (nilai[i] >= 60) {
                System.out.println("Lulus");
            } else {
                System.out.println("Tidak Lulus");
            }

            totalNilai += nilai[i];
        }

        double rataRata = totalNilai / jumlahData;
        
        System.out.println("================================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
        
        input.close();

        
}
}
