package SingletonPattern;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                Database db = Database.getDatabase();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                Database db = Database.getDatabase();
            }
        });
        t1.start();
        t2.start();
    }
    
}
