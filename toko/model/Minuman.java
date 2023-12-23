package model;

public class Minuman {
    private String idMinuman;
    private String namaMinuman;
    private int hargaMinuman;
    private boolean isAvailable;

    public Minuman setIdMinuman(String idminuman) {
        this.idMinuman = idminuman;
        return this;
    }

    public Minuman setNamMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
        return this;
    }

    public Minuman setHargaMinuman(int hargaMinuman) {
        this.hargaMinuman = hargaMinuman;
        return this;
    }

    public Minuman setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    /**
     * @return String return the idMinuman
     */
    public String getIdMinuman() {
        return idMinuman;
    }

    /**
     * @return String return the namaMinuman
     */
    public String getNamaMinuman() {
        return namaMinuman;
    }

    /**
     * @return int return the hargaMinuman
     */
    public int getHargaMinuman() {
        return hargaMinuman;
    }

    /**
     * @return boolean return the isAvailable
     */
    public boolean isIsAvailable() {
        return isAvailable;
    }
  
}
