/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

/**
 *
 * @author rf
 */
public class Main {
    public static void main(String[] args) {
        Biodata biodataAnak = new Biodata ("Rafi") ;
        System.out.println("" + biodataAnak.getNama ());
        
        ProfileSekolah sekolah = new ProfileSekolah ("rafi") ;
        System.out.println("" + sekolah.getNama());
   
        
        /*biodataAnak.setUmur (23) ;
        System.out.println("Umur    :" + biodataAnak.getUmur ());
        
        biodataAnak.setAlamat ("Candi Gebang") ;
        System.out.println("Alamat  :" + biodataAnak.getAlamat ());
        
        biodataAnak.setHobi ("Badminton") ;
        System.out.println("Hobi    :" + biodataAnak.getHobi ());
        
        biodataAnak.setKampus ("Amikom") ;
        System.out.println("Kampus  :" + biodataAnak.getKampus ());*/
    }
    
}
