/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldinara
 */
public class tbl_siswa {
    private int no, tahunAjaran, kelas, nisn, tglLahir;
    private String nama, tempatLahir, namaIbuKandung, jenisKelamin;
    
    public tbl_siswa(){}
    
    public void setNo(int no){
        this.no = no;
    }
    
    public int getNo(){
        return this.no;
    }
    
    
    public void setTahunAjaran(int tahunAjaran){
        this.tahunAjaran = tahunAjaran;
    }
    
    public int getTahunAjaran(){
        return this.tahunAjaran;
    }
    
    
    public void setKelas(int kelas){
        this.kelas = kelas;
    }
    
    public int getKelas(){
        return this.kelas;
    }
   
    
    public void setNisn(int nisn){
        this.nisn = nisn;
    }
    
    public int getNisn(){
        return this.nisn;
    }
    

    public void setTglLahir(int tglLahir){
        this.tglLahir = tglLahir;
    }
    
    public int getTglLahir(){
        return this.tglLahir;
    }
   
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setTempatLahir(String tempatLahir){
        this.tempatLahir = tempatLahir;
    }
    
    public String getTempatLahir(){
        return this.tempatLahir;
    }
    
    
    public void setNamaIbuKandung(String namaIbuKandung){
        this.namaIbuKandung = namaIbuKandung;
    }
    
    public String getNamaIbuKandung(){
        return this.namaIbuKandung;
    }
    
    public void setJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getJenisKelamin(){
        return this.jenisKelamin;
    }
}
