package edu.masterdegree.smartcontractapp;

import net.miginfocom.swing.MigLayout;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.datatypes.Type;

import javax.swing.*;
import java.awt.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.UUID;

public class TestMain {

    private static String login = "0x2bc9f77f9d34bfcd6779cfe9e9d07e62b7d1afb8";

    public static void main(String[] args) {

        JTextField nameField = new JTextField(15);
        JTextField descriptionField = new JTextField(15);
        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(100, 1, Integer.MAX_VALUE, 100);
        JSpinner priceSpinner = new JSpinner(spinnerNumberModel);
        String[] territoriesIDs = {"32","35454"};
        JComboBox<String> territoryCombobox = new JComboBox<>(territoriesIDs);
        JPanel myPanel = new JPanel();
        myPanel.setLayout(new MigLayout("fillx"));

        myPanel.add(new JLabel("Имя:"));
        myPanel.add(nameField, "wrap");
        myPanel.add(new JLabel("Описание:"));
        myPanel.add(descriptionField, "wrap");
        myPanel.add(new JLabel("Цена:"));
        myPanel.add(priceSpinner, "wrap");
        myPanel.add(new JLabel("Территория:"));
        myPanel.add(territoryCombobox);


        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Новый контракт", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            System.out.println("x value: " + nameField.getText());
            System.out.println("y value: " + descriptionField.getText());
        }
    }
}
