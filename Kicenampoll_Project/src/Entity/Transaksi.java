package Entity;

import java.util.ArrayList;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Transaksi {
    private StringProperty Nama;
    private StringProperty Alamat;
    private StringProperty No_tlp;
    private IntegerProperty Id_pesanan;
    private IntegerProperty Jml_pesanan;
    private DoubleProperty Total;

    public Transaksi(String Nama, String Alamat, String No_tlp, int Id_pesanan, 
                    int Jml_pesanan) {
        this.Nama = new SimpleStringProperty(Nama);
        this.Alamat = new SimpleStringProperty(Alamat);
        this.No_tlp = new SimpleStringProperty(No_tlp);
        this.Id_pesanan = new SimpleIntegerProperty(Id_pesanan);
        this.Jml_pesanan = new SimpleIntegerProperty(Jml_pesanan);
    }

    public String getNama() {
        return Nama.get();
    }

    public void setNama(String Nama) {
        this.Nama.set(Nama);
    }

    public String getAlamat() {
        return Alamat.get();
    }

    public void setAlamat(String Alamat) {
        this.Alamat.set(Alamat);
    }

    public void setNo_tlp(String No_tlp) {
        this.No_tlp.set(No_tlp);
    }

    public Integer getId_pesanan() {
        return Id_pesanan.get();
    }

    public IntegerProperty getJml_pesanan() {
        return Jml_pesanan;
    }

    public void setJml_pesanan(IntegerProperty Jml_pesanan) {
        this.Jml_pesanan = Jml_pesanan;
    }

    public DoubleProperty getTotal() {
        return Total;
    }

    public void setTotal(DoubleProperty Total) {
        this.Total = Total;
    }
    
    
    
}
