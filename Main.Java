public class AplikasiMadiunJek {
    public static void main(String[] args) {

        LayananTransportasi motor = new MadiunMotor("Budi", 5, 20000);
        LayananTransportasi mobil = new MadiunMobil("Andi", 3, 50000, 254311016);

        // Jalankan Motor
        System.out.println("Tarif Motor: Rp " + motor.hitungTarif());
        ((MadiunMotor) motor).prosesTransaksi();

        System.out.println();

        // Jalankan Mobil
        System.out.println("Tarif Mobil: Rp " + mobil.hitungTarif());
        ((MadiunMobil) mobil).prosesTransaksi();
    }
}