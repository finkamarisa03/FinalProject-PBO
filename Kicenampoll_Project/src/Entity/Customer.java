package Entity;

public class Customer {
    private String Nama;
    private String Alamat;
    private String No_tlp;
    private int Id_customer;
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNo_tlp() {
        return No_tlp;
    }

    public void setNo_tlp(String No_tlp) {
        this.No_tlp = No_tlp;
    }

    public int getId_customer() {
        return Id_customer;
    }

    public void setId_customer(int Id_customer) {
        this.Id_customer = Id_customer;
    }
    
    
}
