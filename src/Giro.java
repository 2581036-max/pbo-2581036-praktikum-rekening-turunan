public class Giro extends Rekening {

    private int batasOverdraft;

    public Giro(String nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    // Tolak jika jumlah <= 0 atau saldo akan lebih rendah dari -batasOverdraft
    @Override
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || saldo - jumlah < -batasOverdraft) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("      Giro, batas overdraft " + formatRupiah(batasOverdraft));
    }

    // Ketentuan 7: baris percobaan sudah dihapus.
    // Baris yang ditulis : System.out.println(nomor);
    // Pesan error        : nomor has private access in Rekening
}