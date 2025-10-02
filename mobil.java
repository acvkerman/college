public class mobil {
    public String nama = "Avanza";
    String plat = "B 175 H";
    String warna = "Hitam";

    public void jalan() {
        System.out.println(nama + " Melanggar Rambu Lalu Lintas");
    }

    public static void main(String[] args) {
    // instansi objek dari kelas mobil
    mobil mbl = new mobil();

        mbl.jalan();
    System.out.println("Plat Mobil: " + mbl.plat);
    System.out.println("Warna Mobil: " + mbl.warna);
    }
}