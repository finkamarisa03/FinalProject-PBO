# Sistem Layanan Pesan Online Kicenampoll
Tugas Final Project mata kuliah Pemrograman Berorientasi Objek (PBO), S1 Ilmu Komputer, Universitas Lampung.

Anggota :
1917051037 Vira Verina,
1917051063 Hani Cita Lestari,
1957051003 Finka Marisa Geananda Sufie
(Kelas A)

### Class Diagram
```mermaid
classDiagram
	pesanan <|-- admin
	pesanan <|-- customer
	pesanan <|-- dessertbox
    
    class pesanan{
      +int Id_pesanan
	  +int Jumlah_pesanan
	  +desimal Total
      +data Tgl_pesan
      +created timestamp
      
    }
    
    class admin{
      +varchar username
      +varchar password
      +created timestamp
    }
	
	class customer{
      +int Id_customer
	  +varchar Nama
	  +varchar Alamat
      +varchar Nomor_tlpn
      +created timestamp
      
    }
    
    class dessertbox{
      +varchar kode_variant
      +varchar nama
	  +varchar size
	  +decimal Harga
      +created timestamp
    }

### ER Diagram
```mermaid
erDiagram
          admin ||..|| pesanan : is
          pesanan ||..|| dessertbox : is
          pesanan ||..|| customer : is
        admin {
            varchar username
            password varchar
        }
        pesanan {
            int Id_pesanan
            int Jumlah_pesanan
            decimal Total
            date Tgl_pesan
            int Id_customer
            varchar username
            varchar kode_variant
        }
        dessertbox {
            varchar kode_variant
            varchar nama
            varchar size
            decimal Harga
        }
        customer {
            int Id_customer
            varchar Nama
            varchar Alamat
            varchar Nomor_tlpn
        }
```
