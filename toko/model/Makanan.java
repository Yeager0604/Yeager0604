package model;

public class Makanan {
    private String idMakanan;
    private String namaMakanan;
    private int hargaMakanan;
    private boolean isAvailable;

    public Makanan setIdMakanan(String idMakanan) {
        this.idMakanan = idMakanan;
        return this;
    }

    public Makanan setNamMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
        return this;
    }

    public Makanan setHargaMakanan(int hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
        return this;
    }

    public Makanan setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * @return String return the idMakanan
     */
    public String getIdMakanan() {
        return idMakanan;
    }

    /**
     * @return String return the namaMakanan
     */
    public String getNamaMakanan() {
        return namaMakanan;
    }

    /**
     * @return int return the hargaMakanan
     */
    public int getHargaMakanan() {
        return hargaMakanan;
    }

    /**
     * @return boolean return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }

}
