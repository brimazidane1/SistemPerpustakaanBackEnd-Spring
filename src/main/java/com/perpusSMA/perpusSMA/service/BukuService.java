/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.service;

import com.perpusSMA.perpusSMA.entity.BukuEntity;
import com.perpusSMA.perpusSMA.repo.BukuRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LAB320-PC17
 */
@Service("bukuService")
@Transactional
public class BukuService {
    @Autowired
    private BukuRepo repo;

    public BukuEntity insert(BukuEntity buku) {
        return repo.save(buku);
    }
    
    public BukuEntity update(BukuEntity buku) {
        return repo.save(buku);
    }
    
    public boolean delete(Long id){
        repo.deleteById(id);
        return true;
    }
    
    public Optional<BukuEntity> getById(Long id){
        return repo.findById(id);
    }
    
    public List<BukuEntity> getAll(){
        return repo.findAllBuku();
    }
}
