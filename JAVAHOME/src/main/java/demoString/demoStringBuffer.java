package demoString;

public class demoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Thread thread1 = new Thread(() -> {
            sb.append("Hello ");
        });
        Thread thread2 = new Thread(() -> {
            sb.append("World");
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String result = sb.toString();
        System.out.println(result);
    }

}
