package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Makanan;
import model.DetilPenjualan;
import model.Minuman;
import model.Pembeli;
import model.Penjual;
import model.Penjualan;

public class RestoController {
    HashMap<String, Makanan> makanans = new HashMap();
    HashMap<String, Minuman> minumans = new HashMap();
    ArrayList<Penjualan> penjualans = new ArrayList<>();
    HashMap<String, Pembeli> pembelis = new HashMap();
    HashMap<String, Penjual> penjuals = new HashMap();

    public void setUp() {
        Makanan makanan1 = new Makanan();
        Makanan makanan2 = new Makanan();
        Makanan makanan3 = new Makanan();
        Makanan makanan4 = new Makanan();
        makanan1
                .setIdMakanan("01")
                .setNamMakanan("Nasi ayam goreng")
                .setHargaMakanan(20000)
                .setIsAvailable(true);

        makanan2.setNamMakanan("Nasi bebek goreng").setIdMakanan("02").setHargaMakanan(30000).setIsAvailable(true);
        makanan3.setNamMakanan("Nasi Tahu dan tempe").setIdMakanan("03").setHargaMakanan(10000).setIsAvailable(true);
        makanan4.setIdMakanan("04").setNamMakanan("Nasi usus goreng").setHargaMakanan(7500).setIsAvailable(true);

        makanans.put(makanan1.getIdMakanan(), makanan1);
        makanans.put(makanan2.getIdMakanan(), makanan2);
        makanans.put(makanan3.getIdMakanan(), makanan3);
        makanans.put(makanan4.getIdMakanan(), makanan4);
    
        Minuman minuman1 = new Minuman();
        Minuman minuman2 = new Minuman();
        Minuman minuman3 = new Minuman();
        Minuman minuman4 = new Minuman();
        minuman1
                .setIdMinuman("01")
                .setNamMinuman("Teh manis")
                .setHargaMinuman(5000)
                .setIsAvailable(true);

        minuman2.setNamMinuman("Nutrisari").setIdMinuman("02").setHargaMinuman(5000).setIsAvailable(true);
        minuman3.setNamMinuman("Lemon tea").setIdMinuman("03").setHargaMinuman(5000).setIsAvailable(true);
        minuman4.setNamMinuman("Air mineral").setIdMinuman("04").setHargaMinuman(5000).setIsAvailable(true);

        minumans.put(minuman1.getIdMinuman(), minuman1);
        minumans.put(minuman2.getIdMinuman(), minuman2);
        minumans.put(minuman3.getIdMinuman(), minuman3);
        minumans.put(minuman4.getIdMinuman(), minuman4);

        Pembeli pembeli1 = new Pembeli();
        Pembeli pembeli2 = new Pembeli();
        pembeli1.setIdPembeli("01").setName("Heru").setAlamat("Bandung").setEmail("heru@gmail.com");
        pembeli2.setIdPembeli("02").setName("Budi").setAlamat("Jakarta").setEmail("budi@gmail.com");
        pembelis.put(pembeli1.getIdPembeli(), pembeli1);
        pembelis.put(pembeli2.getIdPembeli(), pembeli2);

        Penjual penjual1 = new Penjual();
        Penjual penjual2 = new Penjual();
        penjual1.setIdPenjual("01").setAlamat("Bandung").setEmail("usop@gmail.com").setName("Usop");
        penjual2.setIdPenjual("02").setAlamat("Bandung").setEmail("zoroo@gmail.com").setName("Zoro");
        penjuals.put(penjual1.getIdPenjual(), penjual1);
        penjuals.put(penjual2.getIdPenjual(), penjual2);
    }

    public void lihatDaftarMakanan() {
        System.out.println();
        System.out.println("==== Daftar Makanan ====");
        for (Map.Entry<String, Makanan> makanan : makanans.entrySet()) {
            String key = makanan.getKey();
            Makanan tMakanan = makanan.getValue();
            if (tMakanan.isIsAvailable()) {
                System.out.println("Kode Makanan \t :" + key);
                System.out.println("Nama \t\t :" + tMakanan.getNamaMakanan());
                System.out.println("Harga \t\t :" + tMakanan.getHargaMakanan());
                     
            }
        }
           }

    public void lihatDaftarMinuman() {
        System.out.println();
        System.out.println("==== Daftar Minuman ====");
        for (Map.Entry<String, Minuman> minuman : minumans.entrySet()) {
            String Key = minuman.getKey();
            Minuman tMinuman = minuman.getValue();
            if (tMinuman.isIsAvailable()) {
                System.out.println("Kode Minuman \t :" + Key);
                System.out.println("Nama \t\t :" + tMinuman.getNamaMinuman());
                System.out.println("Harga \t\t :" + tMinuman.getHargaMinuman());       

            }
        }
           }

    public Makanan getMakanan(String idMakanan) {
        return makanans.get(idMakanan);    }

     public Minuman getMinuman(String idMinuman) {
        return minumans.get(idMinuman);
    }

