/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataSet;

import java.util.ArrayList;
/**
 *
 * @author aldinara
 */
public class dataSetGuru {
    private ArrayList<Integer> nip;
    private ArrayList<String> nama;
    private ArrayList<String> jabatan;
    private ArrayList<String> jk;
    private ArrayList<String> agama;
    private ArrayList<String> alamat;
    
    //nip, nama, jabatan, jk, agama, alamat
    
    public dataSetGuru(){
        nip = new ArrayList<>();
        nama = new ArrayList<>();
        jabatan = new ArrayList<>();
        jk = new ArrayList<>();
        agama = new ArrayList<>();
        alamat = new ArrayList<>();
    }
    
    public void addNip(int value){
        nip.add(value);
    }
    
    public ArrayList<Integer> getDataNip(){
        return this.nip;
    }
    
    public void addNama (String value){
        nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
    public void addJabatan (String value){
        jabatan.add(value);
    }
    
    public ArrayList<String> getDataJabatan(){
        return this.jabatan;
    }
    
    public void addJk (String value){
        jk.add(value);
    }
    
    public ArrayList<String> getDataJk(){
        return this.jk;
    }
    
    public void addAgama (String value){
        agama.add(value);
    }
    
    public ArrayList<String> getDataAgama(){
        return this.agama;
    }
    
    public void addAlamat (String value){
        alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
//    public void tambahGuru(String jabatan, String jenisKelamin, 
//            String agama, String alamat){
//        
//        addJabatan (jabatan);
//        addJk(jenisKelamin);
//        addAgama(agama);
//        addAlamat(alamat);
//    }
}
