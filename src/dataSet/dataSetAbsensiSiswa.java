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
public class dataSetAbsensiSiswa extends dataSetSiswa{
    private ArrayList<String> keterangan;
    private ArrayList<String> tanggal;
    
    
    public dataSetAbsensiSiswa(){
        keterangan = new ArrayList<>();
        tanggal = new ArrayList<>();
    }
    
    
    public void addKeterangan (String value){
        keterangan.add(value);
    }
    
    public ArrayList<String> getDataKeterangan(){
        return this.keterangan;
    }
    
    //
    
    public void addTanggal (String value){
        tanggal.add(value);
    }
    
    public ArrayList<String> getDataTanggal(){
        return this.tanggal;
    }

}
