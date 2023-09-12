package designPatternsImplementations.singleton;

public class DatabaseConnection1 {

    // Eager/Early Initialisation

    private static DatabaseConnection1 instance = new DatabaseConnection1();

    private DatabaseConnection1(){

    }

    public static DatabaseConnection1 getInstance() {

        return instance;
    }

}

// this is thread safe
// but in this case the performance of the method will be slow
// also we can't enter params to the constructor - coz params are runtime
