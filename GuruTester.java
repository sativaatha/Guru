//Driver Class

import java.util.Scanner;

public class GuruTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = input.nextLine();
        System.out.println("Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println("ID : ");
        int id = input.nextInt();
        input.close();

        Guru falah = new Guru(id, nama, mapel, status);
        falah.print();
        //membuat objek
        //namaClass namaObjek = newConstructor();

        Guru pasha = new Guru(1227, "pasha", "Produktif", "Tetap");
        Guru aulia = new Guru(1324, "aulia", "Produktif", "Tetap");
        Guru widi = new Guru(1335, "widi", "Seni Budaya", "Tetap");
        Guru thoriq = new Guru(1227, "Thoriq", "Olahraga", "Tetap");
        Guru abidin = new Guru(1227, "Abidin", "Matematika", "Tetap");

        pasha.print();
        aulia.print();
        widi.print();
        thoriq.print();
        abidin.print();
    }
    
}
