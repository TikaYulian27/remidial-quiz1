/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tika Yln
 */
public class Jahitan {
    
    protected String jenisPesanan;
    protected String size;
    private int banyak;
    private int harga;
    private int hargaTotal;

    //pemberian setter getter pada class Jahitan
    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }

    public void setJenisPesanan(String jenisPesanan) {
        this.jenisPesanan = jenisPesanan;
    }
    
    public String getJenisPesanan() {
        return jenisPesanan;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public String getSize() {
        return size;
    }  

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
    

}
