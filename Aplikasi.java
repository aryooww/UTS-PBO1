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

class MadiunMotor extends LayananTransportasi {

    public MadiunMotor(String namaDriver, double jarak, double saldoUser) {
        super(namaDriver, jarak, saldoUser);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500;
    }

    public void prosesTransaksi() {
        System.out.println("=== Transaksi oleh Setyo Aryo Wiguno - 254311016 ===");

        double total = hitungTarif();

        if (saldoUser >= total) {
            saldoUser -= total;

            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total Bayar: Rp " + total);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}

class MadiunMobil extends LayananTransportasi {

    private int nim;

    public MadiunMobil(String namaDriver, double jarak, double saldoUser, int nim) {
        super(namaDriver, jarak, saldoUser);
        this.nim = nim;
    }

    @Override
    public double hitungTarif() {
        int duaDigit = nim % 100;
        double biayaAdmin = 3000 + (duaDigit * 100);

        return (jarak * 5000) + biayaAdmin;
    }

    public void prosesTransaksi() {
        System.out.println("=== Transaksi oleh Setyo Aryo Wiguno - 254311016 ===");

        double total = hitungTarif();

        if (saldoUser >= total) {
            saldoUser -= total;

            System.out.println("Driver: " + namaDriver);
            System.out.println("Jarak: " + jarak + " km");
            System.out.println("Total Bayar: Rp " + total);
            System.out.println("Sisa Saldo: Rp " + saldoUser);
        } else {
            System.out.println("Saldo tidak mencukupi untuk perjalanan ini!");
        }
    }
}
