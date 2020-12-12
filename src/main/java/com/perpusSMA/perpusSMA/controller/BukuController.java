/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.perpusSMA.perpusSMA.controller;

import com.perpusSMA.perpusSMA.entity.BukuEntity;
import com.perpusSMA.perpusSMA.service.BukuService;
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
@RequestMapping("/buku")//untuk load page
public class BukuController {
    @Autowired //untuk load categoryservice
    private BukuService bukuService;
    
    
    @RequestMapping(method = RequestMethod.POST)
    public BukuEntity insert(@RequestBody BukuEntity buku) {
        return bukuService.insert(buku);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public BukuEntity update(@RequestBody BukuEntity buku) {
        return bukuService.update(buku);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_buku}")
    public boolean delete(@PathVariable("id_buku") Long id) {
        return bukuService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_buku}")
    public Optional<BukuEntity> getById(@PathVariable("id_buku") Long id){
        return bukuService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<BukuEntity> getAll(){
        return bukuService.getAll();
    }
}
