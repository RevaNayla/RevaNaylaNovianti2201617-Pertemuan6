public class Segitiga {
    double alas;
    double tinggi;
    double sisi;

    // Constructor dengan parameter
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        this.alas = alasBaru;
        this.tinggi = tinggiBaru;
        this.sisi = sisiBaru;
    }

    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }

    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }

    // Method untuk menghitung luas segitiga
    public double getLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double getKeliling() {
        return this.sisi * 3;
    }
}
