package SingletonPattern;

public class Database {
    public static Database db;

    private Database() {
        System.out.println("creating object");
    }

    public static Database getDatabase() {
        if(db == null) {
            synchronized(Database.class) {
                if(db == null) {
                    db = new Database();
                }
            }
        }
        return db;
    }
}
