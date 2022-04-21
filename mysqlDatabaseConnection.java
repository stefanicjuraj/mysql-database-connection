import java.util.*;

public class mysqlDatabaseConnection {

    // main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] info = new String[3];

        // username
        System.out.println("enter username: ");
        info[1] = sc.next();

        // password
        System.out.println("enter password: ");
        info[2] = sc.next();

        // host name
        System.out.println("enter host name: ");
        String host = sc.next();

        // port number
        System.out.println("enter port number: ");
        String port = sc.next();

        // database name
        System.out.println("enter database name: ");
        String dbName = sc.next();

        // info to connect
        info[0] = "jdbc:mysql://" + host + ":" + port + "/" + dbName;

        mysqlDatabase data = new mysqlDatabase(info);

        try {
            data.connect();
        } catch (Exception e) {
            System.out.println(e);
        }
        // close
        data.close();
        sc.close();
    }
}