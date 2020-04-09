## Pertanyaan Praktikum 1

1. Fungsi kode tersebut adalah untuk menampilkan data dan untuk membuat method pencarian data dengan membandingkan data yang dicari dengan data ke -1 sampai n
2. Fungsi break adalah untuk menghentikan pencarian nilai data yang dicari. Apabila tidak ada break, komputer akan mengeksekusi intruksi yang berada di bawahnya walaupun berada di case yang berbeda
3. Output = 
isi Array : 
10 40 30 50 70 20 100 90 
Menggunakan sequential Search
data : 30 ditemukan pada indeks 2
Alasan : Program masih bisa berjalan Hasil yang dikeluarkan pun benar. Ini bisa terjadi karena isi dari array masih sama yaitu 8 

## Pertanyaan Praktikum 2

1. Output =
mid = (left + right) / 2;
2. Output =
else if (data[mid] > cari){
    return FindBinarySearch(cari, left, mid - 1);
3. Hasil sesuai dengan permintaan 
Output =
isi Array : 
100 90 80 70 60 50 40 30 
Menggunakan sequential Search
data : 30 ditemukan pada indeks 7
================================
menggunakan binary Search
data 30 tidak ditemukan 
4. Program masih dapat berjalan dengan hasil dari kode Binary Search tidak sesuai dengan kode program.Karena data belum diuurutkan dengaan metode Merge Sort,sehingga pencarian data tidak dapat dilakukan
isi Array : 
10 40 30 50 70 20 100 90 
Menggunakan sequential Search
data : 30 ditemukan pada indeks 2
================================
menggunakan binary Search
data 30 tidak ditemukan
5. Source code Modifikasi : 
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[8];
        for(int i = 0;i < 8; i++){
            System.out.print("Nilai Array Indeks ke- " + i + " = ");
            data[i] = sc.nextInt();
        } 
        Searching2 pencarian = new Searching2(data, 8);
        
        System.out.println("isi Array : ");
        pencarian.TampilData();
        int cari = 30;
        System.out.println("Menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        
        pencarian.Tampilposisi(cari, posisi);
        System.out.println("================================");
        System.out.println("menggunakan binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length -1);
        pencarian.Tampilposisi(cari, posisi);
    }
Output :
Nilai Array Indeks ke- 0 = 40
Nilai Array Indeks ke- 1 = 50
Nilai Array Indeks ke- 2 = 30
Nilai Array Indeks ke- 3 = 20
Nilai Array Indeks ke- 4 = 10
Nilai Array Indeks ke- 5 = 40
Nilai Array Indeks ke- 6 = 90
Nilai Array Indeks ke- 7 = 90
isi Array : 
40 50 30 20 10 40 90 90 
Menggunakan sequential Search
data : 30 ditemukan pada indeks 2
================================
menggunakan binary Search
data 30 tidak ditemukan