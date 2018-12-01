/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Region;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Ignatius
 */
public interface RegionDAOInterface1 {
    public boolean insertOrUpdateOrDelete(Region region, boolean isDelete);
    public List<Region> getAllRegions();
    public List<Region> searchRegions(String data);
    public Region getRegionById(BigDecimal regionId);    
}
