/*
class MySQLDatabase {

    void connect() {
        System.out.println("Connected to MySQL");
    }
}

class Application {

    MySQLDatabase db = new MySQLDatabase();

    void start() {
        db.connect();
    }
} */



    interface Database {
    void connect();
}

//Low level module
class MySQLDatabase implements Database {

    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

class MongoDatabase implements Database {

    public void connect() {
        System.out.println("Connected to MongoDB");
    }
}
//High level module
class Application {

    Database db;

    Application(Database db) {
        this.db = db;
    }

    void start() {
        db.connect();
    }
}

public class DIPDemo {

    public static void main(String[] args) {

        Database db = new MySQLDatabase();

        Application app = new Application(db);
        app.start();
    }
}