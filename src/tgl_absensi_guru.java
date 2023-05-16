/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldinara
 */
public class tgl_absensi_guru {
    private int nip;
    private String jabatan, keterangan, tanggal;

    public tgl_absensi_guru(){}
    
    public void setNip(int nip){
        this.nip = nip;
    }
    
    public int getNip(){
        return this.nip;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
    
    public String getKeterangan(){
        return this.keterangan;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getTanggal(){
        return this.tanggal;
    }
}

