/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import edu.masterdegree.smartcontractapp.ethereum.SellTerritory;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author morfa_000
 */
public class SellTerritoryPOJO {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(SellTerritoryPOJO.class);

    private String contractAddress;
    private String name;
    private String description;
    private BigInteger price;
    private String sellerID;
    private String territoryContractID;
    private String terrritoryID;

    public SellTerritoryPOJO(SellTerritory sellTerritory, String terrritoryID) {
        try {
            this.contractAddress = sellTerritory.getContractAddress();
            this.name = sellTerritory.getName().send();
            this.description = sellTerritory.getName().send();
            this.price = sellTerritory.getPrice().send();
            this.sellerID = sellTerritory.getContractOwner().send();
            this.territoryContractID = sellTerritory.getTerritoryID().send();
            this.terrritoryID = terrritoryID;
        } catch (Exception ex) {
            log.error("Error = ", ex);
            throw new RuntimeException("Unexpected exception!", ex);
        }
    }

    public static org.slf4j.Logger getLog() {
        return log;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigInteger getPrice() {
        return price;
    }

    public String getSellerID() {
        return sellerID;
    }

    public String getTerritoryContractID() {
        return territoryContractID;
    }

    public String getTerrritoryID() {
        return terrritoryID;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    
    
}
