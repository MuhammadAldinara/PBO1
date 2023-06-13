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
public class dataSetLogin {
    private ArrayList<String> username;
    private ArrayList<String> password;
    
    // npm, kelas
    // nama, jenis kelamin, alamat
    
    public dataSetLogin(){
        username = new ArrayList<>();
        password = new ArrayList<>();
    }
    
    public void addUsername (String value){
        username.add(value);
    }
    
    public ArrayList<String> getDataUsername(){
        return this.username;
    }
    
    public void addPassword(String value){
        password.add(value);
    }
    
    public ArrayList<String> getDataPassword(){
        return this.password;
    }
}
