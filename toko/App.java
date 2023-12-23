
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import controller.RestoController;
import model.Makanan;
import model.Minuman;
import model.Pembeli;
import model.Penjual;

public class App {

    public static void main(String[] args) throws Exception {
        RestoController restoController = new RestoController();
        restoController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu:");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    restoController.lihatDaftarMakanan();
                    break;
                case "2":
                    restoController.lihatDaftarMinuman();
                    break;
                 case "3":
                    restoController.belanja();
                    break;
                case "4":
                    restoController.historyPenjualan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Sampai Jumpa");

    }

    public static void tampilkanMenu() {
        System.out.println("1. Lihat daftar makanan");
        System.out.println("2. Lihat daftar minuman");
        System.out.println("3. Belanja");
        System.out.println("4. Struk belanja");
        System.out.println("5. Keluar");
    }
}