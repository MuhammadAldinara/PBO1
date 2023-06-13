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
public class dataSetSiswa{
    private ArrayList<Integer> nisn;
    private ArrayList<Integer> kelas;
    private ArrayList<String> nama;
    private ArrayList<String> jenisKelamin;
    private ArrayList<String> alamat;
    
    // npm, kelas
    // nama, jenis kelamin, alamat
    
    public dataSetSiswa(){
        nisn = new ArrayList<>();
        kelas = new ArrayList<>();
        nama = new ArrayList<>();
        jenisKelamin = new ArrayList<>();
        alamat = new ArrayList<>();
    }
    
    public void addNisn(int value){
        nisn.add(value);
    }
    
    public ArrayList<Integer> getDataNisn(){
        return this.nisn;
    }
    
    public void addKelas(int value){
        kelas.add(value);
    }
    
    public ArrayList<Integer> getDataKelas(){
        return this.kelas;
    }
    
    public void addNama (String value){
        nama.add(value);
    }
    
    public ArrayList<String> getDataNama(){
        return this.nama;
    }
    
    public void addJenisKelamin(String value){
        jenisKelamin.add(value);
    }
    
    public ArrayList<String> getDataJenisKelamin(){
        return this.jenisKelamin;
    }
    
    public void addAlamat(String value){
        alamat.add(value);
    }
    
    public ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
    
    
//    public void tambahSiswa(int kelas, String jenisKelamin, 
//            String alamat){
//        
//        addKelas (kelas);
//        addJenisKelamin(jenisKelamin);
//        addAlamat(alamat);
//    }
}
