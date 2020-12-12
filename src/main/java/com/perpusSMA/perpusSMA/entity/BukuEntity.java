/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LAB320-PC17
*/
@Entity
@Table(name = "buku")
public class BukuEntity implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_buku;
    @Column(length = 255, nullable = false)
    private String judul_buku;
    @Column(length = 255, nullable = false)
    private String penerbit_buku;
    @Column(length = 255, nullable = false)
    private String pengarang_buku;
    @Column(length = 255, nullable = false)
    private String tahun_terbit_buku;

    /**
     * @return the id_buku
     */
    public Long getId_buku() {
        return id_buku;
    }

    /**
     * @param id_buku the id_buku to set
     */
    public void setId_buku(Long id_buku) {
        this.id_buku = id_buku;
    }

    /**
     * @return the judul_buku
     */
    public String getJudul_buku() {
        return judul_buku;
    }

    /**
     * @param judul_buku the judul_buku to set
     */
    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    /**
     * @return the penerbit_buku
     */
    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    /**
     * @param penerbit_buku the penerbit_buku to set
     */
    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }

    /**
     * @return the pengarang_buku
     */
    public String getPengarang_buku() {
        return pengarang_buku;
    }

    /**
     * @param pengarang_buku the pengarang_buku to set
     */
    public void setPengarang_buku(String pengarang_buku) {
        this.pengarang_buku = pengarang_buku;
    }

    /**
     * @return the tahun_terbit_buku
     */
    public String getTahun_terbit_buku() {
        return tahun_terbit_buku;
    }

    /**
     * @param tahun_terbit_buku the tahun_terbit_buku to set
     */
    public void setTahun_terbit_buku(String tahun_terbit_buku) {
        this.tahun_terbit_buku = tahun_terbit_buku;
    }
    

    
}
