package Entity;

public class Pesanan {
    
    private int Id_pesanan;
    private int Jml_pesanan;
    private double Total;

    public int getId_pesanan() {
        return Id_pesanan;
    }

    public void setId_pesanan(int Id_pesanan) {
        this.Id_pesanan = Id_pesanan;
    }

    public int getJml_pesanan() {
        return Jml_pesanan;
    }

    public void setJml_pesanan(int Jml_pesanan) {
        this.Jml_pesanan = Jml_pesanan;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
   
}
