import java.awt.*;

public class StarsAndStripes {
    public static void drawStar1(Graphics g, int radius, int x, int y) {
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

//        g.drawString("*", x, y);
    }

    public static void drawStar(Graphics g, int radius, int x, int y) {
        int points = 5;
        double dTheta = 2*Math.PI/points;
        int[] xPoints = new int[points];
        int[] yPoints = new int[points];
        for (int i = 0; i < points; i++) {
            double angle = Math.PI/2 + dTheta*i;
            System.out.println(angle);
            xPoints[i] = x + (int)(radius*Math.cos(angle));
            yPoints[i] = y - (int)(radius*Math.sin(angle));
        }
        g.drawString("O", x, y);
        g.drawString("0", xPoints[0], yPoints[0]);
        g.drawString("1", xPoints[1], yPoints[1]);
        g.drawString("2", xPoints[2], yPoints[2]);
        g.drawString("3", xPoints[3], yPoints[3]);
        g.drawString("4", xPoints[4], yPoints[4]);
        g.drawOval(x - radius, y - radius, x + radius, y + radius);
        g.drawLine(xPoints[0], yPoints[0], xPoints[3], yPoints[3]);
        g.drawLine(xPoints[3], yPoints[3], xPoints[1], yPoints[1]);
        g.drawLine(xPoints[1], yPoints[1], xPoints[4], yPoints[4]);
        g.drawLine(xPoints[4], yPoints[4], xPoints[2], yPoints[2]);
        g.drawLine(xPoints[2], yPoints[2], xPoints[0], yPoints[0]);
    }

    public static void drawStar2(Graphics g, int radius, int x, int y) {

        int[] xPoints = new int[10];
        int[] yPoints = new int[10];

        for (int i = 0; i < 10; i++) {
            double angle = Math.PI / 2 + (2 * Math.PI * i / 10);
            int r = (i % 2 == 0) ? radius : radius / 2;

            xPoints[i] = x + (int)(r * Math.cos(angle));
            yPoints[i] = y - (int)(r * Math.sin(angle));
        }


        g.fillPolygon(xPoints, yPoints, 10);
    }


    public static void main(String[] args) {
        int height = 300, width = (int)(height*1.9);
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();
//        for (int row = 0; row < 5; row++ ) {
//            for (int col = 0; col < 5; col++) {
//                drawStar(g, 10, col*25, row*25);
//            }
//        }
        drawStar(g, 100, 100, 100);
    }
}
