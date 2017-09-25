/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author BangKho
 */
public class TestArray2 {
    int nis[][]={{210651},{210652},{210653}};
    String nama[][]={{"Akhmad Fiqi"},{"Antareza Ghifary"},{"Julian Marga"}};
    
    public void tampil(){
        System.out.println("Indentitas Siswa Angkatan 25");
    }
    public void NamaNis(){
        for(int i=0;i<3;i++){
            for(int j=0;j<1;j++){
                System.out.println(nama[i][j]+" : "+nis[i][j]);
            }
        }
    } 
    public static void main(String[]args){
        TestArray2 siswa = new TestArray2();
        siswa.tampil();
        siswa.NamaNis();
    }
}
