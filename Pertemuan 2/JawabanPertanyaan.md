#  Jawaban 2.3.3
1. Karakteristik Class dan Objek
Class : diawali dengan huruf kapital
Objek : harus instansiasi di method main
2. Kata kunci untuk mendeklerasikan class adalah kata "class"
3. Ada 4 buah yaitu namaBarang,jenisBarang,stok,hargaSatuan pada baris ke 2-3
4. Ada 4 method yaitu tampilBarang,tambahStok,kurangiStok,hitungHargaTotal pada baris ke 5,12,15,18
5. public void kurangiStok(int n){
            if(stok > 0 && stok > n){
                stok=stok-n; 
            }else{
                System.out.println("Kosong");
            }        
        }
6. Karena untuk menjumlahkan stok berupa "int" dan data yang diproses ber  tipe "int"
7. Karena method tersebut untuk mereturn nilai penjumlahan dan data tersebut harus ditampilkan data tersebut ber tipe "int"
8. Karena method tersebut hanya digunakan untuk memproses saja dan tidak perlu menampilkan data apapun

#  Jawaban 2.4.3
1. Pada baris ke-3 dengan objek yang dihasilkan adalah  bl
2. Dengan cara menggunakan nama object diikuti dengan nama atribut tersebut

#  Jawaban 2.5.3
1. Pada baris ke -7
2. Instansi dengan object baru yaitu b2 dengan konstruktor berparameter Barang b2 = new Barang("Logitech","Wireless Mouse", 150000, 25);
3. Objek dengan nama b3 dengan menggunakan konstruktur berparameter dari class Barang
   Barang b3 = new Barang ("Nikon"," Kamera Dslr",800000,10);
   b3.tampilBarang();

#  Jawaban 2.6.3
1. Kode tersebut merupakan instansi array dari object balok bernama ppArray dengan isi berelemen 3
2. Kode tersebut merupakan pengisian object balok ke dalam array yaitu ppArray indeks ke -0 yang beratribut Panjang = 80 dan Lebar = 40

#  Jawaban 2.7.3
1. Karena object persegi tersebut belum diisikan atau diinstasiasikan ke dalam array pgArray 


#  Jawaban 2.8.3
1.  Konstruktor adalah method yang bernama sama dengan nama class dan tidak memiliki return type. Konstruktor ini akan dipanggil pertama kali saat kita membuat object dari class tersebut.Nama dari konstruktur harus sama persis dengan nama class
2. Kode yang berisi 15 elemen sebagai berikut :
public class Segitiga {
    public int alas;
    public int tinggi;
    Segitiga[] arraySegitiga = new Segitiga[15];
3. Tambahan untuk konstruktor pada class segitiga tersebut di bawah ini :
public class Segitiga {
    public int alas;
    public int tinggi;
    Segitiga[] arraySegitiga = new Segitiga[15];
    
    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
4. Method pada class segitiga berikut ini:
public class Segitiga {
    public int alas;
    public int tinggi;
    
    Segitiga[] arraySegitiga = new Segitiga[15];
    
    Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    int hitungLuas(){
        return alas * tinggi / 2;
    }
    int hitungKeliling(int sisi){
        return alas + alas + alas;
    }
}
5. Kode pada fungsi main dan array segitiga yang berisi 4 elemen dan mencetak luas dan keliling berikut ini:
public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        
        sgArray[0] = new Segitiga(10,4);
        sgArray[1] = new Segitiga(20,10);
        sgArray[2] = new Segitiga(15,6);
        sgArray[3] = new Segitiga(25,10);
        
        for(int i=0; i<4; i++){
            System.out.println("Segitiga ke- "+ i);
            System.out.println("Keliling : "+ sgArray[i].hitungKeliling(4));
            System.out.println("Luas : " + sgArray[i].hitungLuas());
        }
    }
}

 