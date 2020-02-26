# Jawaban 2.3.3

1. Base dari algoritma divide conquer
    if(n==1){                              //divide
        return 1;
    }else{
        int fakto = n * faktorialDC(n-1); //conquer
        return fakto;
    }
2. Sudah Lengkap
    Tahap Devide adalah if else pada method rekursif,yang dimana pada proses tersebut program dapat memecahkan masalah ke dalam bentuk yang sama dalam ukuran yang lebih kecil.
    Tahap Conquer adalah memecahkan dan menyelesaikan masing-masing upa-masalah yaitu dengan cara rekursif,dimana program itu adalah menempatkan if sebagai base case dan else sebagai recursion call.Pada program ini melakukakan proses menentukan nilai fakto adalah hasil perkalian dengan angka itu sendiri dengan angka -1(n*(n-1)).
    Tahap Combine adalah menggabungkan solusi masing-masing upa-masalah sehingga membentuk solusi masalah semula.Pada program ini melakukan proses pada base case yaitu,apabila angka/n sudah bernilai 1,maka melakukan pengembalian nilai 1.
3.  Memungkinkan yakni menggunakan while
    public int faktorialBF(int n){
        int fakto = 1;
        int i = 1;
        while(i <= n){
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }
4. Pengecekan waktu eksekusi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start, end;
        System.out.println("===============================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for(int i=0;i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke - "+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        start = System.nanoTime();
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0;i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialBF(fk[i].nilai));
        }
        end = System.nanoTime();
        System.out.println("\nWaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond ");
        start = 0;
        end = 0;
        start = System.nanoTime();
        System.out.println("===============================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0;i < elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].faktorialDc(fk[i].nilai));
        }
        System.out.println("===============================================");
        end = System.nanoTime();
        System.out.println("\nWaktu yang diperlukan selama proses : " + ((end - start) / 1000000.0) + " milisecond ");
    }
5. Pembukian perbedaan waktu eksekusi
===============================================
Masukkan jumlah elemen yang ingin dihitung : 
21
Masukkan nilai data ke - 1 : 2
Masukkan nilai data ke - 2 : 4
Masukkan nilai data ke - 3 : 6
Masukkan nilai data ke - 4 : 8
Masukkan nilai data ke - 5 : 9
Masukkan nilai data ke - 6 : 7
Masukkan nilai data ke - 7 : 5
Masukkan nilai data ke - 8 : 3
Masukkan nilai data ke - 9 : 1
Masukkan nilai data ke - 10 : 2
Masukkan nilai data ke - 11 : 4
Masukkan nilai data ke - 12 : 6
Masukkan nilai data ke - 13 : 8
Masukkan nilai data ke - 14 : 9
Masukkan nilai data ke - 15 : 7
Masukkan nilai data ke - 16 : 5
Masukkan nilai data ke - 17 : 3
Masukkan nilai data ke - 18 : 1
Masukkan nilai data ke - 19 : 2
Masukkan nilai data ke - 20 : 3
Masukkan nilai data ke - 21 : 4
===============================================
Hasil Faktorial dengan Brute Force
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 4 adalah : 24

Waktu yang diperlukan selama proses : 2.166665 milisecond 
===============================================
Hasil Faktorial dengan Divide and Conquer
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 4 adalah : 24
Faktorial dari nilai 6 adalah : 720
Faktorial dari nilai 8 adalah : 40320
Faktorial dari nilai 9 adalah : 362880
Faktorial dari nilai 7 adalah : 5040
Faktorial dari nilai 5 adalah : 120
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 1 adalah : 1
Faktorial dari nilai 2 adalah : 2
Faktorial dari nilai 3 adalah : 6
Faktorial dari nilai 4 adalah : 24
===============================================
Waktu yang diperlukan selama proses : 1.30041 milisecond 

# Jawaban 2.4.3

1. PangkatBF : menggunakan brute force,menyelesaikan masalah  dengan sederhana dan pengimplementasiannya lebih mudah namun membutuhkan jumlah 
   komputasi yang besar dan waktu yang lama dalam eksekusi
   PangkatDC : menggunakan divide and conquer,menyelesaikan masalah dengan memecahnya menjadi bagian yang lebih kecil sehingga waktu yang dibutuhkan lebih singkat.
2. Pada kode tersebut terjadi proses divide,dimana membagi banyaknya pangkat menjadi lebih sederhana atau lebih kecil.Jika banyaknya pangkat 
   merupakan angka genap maka cukup dibagi dua,namun jika ganjil maka dibagi dua,kemudian pada satu sisinya dikali angka itu sendiri
3. Sudah
   return (pangkatDC(a,n/2)* pangkatDC(a,n/2)*a);  //untuk ganjil
   return (pangkatDC(a,n/2)*pangkatDC(a,n/2));   //untuk genap
