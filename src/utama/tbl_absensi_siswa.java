package utama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldinara
 */
public class tbl_absensi_siswa extends tbl_siswa{
    private String keterangan, tanggal;
    
    public tbl_absensi_siswa(){
        
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
