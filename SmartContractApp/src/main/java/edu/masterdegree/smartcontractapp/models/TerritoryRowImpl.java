/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import edu.masterdegree.smartcontractapp.ethereum.Territory;

/**
 *
 * @author morfa_000
 */
public class TerritoryRowImpl implements TerritoryTableRow{

    private String territoryContractID;
    private String territoryID;
    private String ownerID;

    public TerritoryRowImpl(Territory territory) throws Exception {
        this.territoryContractID = territory.getContractAddress();
        this.territoryID = territory.getTerritoryID().send();
        this.ownerID = territory.getOwner().send();
    }

    public TerritoryRowImpl(String territoryContractID, String territoryID, String ownerID)
    {
        this.territoryContractID = territoryContractID;
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

    public String getTerritoryContractID() {
        return territoryContractID;
    }
}
