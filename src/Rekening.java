public class Rekening {

    private String nomor;
    private String pemilik;
    protected int saldo; // DIUBAH: private -> protected

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    // Menolak setor jika jumlah <= 0
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo += jumlah;
        return true;
    }

    // Menolak tarik jika jumlah <= 0 atau melebihi saldo
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    public void cetakInfo() {
        System.out.println(
                nomor + " | "
                        + String.format("%-6s", pemilik)
                        + " | "
                        + String.format("%12s", formatRupiah(saldo))
        );
    }

    // Format angka ke mata uang Rupiah (contoh: 120000 -> "Rp120.000")
    protected static String formatRupiah(int angka) { // DIUBAH: private -> protected static
        String teks = String.format("%,d", angka).replace(',', '.');
        return "Rp" + teks;
    }
}