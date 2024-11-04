
package pertemuan6;

import java.util.Scanner;
public class latihan24_perbandinganDuaNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            // Menerima input dua nilai dari pengguna
            System.out.println("======Program Perbandingan Nilai======");
            System.out.print("Masukkan nilai pertama : ");
            int nilai1 = input.nextInt();

            System.out.print("Masukkan nilai kedua : ");
            int nilai2 = input.nextInt();

            // Melakukan perbandingan
            if (nilai1 > nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih besar dari " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println("Hasil : " + nilai1 + " Lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil : " + nilai1 + " Sama dengan " + nilai2);
            }

            // Menanyakan kepada pengguna apakah ingin mengulangi
            System.out.print("Ulangi Aktivitas? (Ya/Tidak) : ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
        input.close();
    }
}
