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
public class MainDataPariwisata {
    public static void main(String[] args) {
        DataPariwisata data = new DataPariwisata();
        
        try {
            data.addFirst(475544, 2343240, 2845672);
            data.addLast(1985572, 2546836, 3456566);
            data.addLast(2076432, 2436456, 2341653);
            data.addLast(2165239, 1943656, 2734562);
            data.addLast(2283546, 2453425, 2534400);
            data.addLast(2344460, 2754240, 2346307);
            data.addLast(2635040, 3256404, 943734);
            data.addLast(2958672, 3454645, 2234544);
            data.addLast(3047626, 3698200, 2398636);
            data.addLast(2843543, 4138479, 2345346);
            data.addLast(2734526, 3743756, 1546256);
            data.addLast(2523400, 3398320, 2453435);
            data.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
