# Laporan Praktikum Algoritma & Struktur Data (GRAPH)

## Jawaban Pertanyaan 15.3.3
1. karena pada graph terdapat tiga data yang digunakan sehingga pada graph menggunakan double linked list yang didalam graph yaitu left,info, dan right.
2. looping pertama menunjuk pada vertex asal, dan pada  looping kedua menunjuk pada  vertex yang berhubungan dengan vertex asal
3. Perbedaan Graph dengan Binary Tree adalah Graph datanya bisa terhubung ke semua data artinya data yang terhubung oleh edge dapat kembali lagi ke vertex. Sedangkan Binary Tree adalah Graph yang dimana alur edge tidak bisa kembali lagi ke vertek .
4. Perbedaannya adalah edge yaitu Garis-garis penghubung antar simpul dalam graph disebut dengan lintasan edge. Misalnya ada V1-V2-V3-V4 yaitu didalam data berikut mengandung garis-garis penghubung antar simpul yaitu V1-V2,V2-V3,V3-V4.
5. Yaitu adjency list, adjency matrix, dan adjency map
6. Yaitu algoritma dijkstra untuk menentukan lintasan terpendek, algoritma brent untuk menentukan daur dalam graph, dan algoritma boruvska untuk menntukan pohon penjangkau minimum.
7. Tujuan pembuatan variabel tersebut adalah digunakan untuk  menyimpan data pada vertex atau node yang saling terhubung pada graph.
8. Karena ketika program yang dijalankan atau dirun , maka vertex yang berda di depan adalah vertex yang berada di belakang yang baru saja ditambahkan pada class main sehingga yang digunakan adalah method addFirst() karena vertex berada di depan. Dan jika menggunakan  method lain contohnya addLast() maka vertex yang terhubung yang lebih dulu ditambahkan di class main
9. Yang perlu dilakukan adalah dengan cara melakukan perulangan pada program sebeleum melakukan remove.
10. Dengan cara menambahkan remove edge

## Jawaban Pertanyaan 15.4.3
1. Perbedaan pada directed graph degree tidak berjumlah 2 kali dari edge karena pada directed graph terdiri dari  indegree dan outdegree yang dihitung masing-masing dan dijumlahkan. Sedangkan pada undirected graph, jumlah degree sebanyak 2 kali dari edge karena tidak ada indegree maupun outdegree yang membuat mengulang sebanyak dua kali.
2. Karena pada program tersebut index dimulai dari 0 sehingga melakukan penambahan 1 agar di index terakhir adan dan dapat terbaca oleh program
3. Method getEdge() digunakan untuk menampilkan suatu lintasan
4. Graph tersebut termasuk jenis directed graph dapat diketahui ketika memasukkan edge <to> <from> dan dapat dilihat dari matrix hasil representasi graph.
5. Karena pada method graphArray terdapat method yang digunakan untuk menampilkan vertex atau node tidak ada. Sehingga digunakannya try-catch Exception adalah agar tidak terjadi eror pada main saat program dijalankan.