package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {

    public static void main(String[] args) {

        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

//        userDaoHibernate.saveUser("King", "Kong", (byte) 25);
//        userDaoHibernate.saveUser("Tom", "Hanks", (byte) 55);
//        userDaoHibernate.saveUser("Jon", "Travolta", (byte) 30);
//        userDaoHibernate.saveUser("Adam", "Smith", (byte) 50);
        userDaoHibernate.removeUserById(4);
//        System.out.println(userDaoHibernate.getAllUsers());
//        userDaoHibernate.cleanUsersTable();
//        userDaoHibernate.dropUsersTable();


//        Configuration configuration = new Configuration();
//        configuration.configure();
//        SessionFactory sessionFactory = configuration.buildSessionFactory();

//        try (Session session = sessionFactory.openSession()) {
//            session.beginTransaction();
//            System.out.println("OK");
//
//            User user = User.builder()
//                    .name("Tom")
//                    .lastName("Hanks1")
//                    .age((byte) 51)
//                    .build();
//
//            session.saveOrUpdate(user);
//            session.getTransaction().commit();
//        }
//        Util.shutdown();


//        Session session = Util.getSessionFactory().openSession();
//        session.close();
//        Util.shutdown();

//        for (User user: new UserDaoHibernateImpl.getAllUsers()) {
//            System.out.println(user.getName());
//        }

//        Util.getConnection();
//        UserServiceImpl userDaoJDBC = new UserServiceImpl();
//        userDaoJDBC.dropUsersTable();
//        userDaoJDBC.createUsersTable();
//
//        userDaoJDBC.saveUser("Name1", "LastName1", (byte) 20);
//        userDaoJDBC.saveUser("Name2", "LastName2", (byte) 25);
//        userDaoJDBC.saveUser("Name3", "LastName3", (byte) 31);
//        userDaoJDBC.saveUser("Name4", "LastName4", (byte) 38);
//
//        List<User> allUsers = userDaoJDBC.getAllUsers();
//        System.out.println("ВСЕ: " + allUsers.get(0).getName() + allUsers.get(1).getName() + allUsers.get(2).getName() + allUsers.get(3).getName());
//        userDaoJDBC.removeUserById(1);
//        userDaoJDBC.cleanUsersTable();
    }
}
