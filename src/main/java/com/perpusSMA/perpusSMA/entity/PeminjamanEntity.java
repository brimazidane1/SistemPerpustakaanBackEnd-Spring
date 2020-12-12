/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.entity;

/**
 *
 * @author LAB320-PC17
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LAB320-PC17
*/
@Entity
@Table(name = "peminjaman")
public class PeminjamanEntity implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_peminjaman;
    @Column(length = 255, nullable = false)
    private String nis_siswa;
    @Column(length = 255, nullable = false)
    private String nama_siswa;
    @Column(length = 255, nullable = false)
    private String jurusan_siswa;
    @Column(length = 255, nullable = false)
    private String tgl_peminjaman;
    @Column(length = 255, nullable = false)
    private String tgl_pengembalian;
    @ManyToOne
    private BukuEntity buku;

    /**
     * @return the id_peminjaman
     */
    public Long getId_peminjaman() {
        return id_peminjaman;
    }

    /**
     * @param id_peminjaman the id_peminjaman to set
     */
    public void setId_peminjaman(Long id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    /**
     * @return the nis_siswa
     */
    public String getNis_siswa() {
        return nis_siswa;
    }

    /**
     * @param nis_siswa the nis_siswa to set
     */
    public void setNis_siswa(String nis_siswa) {
        this.nis_siswa = nis_siswa;
    }

    /**
     * @return the nama_siswa
     */
    public String getNama_siswa() {
        return nama_siswa;
    }

    /**
     * @param nama_siswa the nama_siswa to set
     */
    public void setNama_siswa(String nama_siswa) {
        this.nama_siswa = nama_siswa;
    }

    /**
     * @return the jurusan_siswa
     */
    public String getJurusan_siswa() {
        return jurusan_siswa;
    }

    /**
     * @param jurusan_siswa the jurusan_siswa to set
     */
    public void setJurusan_siswa(String jurusan_siswa) {
        this.jurusan_siswa = jurusan_siswa;
    }

    /**
     * @return the tgl_peminjaman
     */
    public String getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    /**
     * @param tgl_peminjaman the tgl_peminjaman to set
     */
    public void setTgl_peminjaman(String tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    /**
     * @return the tgl_pengembalian
     */
    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    /**
     * @param tgl_pengembalian the tgl_pengembalian to set
     */
    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    /**
     * @return the buku
     */
    public BukuEntity getBuku() {
        return buku;
    }

    /**
     * @param buku the buku to set
     */
    public void setBuku(BukuEntity buku) {
        this.buku = buku;
    }

    
    

}