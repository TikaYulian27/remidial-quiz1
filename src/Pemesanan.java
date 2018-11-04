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
    
    //pemberian konstruktor anggota dan pesanJahitan
    public void pesan(DataPemesanan anggotaBaru, Jahitan pesanJahitanBaru){
        anggota = anggotaBaru;
        pesanJahitan = pesanJahitanBaru;
        
    }
    
    //pemanggilan data
    public void infoDataPemesan(){
        System.out.println("Nama            :"+anggota.getNama());
        System.out.println("Alamat          :"+anggota.getAlamat());
        System.out.println("Jenis Jahitan   :"+pesanJahitan.getJenisPesanan());
        System.out.println("Size            :"+pesanJahitan.getSize());
    }
}
