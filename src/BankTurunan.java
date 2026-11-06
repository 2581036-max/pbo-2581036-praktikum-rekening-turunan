public class BankTurunan {

    private static void cetakHasil(String label, boolean berhasil) {
        System.out.printf("%-26s: %s%n", label, berhasil ? "Berhasil" : "Ditolak");
    }

    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro giro = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        tabungan.cetakInfo();
        giro.cetakInfo();

        System.out.println();
        System.out.println("============ TRANSAKSI ============");
        cetakHasil("Tabungan tarik 1.500.000", tabungan.tarik(1500000));
        cetakHasil("Giro tarik 500.000", giro.tarik(500000));
        cetakHasil("Giro tarik 300.000", giro.tarik(300000));
        cetakHasil("Giro setor 100.000", giro.setor(100000));
        System.out.printf("%-26s: %s%n", "Bunga tabungan",
                Rekening.formatRupiah(tabungan.tambahBunga()));

        System.out.println();
        System.out.println("========== REKENING AKHIR =========");
        tabungan.cetakInfo();
        giro.cetakInfo();
    }
}