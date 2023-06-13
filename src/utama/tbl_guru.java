package utama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldinara
 */
public class tbl_guru {
    private int  nip;
    private String nama, jabatan, jk, agama, alamat;
    
    public tbl_guru(){}
    
    
    public void setNip(int nip){
        this.nip = nip;
    }
    
    public int getNip(){
        return this.nip;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public String getJabatan(){
        return this.jabatan;
    }
    
    public void setJK(String jk){
        this.jk = jk;
    }
    
    public String getJK(){
        return this.jk;
    }
    
    public void setAgama(String agama){
        this.agama = agama;
    }
    
    public String getAgama(){
        return this.agama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    
}
