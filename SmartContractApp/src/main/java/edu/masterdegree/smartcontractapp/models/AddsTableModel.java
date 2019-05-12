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

/**
 *
 * @author morfa_000
 */
public class AddsTableModel extends AbstractTableModel {

    private List<AddRow> addRows = new ArrayList<>();
    private List<String> columnNames = new ArrayList<String>() {
        {
            add("Название");
            add("Описание");
            add("Продавец");
            add("ID Территории");
            add("Цена");
        }
    };

    public AddsTableModel() {
    }

    @Override
    public int getRowCount() {
        return addRows.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AddRow addRow = addRows.get(rowIndex);

        switch (columnIndex) {
            case (0):
                return addRow.getName();
            case (1):
                return addRow.getDescription();
            case (2):
                return addRow.getSeller();
            case (3):
                return addRow.getTerritoryID();
            case (4):
                return addRow.getPrice();
        }
        throw new RuntimeException("Invalide column index!");
    }

    @Override
    public String getColumnName(int column) {
        return columnNames.get(column);
    }
    
    public void addRow(AddRow addRow) {
        int lastRow = getRowCount();
        addRows.add(addRow);
        fireTableChanged(new TableModelEvent(this, lastRow, lastRow,
                TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT));
    }

}
