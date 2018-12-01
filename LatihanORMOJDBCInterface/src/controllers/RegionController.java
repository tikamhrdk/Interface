/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface
import entities.Region;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author tikamhrdk
 */
public class RegionController {

    private SessionFactory factory;
    private DAOInterface daoi; 

    public RegionController() {
    }
//
//     public RegionController(SessionFactory factory) {
//        this.factory = factory;
//        this.daoi = new RegionDAO(factory);
//    }
    
//    public List<Region> getAll(){
//        return rdao.getAllRegions();
//    }
//    public List<Region> getById(Object id){
//        return rdao.getIdRegions(id);
//    }
//    public List<Region> getSearchRegion(Object data){
//        return rdao.getSearchRegion(data);
//    }
    public String insert(String id, String name){
        String result = "gagal";
        Region region = new Region(new BigDecimal(id),name);
        if (this.daoi.doDML(region, false)) 
            result = "Berhasil";
        return result;
    }
    public boolean update(Region region){
        return rdao.update(region);
    }
    public boolean delete(Region region){
        return rdao.delete(region);
    }
    
    
}

