package edu.masterdegree.smartcontractapp;

import java.sql.*;

public class TestMain {

    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "1234";

    public Connection connect() throws SQLException {

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();

        }

        return DriverManager.getConnection(url, user, password);
    }

    private static String currentUser = "0x2bc9f77f9d34bfcd6779cfe9e9d07e62b7d1afb8";

    public static void main(String[] args) throws SQLException {
        TestMain test = new TestMain();

        Connection con = test.connect();

        System.out.println("Con = " + con);

        PreparedStatement preparedStatement = null;
        // ? - место вставки нашего значеня
        preparedStatement = con.prepareStatement(
                "select contract_id from territories\n" +
                        "where owner_id = ?");

        preparedStatement.setString(1, currentUser);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next())
        {
            System.out.println(resultSet.getString(1));
        }

        preparedStatement = con.prepareStatement("" +
                "INSERT INTO territories(owner_id, contract_id)\n" +
                "VALUES\n" +
                " (?, ?)");
        preparedStatement.setString(1, currentUser);
        preparedStatement.setString(2,"test");

        preparedStatement.executeUpdate();

        preparedStatement = con.prepareStatement(
                "select contract_id from territories\n" +
                        "where owner_id = ?");

        preparedStatement.setString(1, currentUser);

        resultSet = preparedStatement.executeQuery();

        while (resultSet.next())
        {
            System.out.println(resultSet.getString(1));
        }

        preparedStatement = con.prepareStatement("delete from territories where owner_id = ?");
        preparedStatement.setString(1, currentUser);
        preparedStatement.executeUpdate();

     //   con.commit();

    }
}
