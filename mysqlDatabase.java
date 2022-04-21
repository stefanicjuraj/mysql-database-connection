import java.sql.Connection;
import java.sql.DriverManager;

public class mysqlDatabase {

    String mysql = "";
    String username = "";
    String password = "";
    Connection connect = null;

    // mysql database
    public mysqlDatabase(String[] db) {
        setMYSQL(db[0]);
        setUsername(db[1]);
        setPassword(db[2]);
    }

    // set mysql
    public void setMYSQL(String sql) {
        this.mysql = sql;
    }

    // get mysql
    public String getMYSQL() {
        return mysql;
    }

    // set username
    public void setUsername(String username) {
        this.username = username;
    }

    // get username
    public String getUsername() {
        return username;
    }

    // set password
    public void setPassword(String password) {
        this.password = password;
    }

    // get password
    public String getPassword() {
        return password;
    }

    // connect
    public boolean connect() {
        boolean connects = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connecting to the database...");
            connect = DriverManager.getConnection(this.mysql, this.username, this.password);
            System.out.println("connected to the database");
            return connects = true;
        } catch (Exception e) {
            System.out.println(e);
        }

        return connects;
    }

    // close
    public Connection close() {

        if (connect != null) {
            try {
                System.out.println("closing the database...");
                connect.close();
                System.out.println("closed the database");
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("test");
        }

        return connect;
    }
}