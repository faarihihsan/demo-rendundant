package com.example.demo;

import javax.validation.constraints.NotNull;
import java.util.Set;

public class RencanaStudi {
    @NotNull
    private String namaMahasiswa;

    @NotNull
    private Set<String> daftarMatkul;

    public RencanaStudi() {
    }

    public RencanaStudi(String namaMahasiswa, Set<String> daftarMatkul) {
        this.namaMahasiswa = namaMahasiswa;
        this.daftarMatkul = daftarMatkul;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public Set<String> getDaftarMatkul() {
        return daftarMatkul;
    }

    public void setDaftarMatkul(Set<String> daftarMatkul) {
        this.daftarMatkul = daftarMatkul;
    }
}
