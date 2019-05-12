/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import edu.masterdegree.smartcontractapp.MainFrame;
import edu.masterdegree.smartcontractapp.ethereum.Territory;
import org.slf4j.LoggerFactory;

/**
 *
 * @author morfa_000
 */
public class TerritoryContractWrapperRowImpl implements TerritoryTableRow {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(MainFrame.class);

    private Territory territory;

    public TerritoryContractWrapperRowImpl(Territory territory) {
        this.territory = territory;
    }

    @Override
    public String getTerritoryID() {
        try {
            return territory.getTerritoryID().send().toString();
        } catch (Exception ex) {
            log.error("Error = ", ex);
            throw new RuntimeException("Unexpected exception!", ex);
        }
    }

    @Override
    public String getOwnerID() {
        try {
            return territory.getOwner().send().toString();
        } catch (Exception ex) {
            log.error("Error = ", ex);
            throw new RuntimeException("Unexpected exception!", ex);
        }
    }

}
