/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Nama : Rifky Maulana
 * NIM : 1301154180
 * KELAS : IF-39-12
 * @author JAY
 */
 
public class Mahasiswa {
    private String Nama,Nim,status;
    private char nilai[];
    private int x;
    
public Mahasiswa () {
    this.status = "Tidak Lulus";
    this.x = 0;
    this.nilai = new char[10];
}

public Mahasiswa (String Nama, String Nim){
    this.Nama = Nama;
    this.Nim = Nim;
    this.status = "Tidak Lulus";
    this.x = 0;
    this.nilai = new char[10];
}

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public char getNilai() {
        char k = this.nilai[x];
        return k;
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public int getx() {
        return x;
    }

    public void setx(int x) {
        this.x = x;
    }

public void addNilai(char nilai) {
    if (x < 10) {
        this.nilai[x] = nilai;
        x++;
    }
}

public String toString () {
    String mhs = Nim+ "," +Nama+ "," +status+ "=";
    for (int k = 0; k < x; k++) {
        mhs = mhs + nilai[k]+ ",";
    }
    return mhs;
} 

public char cekNilai(Mahasiswa m) {
    char l = 0;
    for (char n = 'A'; n < 'E'; n++) {
        for (int k = 0; k < x; k++) {
            if (nilai[k] == n) {
                return n;
            }
        }
    }
    return l;
}
}
