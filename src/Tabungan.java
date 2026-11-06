public class Tabungan extends Rekening {

    private double bungaPersen;

    public Tabungan(String nomor, String pemilik, int saldo, double bungaPersen) {
        super(nomor, pemilik, saldo);
        this.bungaPersen = bungaPersen;
    }

    // Hitung bunga dari saldo, tambahkan lewat setor, kembalikan besar bunganya
    public int tambahBunga() {
        int bunga = (int) (saldo * bungaPersen / 100);
        setor(bunga);
        return bunga;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("      Tabungan, bunga " + bungaPersen + "% per bulan");
    }
}