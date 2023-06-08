package jm.task.core.jdbc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }

    //закрытие всех соединений с помощью sessionFactory
    public static void shutdown() {
        getSessionFactory().close();
    }

//    public static final String URL = "jdbc:postgresql://localhost:5432/db";
//    public static final String USERNAME = "postgres";
//    public static final String PASSWORD = "postgres";

//    public static Connection getConnection() {
//        Connection connection;
//
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            System.out.println("Соединение с БД - OK!");
//        } catch (SQLException e) {
//            System.out.println("Соединение с БД - ERROR");
//            throw new RuntimeException(e);
//        }
//        return connection;
//    }

//    //создаётся объект sessionFactory для рвботы с объектами сессий
//    private static final SessionFactory sessionFactory = buildSessionFactory(); //настройка и работа с сессиями (фабрика сессий)
//
//    //этот метод вызывается автоматически, т.к. он вызывается из статичной переменной
//    private static SessionFactory buildSessionFactory() {
//        try {
//            //создание объекта Configuration с файлом конфигурации
//            return new Configuration().configure(new File("src\\main\\resourses\\hibernate.cfg.xml")).buildSessionFactory();
//        } catch (Throwable ex) {
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    //этот метод вызывается, когда потребуется sessionFactory
//    public static SessionFactory getSessionFactory() {
//        if(sessionFactory == null) {
//            buildSessionFactory();
//        }
//        return sessionFactory;
//    }
//
//    //закрытие всех соединений с помощью sessionFactory
//    public static void shutdown() {
//        getSessionFactory().close();
//    }

    //статичный блок получения реестра сервисов
//    static {
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder() //получение реестра сервисов
//                .configure()    //настройки из hibernate.cfg.xml
//                .build();
//        try {
//            //MetadataSourses - для работы с метаданными маппинга объектов
//            sessionFactory = new MetadataSources(registry)
//                    .buildMetadata()
//                    .buildSessionFactory();
//        } catch (Exception e) {
//            StandardServiceRegistryBuilder.destroy(registry);
//        }
//    }


}
