abstract class LayananTransportasi {
    protected String namaDriver;
    protected double jarak;
    protected double saldoUser;

    public LayananTransportasi(String namaDriver, double jarak, double saldoUser) {
        this.namaDriver = namaDriver;

        // Validasi jarak (Encapsulation)
        if (jarak <= 0) {
            this.jarak = 1;
        } else {
            this.jarak = jarak;
        }

        this.saldoUser = saldoUser;
    }

    public abstract double hitungTarif();
}

