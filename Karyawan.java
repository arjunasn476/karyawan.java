public class Karyawan{
    int id;
    String nama;
    double ipk;

    //Constructor
    //nama harus sama dgn Class
    public Karyawan() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }

    //Constructor Parameter
    public Karyawan (String nama, int id, double ipk) {
        //variabel = parameter
        this.nama = nama;
        this.id = id;
        this.ipk = ipk;
    }

    //method print
    public void print() {
        System.out.println("Id : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Ipk : " + ipk);
    }
}