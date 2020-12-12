/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.service;

import com.perpusSMA.perpusSMA.entity.PeminjamanEntity;
import com.perpusSMA.perpusSMA.repo.PeminjamanRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author LAB320-PC17
 */
@Service("peminjamanService")
@Transactional
public class PeminjamanService {
    @Autowired
    private PeminjamanRepo repo;

    public PeminjamanEntity insert(PeminjamanEntity peminjaman) {
        return repo.save(peminjaman);
    }
    
        public PeminjamanEntity update(PeminjamanEntity peminjaman) {
        return repo.save(peminjaman);
    }

    public boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }

    public List<PeminjamanEntity> findAll() {
        return repo.findAllPeminjaman();
    }

    public List<PeminjamanEntity> findByBuku(Long bukuId) {
        return repo.findByBuku(bukuId);
    }

    public List<PeminjamanEntity> findByNIS(String nis) {
        return repo.findByNIS("%" + nis + "%");
    }
}
