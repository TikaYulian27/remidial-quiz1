/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tika Yln
 */
public class Main {
    
    public static void main(String[] args){
        
        Jahitan pesanJahitan = new Jahitan();
        DataPemesanan anggota = new DataPemesanan();
        
        anggota.setNama("Tika Yulianti Cantik Sekali");
        anggota.setAlamat("Tulungagung");
        
        pesanJahitan.setSize("M");
        pesanJahitan.setJenisPesanan("Gaun Pesta");
        
        Pemesanan psn = new Pemesanan();
        psn.pesan(anggota, pesanJahitan);
        psn.infoDataPemesan();
    }
}
