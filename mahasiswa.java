public class mahasiswa{
    public String nama = "Revalina";
    String nim = "32602400009";
    String jurusan;


    public void belajar() {
    System.out.println(nama + " Sedang Belajar");
    }

    public static void main(String[] args) {
    // instansi objek dari kelas mahasiswa
    mahasiswa mhs = new mahasiswa();

        mhs.belajar();
    System.out.println("Nim mahasiswa: " + mhs.nim);
    }
}
