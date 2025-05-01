import java.awt.*;

public class PlayingWithDrawingPanel {
    public static final double G = -10; // acceleration due to gravity

    public static void main(String[] args) {
        int width = 800, height = 600;
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();

        int dotSize = 5; // size of the dot in pixels
        double dt = 0.5;  // time interval
        double x0 = 0, y0 = 0; // initial position
        double vx0 = 60, vy0 = 80; // initial velocity
        g.fillOval((int)x0, (int)(height - y0), dotSize, dotSize);
        System.out.println("hi");

        for (int i = 0; i < 20; i++) {
            double vx = 0*dt + vx0;
            double vy = G*dt + vy0;
            double vx_avg = (vx + vx0) / 2;
            double vy_avg = (vy + vy0) / 2;
            double x = vx_avg*dt + x0;
            double y = vy_avg*dt + y0;
            g.fillOval((int)x, (int)(height - y), dotSize, dotSize);
            vx0 = vx;
            vy0 = vy;
            x0 = x;
            y0 = y;
            panel.sleep(200);
        }
    }
}
