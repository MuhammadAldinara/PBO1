package utama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldinara
 */
public class tbl_siswa {
    private int nisn, kelas;
    private String nama, jenisKelamin, alamat;
    
    
    // nisn, kelas
    // nama, jenis kelamin, alamat
    
    
    public tbl_siswa(){}
    
    public void setNisn(int nisn){
        this.nisn = nisn;
    }
    
    public int getNisn(){
        return this.nisn;
    }
    
    public void setKelas(int kelas){
        this.kelas = kelas;
    }
    
    public int getKelas(){
        return this.kelas;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
}
