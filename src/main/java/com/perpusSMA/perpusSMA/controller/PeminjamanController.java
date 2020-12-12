/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.controller;

import com.perpusSMA.perpusSMA.entity.BukuEntity;
import com.perpusSMA.perpusSMA.entity.PeminjamanEntity;
import com.perpusSMA.perpusSMA.service.PeminjamanService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LAB320-PC17
 */
@RestController
@RequestMapping("/peminjaman")//untuk load page
public class PeminjamanController {
    @Autowired
    private PeminjamanService peminjamanService;
    
    @RequestMapping(method = RequestMethod.POST)
    public PeminjamanEntity insert(@RequestBody PeminjamanEntity peminjaman){
        return peminjamanService.insert(peminjaman);
    }
    
        @RequestMapping(method = RequestMethod.PUT)
    public PeminjamanEntity update(@RequestBody PeminjamanEntity peminjaman){
        return peminjamanService.update(peminjaman);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_peminjaman}")
    public boolean delete(@PathVariable("id_peminjaman") Long id) {
        return peminjamanService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_peminjaman}")
    public List<PeminjamanEntity> getById(@PathVariable("id_peminjaman") Long id){
        return peminjamanService.findByBuku(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{nis_siswa}")
    public List<PeminjamanEntity> findByNIS(@PathVariable("nis_siswa") Long nis){
        return peminjamanService.findByNIS("%" + nis + "%");
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<PeminjamanEntity> getAll(){
        return peminjamanService.findAll();
    }
}
