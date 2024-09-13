package SingletonPattern;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Database db = Database.getDatabase();
                db.ping();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Database db = Database.getDatabase();
                db.ping();
            }
        });
        t1.start();
        t2.start();
    }
    
}
