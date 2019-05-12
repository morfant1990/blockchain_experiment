/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.masterdegree.smartcontractapp.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelEvent;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author morfa_000
 */
public class TerritoryTableModel extends AbstractTableModel {

    private List<TerritoryTableRow> territoryList;

    public TerritoryTableModel() {
        territoryList = new ArrayList<TerritoryTableRow>();
    }

    @Override
    public int getRowCount() {
        return territoryList.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        TerritoryTableRow territoryTableRow = territoryList.get(rowIndex);

        return columnIndex == 0 ? territoryTableRow.getOwnerID() : territoryTableRow.getTerritoryID();
    }

    @Override
    public String getColumnName(int column) {
        return column == 0 ? "ID Владельца" : "ID Территории";
    }

    public void addRow(TerritoryTableRow territoryTableRow) {
        int lastRow = getRowCount();
        territoryList.add(territoryTableRow);
        fireTableChanged(new TableModelEvent(this, lastRow, lastRow,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
    }
}
