/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import edu.masterdegree.smartcontractapp.MainFrame;
import edu.masterdegree.smartcontractapp.ethereum.SellTerritory;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author morfa_000
 */
public class SellTerritoryRow implements AddRow {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(SellTerritoryRow.class);

    private SellTerritoryPOJO sellTerritory;

    public SellTerritoryRow(SellTerritoryPOJO sellTerritory) {
        this.sellTerritory = sellTerritory;
    }

    @Override
    public String getName() {
        return sellTerritory.getName();
    }

    @Override
    public String getDescription() {
        return sellTerritory.getDescription();
    }

    @Override
    public String getTerritoryID() {
        return sellTerritory.getTerrritoryID();
    }

    @Override
    public String getSeller() {
        return sellTerritory.getSellerID();
    }

    @Override
    public BigInteger getPrice() {
        return sellTerritory.getPrice();
    }

}
