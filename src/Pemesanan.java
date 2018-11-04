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
    
    public void pesan(Jahitan pesanJahitanBaru, DataPemesanan anggotaBaru){
        pesanJahitan = pesanJahitanBaru;
        anggota = anggotaBaru;
    }
    
    public void infoDataPemesan(){
       System.out.println("Nama            :"+anggota.getNama());
       System.out.println("Alamat          :"+anggota.getAlamat());
       System.out.println("Jenis Jahitan   :"+pesanJahitan.getJenisPesanan());
       System.out.println("Size            :"+pesanJahitan.getSize());
    }
}
