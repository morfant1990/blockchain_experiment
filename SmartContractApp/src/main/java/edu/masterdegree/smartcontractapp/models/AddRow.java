/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import java.math.BigInteger;

/**
 *
 * @author morfa_000
 */
public interface AddRow {
    
    String getName();
    String getDescription();
    String getTerritoryID();
    String getSeller();
    BigInteger getPrice();
    
}
