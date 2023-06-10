package utama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldinara
 */
public class tbl_absensi_siswa {
    private int nisn;
    private String keterangan, tanggal;
    
    public tbl_absensi_siswa(){
        
    }
    
    public void setNisn(int nisn){
        this.nisn = nisn;
    }
    
    public int getNisn(){
        return this.nisn;
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
