package DB;

import org.sql2o.Sql2o;

public class DB {

    // DEVELOPMENT DATABASE
    private static String testConnectionString = "jdbc:postgresql://localhost:5432/organisational_api";
    private static String testUser = "ray";
    private static String testPassword = "discogray";
    public static Sql2o sql2o = new Sql2o( testConnectionString, testUser, testPassword);// Comment this out if you are testing your app locally

    // PRODUCTION DATABASE
//    private static String connectionString = "jdbc:postgresql://ec2-174-129-229-106.compute-1.amazonaws.com:5432/ddsnv9l24nb7pb";
//    private static String user = "ray";
//    private static String password = "discogray";
//    public static Sql2o sql2o = new Sql2o( connectionString, user, password);

}
