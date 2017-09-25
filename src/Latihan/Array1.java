package Latihan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BangKho
 */
public class Array1 {
    public static void main(String[]args){
        int nilai[] = new int[3];
        nilai[0]=70;
        nilai[1]=86;
        nilai[2]=93;
        double rata = .0;
        
        for(int i=0;i<nilai.length;i++){
            rata += nilai[i];
            rata/=nilai.length;
        }
         System.out.println("Nilai Rata-Rata = "+rata);
    }
}
