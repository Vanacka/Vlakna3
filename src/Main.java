public class Main extends Thread {
    public static void napis(int n) {
        for (;;) {
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                System.out.print(" ");
                }
                System.out.print("*\r");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
            for (int j = n - 1; j >= 0; j--) {
                for (int i = 0;i < j; i++) {
                    System.out.print(" ");
                }

            System.out.print("*\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
    }
    public static void main(String[] args) {
        napis(10);
    }
}