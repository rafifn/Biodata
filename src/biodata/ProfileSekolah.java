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
public class ProfileSekolah extends Biodata{
    public int nis;
    public String kelas;
    public String wali;
    
    @Override
    public String getNama () {
            return nama;
        }

    public ProfileSekolah(String nama) {
        super(nama);
    }

    public int getNis() {
        return nis;
    }

    public void setNis(int nis) {
        this.nis = nis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getWali() {
        return wali;
    }

    public void setWali(String wali) {
        this.wali = wali;
    }
    
}
