package model;

public class DetilPenjualan {
    private String idDetilPenjualan;
    private Penjualan penjualan;
    private Makanan makanan;
    private Minuman minuman;
    private int hargaMakanan;
    private int hargaMinuman;
    private int jumlahMakanan;
    private int jumlahMinuman;
    private int nominalUang;
    private int subTotalMakanan;
    private int subTotalMinuman;
    private int jumlahKembalian;

    /**
     * @return String return the idDetilPenjualan
     */
    public String getIdDetilPenjualan() {
        return idDetilPenjualan;
    }

    /**
     * @param idDetilPenjualan the idDetilPenjualan to set
     */
    public void setIdDetilPenjualan(String idDetilPenjualan) {
        this.idDetilPenjualan = idDetilPenjualan;
    }

    /**
     * @return Penjualan return the penjualan
     */
    public Penjualan getPenjualan() {
        return penjualan;
    }

    /**
     * @param penjualan the penjualan to set
     */
    public void setPenjualan(Penjualan penjualan) {
        this.penjualan = penjualan;
    }

    /**
     * @return Barang return the barang
     */
    public Makanan getMakanan() {
        return makanan;
    }

    /**
     * @param barang the barang to set
     */
    public void setMakanan(Makanan makanan) {
        this.makanan = makanan;
    }

    /**
     * @return Minuman return the Minuman
     */
    public Minuman getMinuman() {
        return minuman;
    }

    /**
     * @param minuman the minuman to set
     */
    public void setMinuman(Minuman minuman) {
        this.minuman = minuman;
    }

    /**
     * @return int return the hargaMakanan
     */
    public int getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

    /**
     * @return int return the hargaMinuman
     */
    public int getHargaMinuman() {
        return hargaMinuman;
    }

    /**
     * @param hargaMinuman the hargaMinuman to set
     */
    public void setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
    }

    /**
     * @return int return the jumlahMakanan
     */
    public int getJumlahMakanan() {
        return jumlahMakanan;
    }

    /**
     * @param jumlahMinuman the jumlahMinuman to set
     */
    public void setJumlahMakanan(int jumlahMakanan) {
        this.jumlahMakanan = jumlahMakanan;
    }

    /**
     * @return int return the jumlahMinuman
     */
    public int getJumlahMinuman() {
        return jumlahMinuman;
    }

    /**
     * @param jumlahMinuman the jumlahMinuman to set
     */
    public void setJumlahMinuman(int jumlahMinuman) {
        this.jumlahMinuman = jumlahMinuman;
    }

    /**
     * @return int return the nominalUang
     */
    public int getNominalUang() {
        return nominalUang;
    }

    /**
     * @param nominalUang the subTotal to set
     */
    public void setNominalUang(int nominalUang) {
        this.nominalUang = nominalUang;
    }

    /**
     * @return int return the subTotalMakanan
     */
    public int getsubTotalMakanan() {
        return subTotalMakanan;
    }

    /**
     * @param subTotalMakanan the subTotalMakanan to set
     */
    public void setSubTotalMakanan(int subTotalMakanan) {
        this.subTotalMakanan = subTotalMakanan;
    }

    /**
     * @return int return the subTotalMinuman
     */
    public int getSubTotalMinuman() {
        return subTotalMinuman;
    }

    /**
     * @param subTotalMinuman the subTotalMinuman to set
     */
    public void setSubTotalMinuman(int subTotalMinuman) {
        this.subTotalMinuman = subTotalMinuman;
    }

    
    /**
     * @return int return the nominalUang - subTotalBarang + subTotalMinuman
     */
    public int getJumlahKembalian() {
        return nominalUang -  subTotalMakanan - subTotalMinuman;
    }

    /**
     * @param hitungKembalian the hitungKembalian to set
     */
    public void setJumlahKembalian(int jumlahKembalian) {
        this.jumlahKembalian = jumlahKembalian;
    }

}
