public class BarangMakanan extends BarangDasar {
    public BarangMakanan(String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaBarang, hargaBarang, jumlahBeli);
    }

    // Override 
    @Override
    public void tampilDetail() {
        super.tampilDetail();
        
    }
}
