import java.awt.*;

public class ChaosGame {
    public static int midpointX(int x1, int x2) {
        return (x2 + x1) / 2;
    }

    public static int midpointY(int y1, int y2) {
        return (y2 + y1) / 2;
    }

    public static void main(String[] args) {
        int width = 800, height = 600;
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        int dotSize = 1;

        // define the vertices of the triangle
        int Ax = 20, Ay = height - 20;
        int Bx = width - 20, By = height - 20;
        int Cx = width / 2, Cy = 20;

        // pick a random point on the screen
        int x = (int)(Math.random()*width);
        int y = (int)(Math.random()*height);

        // start a loop
        int N = 1000000; // number of iterations
        for (int i = 0; i < N; i++) {
            // change the color
            Color c = new Color((int)((double)i/N*255), (int)((double)(1 - i)/N*255), 0);
            g.setColor(c);
            // randomly pick a vertex
            int randomVertex = (int)(Math.random()*3 + 1);
            // compute the midpoint
            if (randomVertex == 1) { // Point A
                x = midpointX(x, Ax);
                y = midpointY(y, Ay);
            } else if (randomVertex == 2) { // Point B
                x = midpointX(x, Bx);
                y = midpointY(y, By);
            } else { // Point C
                x = midpointX(x, Cx);
                y = midpointY(y, Cy);
            }
            // draw the midpoint
            g.fillOval(x, y, dotSize, dotSize);
        }
    }
}
