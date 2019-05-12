/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import edu.masterdegree.smartcontractapp.models.TerritoryTableRow;

/**
 *
 * @author morfa_000
 */
public class TerritoryRowImpl implements TerritoryTableRow{

    private String territoryID;
    private String ownerID;
    
    public TerritoryRowImpl(String territoryID, String ownerID)
    {
        this.territoryID = territoryID;
        this.ownerID = ownerID;
    }
    
    @Override
    public String getTerritoryID() {
        return territoryID;
    }

    @Override
    public String getOwnerID() {
        return ownerID;
    }
    
}
