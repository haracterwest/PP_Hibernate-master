package jm.task.core.jdbc.dao;

import java.sql.PreparedStatement;

//import static jm.task.core.jdbc.util.Util.getConnection;

public class UserDaoJDBCImpl
//implements UserDao
 {


    public void createUsersTable() {
        String create = "CREATE TABLE users (ID BIGINT NOT Null GENERATED Always AS IDENTITY PRIMARY KEY, NAME VARCHAR, LASTNAME VARCHAR, AGE INT);";
        PreparedStatement preparedStatement;
//        try {
//            preparedStatement = getConnection().prepareStatement(create);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void dropUsersTable() {
        String dropUser = "DROP TABLE IF EXISTS users";
        PreparedStatement preparedStatement;
//        try {
//            preparedStatement = getConnection().prepareStatement(dropUser);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {

        String saveUser = "INSERT INTO users (NAME, LASTNAME, AGE) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement;
//        try {
//            preparedStatement = getConnection().prepareStatement(saveUser);
//            preparedStatement.setString(1, name);
//            preparedStatement.setString(2, lastName);
//            preparedStatement.setByte(3, age);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {
        String removeUserId = "DELETE FROM users WHERE ID=?";
        PreparedStatement preparedStatement;
//        try {
//            preparedStatement = getConnection().prepareStatement(removeUserId);
//            preparedStatement.setLong(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


//    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String getAll = "SELECT * FROM users";
//        PreparedStatement preparedStatement;
//        ResultSet rs;
//        try {
//            preparedStatement = getConnection().prepareStatement(getAll);
//            rs = preparedStatement.executeQuery();
//
//            while (rs.next()) {
//                Long id = rs.getLong("id");
//                String name = rs.getString("name");
//                String lastName = rs.getString("lastName");
//                int age = rs.getInt("age");
//                User user = new User(id, name, lastName, (byte) age);
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return users;
//    }


//    public void cleanUsersTable() {
//        String cleanUsers = "TRUNCATE users";
//        PreparedStatement preparedStatement;
//        try {
//            preparedStatement = getConnection().prepareStatement(cleanUsers);
//            preparedStatement.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
