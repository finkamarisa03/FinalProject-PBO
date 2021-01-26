package Entity;

public class Dessert {
    private int Kode_variant;
    private String Variant;
    private String Ukuran;
    private double Harga;
    
    //Default constructor
    public Dessert(){}
    
    //Constructor
    public Dessert(int Kode_variant, String Variant, String Ukuran, double Harga) {
        this.Kode_variant = Kode_variant;
        this.Variant = Variant;
        this.Ukuran = Ukuran;
        this.Harga = Harga;
    }

    public int getKode_variant() {
        return Kode_variant;
    }

    public void setKode_variant(int Kode_variant) {
        this.Kode_variant = Kode_variant;
    }

    public String getVariant() {
        return Variant;
    }

    public void setVariant(String Variant) {
        this.Variant = Variant;
    }

    public String getUkuran() {
        return Ukuran;
    }

    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }
    
}
