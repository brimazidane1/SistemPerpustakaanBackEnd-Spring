/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.repo;

import com.perpusSMA.perpusSMA.entity.BukuEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 *
 * @author LAB320-PC17
 */
public interface BukuRepo extends CrudRepository<BukuEntity, Long> {
    @Query("select b from BukuEntity b")
    public List<BukuEntity> findAllBuku();
}
