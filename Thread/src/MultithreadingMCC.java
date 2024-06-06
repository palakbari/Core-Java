import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class CompanyName extends Frame implements Runnable {
    private int x1, x2;
    private Thread t1, t2;

    public CompanyName() {
        x1 = -100;
        x2 = this.getWidth();
        t1 = new Thread(this, "Mind");
        t2 = new Thread(this, "Craft");
        t1.start();
        t2.start();
    }

    public void paint(Graphics g) {
        super.paint(g); // Ensure proper painting of the frame
        g.setColor(Color.RED);
        g.drawString("Mindcraft", x1, 50);
        g.setColor(Color.BLUE);
        g.drawString("Company", x2, 100);
    }

    public void run() {
        while (true) {
            if (Thread.currentThread() == t1) {
                synchronized (this) {
                    x1++;
                    if (x1 == this.getWidth() + 100) {
                        x1 = -100;
                    }
                }
            } else if (Thread.currentThread() == t2) {
                synchronized (this) {
                    x2--;
                    if (x2 == -100) {
                        x2 = this.getWidth();
                    }
                }
            }
            repaint(); // Call repaint to update the frame
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingMCC {
    public static void main(String[] args) {
        CompanyName c = new CompanyName();
        c.setSize(200, 200);
        c.setVisible(true);
    }
}
