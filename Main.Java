public class AplikasiMadiunJek {
    public static void main(String[] args) {

        LayananTransportasi[] layanan = new LayananTransportasi[2];

        layanan[0] = new MadiunMotor("Budi", 5, 20000);
        layanan[1] = new MadiunMobil("Andi", 3, 50000, 22030045); // ganti NIM kamu

        for (LayananTransportasi l : layanan) {
            System.out.println("Tarif: Rp " + l.hitungTarif());

            if (l instanceof MadiunMotor) {
                ((MadiunMotor) l).prosesTransaksi();
            } else if (l instanceof MadiunMobil) {
                ((MadiunMobil) l).prosesTransaksi();
            }

            System.out.println();
        }
    }
}