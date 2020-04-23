/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2_QorinaAnindhitaP;

/**
 *
 * @author Qorina Anindhita Prameswari
 */
public class DataPariwisata {
    Tahun2018 head18;
    Tahun2019 head19;
    Tahun2020 head20;
    int size;

    public DataPariwisata() {
        head18 = null;
        head19 = null;
        head20 = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head18 == null && head19 == null && head20 == null;
    }
    public void addFirst(int item1, int item2, int item3) {
        head18 = new Tahun2018(item1, head18);
        head19 = new Tahun2019(item2, head19);
        head20 = new Tahun2020(item3, head20);
        size++;
    }
    public void add(int item1, int item2, int item3, int bln) throws Exception {
        int bulan = bln - 1;
        if (bulan < 0 || bulan > size) {
            throw new Exception("Nilai Index di Luar Batas!");
        }
        if (isEmpty() || bulan == 0) {
            addFirst(item1, item2, item3);
        } else {
            Tahun2018 tmp1 = head18;
            Tahun2019 tmp2 = head19;
            Tahun2020 tmp3 = head20;
            for (int i = 1; i < bulan; i++) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            Tahun2018 next1 = (tmp1 == null) ? null : tmp1.next;
            Tahun2019 next2 = (tmp2 == null) ? null : tmp2.next;
            Tahun2020 next3 = (tmp3 == null) ? null : tmp3.next;
            tmp1.next = new Tahun2018(item1, next1);
            tmp2.next = new Tahun2019(item2, next2);
            tmp3.next = new Tahun2020(item3, next3);
            size++;
        }
    }
    public void addLast(int item1, int item2, int item3) {
        if (isEmpty()) {
            addFirst(item1, item2, item3);
        } else {
            Tahun2018 tmp1 = head18;
            Tahun2019 tmp2 = head19;
            Tahun2020 tmp3 = head20;
            while (tmp1.next != null) {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
            }
            tmp1.next = new Tahun2018(item1, null);
            tmp2.next = new Tahun2019(item2, null);
            tmp3.next = new Tahun2020(item3, null);
            size++;
        }
    }
    public void getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List KOSONG!");
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println("1" + "\t" + head18.data + " " + head19.data + " " + head20.data);
    }
    public void getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List KOSONG!");
        }
        Tahun2018 tmp1 = head18;
        Tahun2019 tmp2 = head19;
        Tahun2020 tmp3 = head20;
        int bulan = 1;
        while (tmp1.next != null) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
            bulan++;
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    }
    public void get(int bln) throws Exception {
        int bulan = bln - 1;
        if (isEmpty() || bulan >= size) {
            throw new Exception("Tidak ada bulan tersebut!");
        }
        Tahun2018 tmp1 = head18;
        Tahun2019 tmp2 = head19;
        Tahun2020 tmp3 = head20;
        for (int i = 0; i < bulan; i++) {
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
            tmp3 = tmp3.next;
        }
        System.out.println("Bulan ke- 2018\t2019\t2020");
        System.out.println(bln + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
    }
    public void clear() {
        head18 = null;
        head19 = null;
        head20 = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            Tahun2018 tmp1 = head18;
            Tahun2019 tmp2 = head19;
            Tahun2020 tmp3 = head20;
            int bulan = 1;
            System.out.println("Bulan ke- 2018\t2019\t2020");
            while (tmp1 != null) {
                System.out.println(bulan + "\t" + tmp1.data + " " + tmp2.data + " " + tmp3.data);
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
                tmp3 = tmp3.next;
                bulan++;
            }
            System.out.println();
        } else {
            System.out.println("Linked List KOSONG!");

        }

    }
}

