import java.awt.*;

public class StarsAndStripes {
    public static void drawStar(Graphics g, int radius, int x, int y) {
        int Ax = x;
        int Ay = y - radius;
        int Bx = x - (int)(radius*Math.cos(Math.toRadians(18)));
        int By = y - (int)(radius*Math.sin(Math.toRadians(18)));
        int Cx = x - (int)(radius*Math.cos(Math.toRadians(54)));
        int Cy = y + (int)(radius*Math.sin(Math.toRadians(54)));
        int Dx = x + (int)(radius*Math.cos(Math.toRadians(54)));
        int Dy = y + (int)(radius*Math.sin(Math.toRadians(54)));
        int Ex = x + (int)(radius*Math.cos(Math.toRadians(18)));
        int Ey = y - (int)(radius*Math.sin(Math.toRadians(18)));
//        g.drawString("A", Ax, Ay);
//        g.drawString("B", Bx, By);
//        g.drawString("C", Cx, Cy);
//        g.drawString("D", Dx, Dy);
//        g.drawString("E", Ex, Ey);

        g.drawLine(Cx, Cy, Ax, Ay);
        g.drawLine(Ax, Ay, Dx, Dy);
        g.drawLine(Dx, Dy, Bx, By);
        g.drawLine(Bx, By, Ex, Ey);
        g.drawLine(Ex, Ey, Cx, Cy);
    }

    public static void main(String[] args) {
        int height = 300, width = (int)(height*1.9);
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
        drawStar(g, 50, 100, 100);
    }
}
