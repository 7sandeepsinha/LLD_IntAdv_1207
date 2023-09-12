package designPatternsImplementations.singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;
    private String url;
    private int port;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return  instance;

    }
}

// this implementation is not multi-threaded.
// multiple threads can call the getInstance() method
// then multiple objects will be created
