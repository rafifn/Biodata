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
public class Biodata {
        protected String nama ;
        private int umur ;
        private String alamat ;
        private String hobi ;
        private String kampus ;
        
        public Biodata(String nama){
            this.nama = nama ;
//            System.out.println("this is construct");
        }
       
        public void setNama (String nama){
            this.nama = nama ;
        }
        
        public String getNama () {
            return "Nama Saya Adalah " + nama;
        }
        
        
        
        /*public void setUmur (int umur) {
            this.umur = umur ;
        }
        
        public int getUmur () {
            return umur ;
        }
        
        public void setAlamat ( String alamat) {
            this.alamat = alamat ;
        }
        
        public String getAlamat () {
            return alamat ;
        }
        
        public void setHobi (String hobi) {
            this.hobi = hobi ;
        }
        
        public String getHobi () {
            return hobi ;
        }
        
        public void setKampus (String kampus) {
            this.kampus = kampus ;
        }
        
        public String getKampus () {
            return kampus ;
        }*/

    private String nama(String nama_Saya_Adalah) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

