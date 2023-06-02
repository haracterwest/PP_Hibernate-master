package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Util.getConnection();
        UserServiceImpl userDaoJDBC = new UserServiceImpl();
        userDaoJDBC.dropUsersTable();
        userDaoJDBC.createUsersTable();

        userDaoJDBC.saveUser("Name1", "LastName1", (byte) 20);
        userDaoJDBC.saveUser("Name2", "LastName2", (byte) 25);
        userDaoJDBC.saveUser("Name3", "LastName3", (byte) 31);
        userDaoJDBC.saveUser("Name4", "LastName4", (byte) 38);

        List<User> allUsers = userDaoJDBC.getAllUsers();
        System.out.println("ВСЕ: " + allUsers.get(0).getName() + allUsers.get(1).getName() + allUsers.get(2).getName() + allUsers.get(3).getName());
        userDaoJDBC.removeUserById(1);
        userDaoJDBC.cleanUsersTable();
    }
}
