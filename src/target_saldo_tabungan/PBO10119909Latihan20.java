package target_saldo_tabungan;

import java.util.Locale;

/**
 *
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10119909Latihan20 {

    public static void main(String[] args) {
        double saldo_awal = 3500000;
        double i = 0;
        do {
            i += 1;
            saldo_awal += Math.floor(saldo_awal * 0.08);
            System.out.printf(Locale.ITALY, "Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n" , i , saldo_awal);
        } while (saldo_awal<6000000);
    }
}