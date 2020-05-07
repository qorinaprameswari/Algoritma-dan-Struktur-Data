# Laporan Praktikum Binary Tree

## Jawaban Pertanyaan
1. Binary Tree Search lebih efektif dari pada Binary Tree biasa karena pada Binary Tree Search menerapkan sifat khusus yaitu semua semua left child harus lebih
kecil dari pada right child dan parentnya. Sehingga dapat memudahkan ketika
proses searching node tertentu.
2. Penggunan atribut left yaitu jika nilai yang dimasukkan lebih kecil dari nilai diatasnya, sedangkan atribut right digunakan untuk menempatkan nilai yang lebih besar dari node root
3. a. Atribut root digunakan sebagai patokan angka yang pertama diisi
   b. nilai dari root masih kosong/NULL
4. Node baru yang ditambahkan akan manjadi node root, karena node root harus terisi sebelum node node berikutnya
5.	Jika data yang baru lebih kecil dari data yang paling awal dan data paling kiri sudah berisi data maka data yang paling awal akan ditempatkan di bagian kiri dan jika data paling kiri masih kosong/null maka data di bagian kiri akan menjadi node baru
6. • Pre-order : cetak isi node yang  dikunjungi, kunjungi left son, kunjungi right son
   • In - Order: kunjungi left son, cetak isi node yang dikunjungi, kunjungi right son 
   • Post-Order : kunjungi left son, kunjungi right son, cetak isi node yang dikunjungi. 
7. Diperlukan karena selama sebelum menemukan nilai yang sama, jika nilai yang dicari lebih kecil dari nilai yang disimpan dalam Node maka bergerak ke left child begitu juga sebaliknya 
8. IsLeftChild digunakan untuk mengecek posisi yang akan di delete pada bagian kiri dari sebuah parent
9.	getSuccesor menggantikan node yang dihapus yang memiliki anak
10. Memakai cara yang ke 2, yaitu mencari nilai terkecil dari subtree disebelah kananya
11.	Atribut idxLast menyimpan sebuah nilai kedalam sebuah indeks array jadi jika kita idxLast yaitu 9, maka data yang ditampilkan sampai index ke 9
12.	Kegunaan method populateData() disini yaitu untuk mengisikan sebuah nilai pada array dan menentukan indeks array nya. sedangkan kegunaan method traverserInOrder() untuk mengunjungi left son, mencetak isi node yang dikunjungi, mengunjungi right son. 
13.	Posisi left child jika node array yang ditambahkan di indeks ke-2 berada di indeks ke-3 dan posisi right childnya berada di indeks ke-4