    public Penjual getPenjual(String idPenjual) {
        return penjuals.get(idPenjual);
    }

    public Pembeli getPembeli(String idPembeli) {
        return pembelis.get(idPembeli);
    }

    
    public void belanja() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetilPenjualan> tDetilPenjualans = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan masukkan kode barang\t: ");
                String kodeMakanan = input.readLine();
                System.out.print("Silahkan masukkan kode minuman\t: ");
                String kodeMinuman = input.readLine();
                System.out.print("Jumlah yang akan dibeli\t: ");
                int jumlahMakanan = Integer.valueOf(input.readLine());
                System.out.print("Jumlah yang akan dibeli\t: ");
                int jumlahminuman = Integer.valueOf(input.readLine());
                System.out.print("Jumlah Uang (Y/N)?\t: ");
                int nominal = Integer.valueOf(input.readLine());

                lanjut = input.readLine();

                DetilPenjualan dp = new DetilPenjualan();
                Makanan tMakanan = getMakanan(kodeMakanan);
                Minuman tMinuman = getMinuman(kodeMinuman);
                dp.setIdDetilPenjualan("dp" + increment);
                dp.setMakanan(tMakanan);
                dp.setMinuman(tMinuman);
                dp.setHargaMakanan(tMakanan.getHargaMakanan());
                dp.setHargaMinuman(tMinuman.getHargaMinuman());
                dp.setJumlahMakanan(jumlahMakanan);
                dp.setJumlahMinuman(jumlahminuman);
                dp.setNominalUang( nominal);
                dp.setSubTotalMakanan(tMakanan.getHargaMakanan() * jumlahMakanan);
                dp.setSubTotalMinuman(tMinuman.getHargaMinuman() * jumlahminuman);

                tDetilPenjualans.add(dp);

            } while (lanjut.equalsIgnoreCase("Y"));

            System.out.println("");
            System.out.println("===Berikut Daftar Belanjaan Anda===");
            tampilkanDaftarBelanjaan(tDetilPenjualans);
            System.out.println("KEMBALIAN: " + hitungTotalKembalian(tDetilPenjualans));
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));    
            System.out.println("Konfirmasi pembelian (Y/N)?");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                Penjualan penjualan = new Penjualan();
                penjualan.setDetilPenjualans(tDetilPenjualans)
                        .setIdPenjualan("P" + penjualans.size() + 1)
                        .setPembeli(getPembeli("02"))
                        .setPenjual(getPenjual("01"))
                        .setTanggal(LocalDate.now())
                        .setKembalian(hitungTotalKembalian(tDetilPenjualans));
                penjualans.add(penjualan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tampilkanDaftarBelanjaan(ArrayList<DetilPenjualan> dp) {
        for (DetilPenjualan detilPenjualan : dp) {
            System.out.println("Nama Makanan \t :" + detilPenjualan.getMakanan().getNamaMakanan());
            System.out.println("Nama Minuman \t :" + detilPenjualan.getMinuman().getNamaMinuman());
            System.out.println("Harga \t :" + detilPenjualan.getHargaMakanan());
            System.out.println("Harga \t :" + detilPenjualan.getHargaMinuman());
            System.out.println("Jumlah Makanan\t :" + detilPenjualan.getJumlahMakanan());
             System.out.println("Jumlah Minuman\t :" + detilPenjualan.getJumlahMinuman());
            System.out.println("");
        }
    }

    public int hitungTotalKembalian(ArrayList<DetilPenjualan> dp) {
        int kembalian = 0;
        for (DetilPenjualan detilPenjualan : dp) {
            kembalian +=detilPenjualan.getJumlahKembalian();
        }
        return kembalian;
    
     
        }
    public void historyPenjualan() {
        for (Penjualan penjualan : penjualans) {
            System.err.println();
            System.out.println("Kode Penjualan \t :"+penjualan.getIdPenjualan());
            System.out.println("Tanggal transaksi \t :"+penjualan.getTanggal());
            System.out.println("Penjual \t \t : "+penjualan.getPenjual().getName());
            System.out.println("Pembeli \t \t : "+penjualan.getPembeli().getName());
            System.out.println("=========================");
            ArrayList<DetilPenjualan> detilPenjualans = penjualan.getDetilPenjualans();
            for (DetilPenjualan dp : detilPenjualans) {
                System.out.println("Nama makanan \t \t : " + dp.getMakanan().getNamaMakanan());
                System.out.println("Jumlah makanan \t \t : " + dp.getJumlahMakanan());
                System.out.println("Subtotal \t \t : " + dp.getsubTotalMakanan());
                System.out.println("Nama minuman \t \t : " + dp.getMinuman().getNamaMinuman());
                System.out.println("Jumlah minuman \t \t : " + dp.getJumlahMinuman());
                System.out.println("Subtotal \t \t : " + dp.getSubTotalMinuman());
                System.out.println("Nominal uang \t \t : " + dp.getNominalUang());

            }
            System.out.println("=========================");
            System.out.println("Kembalian \t \t : "+penjualan.getKembalian());
        }
    }

}