/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.repo;

import com.perpusSMA.perpusSMA.entity.PeminjamanEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author LAB320-PC17
 */
public interface PeminjamanRepo extends CrudRepository<PeminjamanEntity, Long> {
    @Query("select p from PeminjamanEntity p")
    public List<PeminjamanEntity> findAllPeminjaman();
    
    @Query("select p from PeminjamanEntity p where p.buku.id= :id")
    public List<PeminjamanEntity> findByBuku(@Param("id") Long id);
    
    @Query("select p from PeminjamanEntity p where LOWER(p.nis_siswa) LIKE LOWER(:nis_siswa)")
    public List<PeminjamanEntity> findByNIS(@Param("nis_siswa") String nis_siswa);
}