4. Konstruktor
   public class Pangkat {
        public int nilai,pangkat;
    
        public Pangkat(int nilai, int pangkat){
            this.nilai = nilai;
            this.pangkat = pangkat;
        }
        public int pangkatBF(int a,int n){
            int hasil =1;
            for(int i=0;i < n;i++){
                hasil = hasil * a;
            }
            return hasil;
        }
        public int pangkatDC(int a,int n){
            if(n==0){
                return 1;
            }
            else{
                if(n%2==1)
                    return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
                else
                    return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    } 


    public class MainPangkat {
    public static void main(String[] args) {
        Pangkat png1 = new Pangkat(6, 2);
        Pangkat png2 = new Pangkat(4, 3);
        
        System.out.println("===========================================");
        System.out.println("Hasil Pangkat dengan Brute Force");

        System.out.println("Nilai " +png1.nilai+" pangkat" + png1.pangkat+" adalah : "+png1.pangkatBF(png1.nilai,png1.pangkat));
        System.out.println("Nilai " +png2.nilai+" pangkat" + png2.pangkat+" adalah : "+png2.pangkatBF(png2.nilai,png2.pangkat));

        System.out.println("===========================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");

        System.out.println("Nilai " +png1.nilai+" pangkat" + png1.pangkat+" adalah : "+png1.pangkatDC(png1.nilai,png1.pangkat));
        System.out.println("Nilai " +png2.nilai+" pangkat" + png2.pangkat+" adalah : "+png2.pangkatDC(png2.nilai,png2.pangkat));
        System.out.println("===========================================");
    }
    }
5. Menambahkan Menu

        Pangkat [] png = new Pangkat[elemen];
        for(int i=0; i < elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke - "+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke - "+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        
        System.out.println("Menu");
        System.out.println("1.Brute Force");
        System.out.println("2.Divide and Conquer");
        System.out.println("Pilih metode (1/2) : ");
        int menu = sc.nextInt();
        
        if (menu == 1){
            System.out.println("===========================================");
            System.out.println("Hasil Pangkat dengan Brute Force");
            for(int i=0; i < elemen; i++){
                System.out.println("Nilai " +png[i].nilai+" pangkat" + png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
            }
        }else if (menu == 2){
            System.out.println("===========================================");
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for(int i=0; i < elemen; i++){
                System.out.println("Nilai " +png[i].nilai+" pangkat" + png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
            }
        }else{
        System.out.println("===========================================");
        }

# Jawaban 2.5.3

1.  TotalBF() menggunakan perulangan for untuk menghitung    
    keuntungan untuk
    i = 0 <= elemen; i akan bertambah
    i = 0 => total = 0 + keuntungan 1
    i = 1 => total = (0 + keuntungan 1) + keuntungan 2 
    i = 2 => total = ((0 + keuntungan 1) + keuntungan 2) + keuntungan elemen
    TotalDC() menggunakan Divide and Conquer.
    Contoh :
    bulan = 5,keuntungan = {5,6,5,4,3}
    Jadi perhitungan keuntungan dibagi menjadi 2 bagian.Bagian kiri lsum dan bagian kanan rsum.
    lsum = 5, 6 dan rsum = 4, 3,kemudian nilai mid = 5
    Di lsum melakukan perhitungan 5 + 6 = 11
    Di rsum melakukan perhitungan 4 + 3 = 7
    Kemudian direturn dengan menjumlahkan lsum + rsum + arr[mid] = 11+7+5
2. Menyamakan banyak angka di belakang koma
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        Sum sm = new Sum(elm);
        System.out.println("===========================================");
        for(int i =0; i< sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("===========================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "+ String.format("%.3f" , sm.totalBF(sm.keuntungan)));
        System.out.println("===========================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + String.format("%.3f" , sm.totalDC(sm.keuntungan, 0,sm.elemen-1)));
    }
3. Karena return value tersebut merupakan hasil perhitungan dari totalDC yan nanti akan dimasuki value dari inputan jadi fungsi class tersebut 
   sudah digunakan sebelum di gunakan lagi di fungsi main
4. Karena variable mid merupakan variable yang menampung hasil perhitungan yang menjadi salah satu attribute/value class sum nantinya
5. Lebih dari 1 perusahaan
public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9");
        System.out.print("Masukkan jumlah perusahaan : ");
        int perusahaan = sc.nextInt();
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        for(int j=0;j < perusahaan; j++){
            System.out.println("===========================================");
            System.out.println("Perusahaan ke - " + (j + 1));
            Sum sm = new Sum(elm);
            System.out.println("===========================================");
            for(int i =0; i< sm.elemen; i++){
                System.out.print("Masukkan untung bulan ke - "+(i+1)+" = ");
                sm.keuntungan[i] = sc.nextDouble();
            }
        System.out.println("===========================================");
        System.out.println("Algoritma Brute Force");
        System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n",sm.totalBF(sm.keuntungan));

        System.out.println("===========================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.printf("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = %.2f\n ", sm.totalDC(sm.keuntungan, 0,sm.elemen-1));
        }
        System.out.println();
    }
}