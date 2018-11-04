/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tika Yln
 */
public class Pemesanan {
    
    public DataPemesanan anggota;
    public Jahitan pesanJahitan;
    private int harga;
    private int banyak;
    private int hargaTotal;
    
    public Pemesanan(){
        
    }
    
    //pemberian konstruktor anggota dan pesanJahitan
    public Pemesanan(DataPemesanan anggotaBaru, Jahitan pesanJahitanBaru, int banyak, int harga){
        this.anggota = anggotaBaru;
        this.pesanJahitan = pesanJahitanBaru;
        this.banyak = banyak;
        this.harga = harga;
    }

    public DataPemesanan getAnggota() {
        return anggota;
    }

    public void setAnggota(DataPemesanan anggota) {
        this.anggota = anggota;
    }

    public Jahitan getPesanJahitan() {
        return pesanJahitan;
    }

    public void setPesanJahitan(Jahitan pesanJahitan) {
        this.pesanJahitan = pesanJahitan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBanyak() {
        return banyak;
    }

    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }
    
    //mengitung harga total
    /*public int getHargaTotal(){
       return hargaTotal;
    }*/
    
    public int getHargaTotal(){
        return hargaTotal = banyak * harga;
    }
    //pemanggilan data
    public void infoDataPemesan(){
        System.out.println("Nama            :"+anggota.getNama());
        System.out.println("Alamat          :"+anggota.getAlamat());
        System.out.println("Jenis Jahitan   :"+pesanJahitan.getJenisPesanan());
        System.out.println("Size            :"+pesanJahitan.getSize());
        System.out.println("Harga Total     :"+getHargaTotal());
    }
}
