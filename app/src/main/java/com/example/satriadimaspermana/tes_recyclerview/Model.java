package com.example.satriadimaspermana.tes_recyclerview;

/**
 * Created by Satria Dimas Permana on 7/11/2016.
 */
public class Model {
    String nama, alamat;

    public Model(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
