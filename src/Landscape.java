import javax.swing.*;
import java.awt.*;

public class Landscape extends JFrame {

    public static void main(String[] args) {
        Landscape landscape = new Landscape();
        landscape.setWindow();
    }

    public void setWindow() {
        setTitle("Paisaje");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(135, 206, 235)); // Color de fondo (cielo)
        g2d.fillRect(0, 0, getWidth(), getHeight());

        drawShapes(g2d);
    }

    public void drawShapes(Graphics2D g2d) {

        // Rectángulo con relleno
        g2d.setColor(Color.GREEN);
        g2d.setColor(Color.darkGray);
        g2d.fillRect(0, 450, 800, 200);
        // Rectángulo con relleno
        g2d.setColor(new Color(142, 113, 67));
        g2d.fillRect(0, 300, 800, 150);

        // Línea simple
        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, 450, 800, 450);

        g2d.setStroke(new BasicStroke(5));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0,550,800,550);

        // Línea con patrón (línea discontinua)
        float[] dashPattern = {10, 10};
        g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, dashPattern, 0));
        g2d.setColor(Color.WHITE);
        g2d.drawLine(50, 500, 800, 500);

        // Rectángulo con relleno
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillRect(125, 300, 50, 50);

        // Triángulo
        int[] xPoints = {90, 150, 210};
        int[] yPoints = {300, 200, 300};
        Polygon triangle = new Polygon(xPoints, yPoints, 3);
        g2d.setColor(Color.green);
        g2d.fillPolygon(triangle);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawPolygon(triangle);

        // Óvalo
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(500, 100, 150, 150);

        // Arco con relleno
        g2d.setColor(Color.CYAN);
        g2d.fillArc(100, 100, 100, 100, 0, 180);
        // Arco con relleno
        g2d.setColor(Color.CYAN);
        g2d.fillArc(60, 100, 100, 100, 0, 180);
        // Arco con relleno
        g2d.setColor(Color.CYAN);
        g2d.fillArc(140, 100, 100, 100, 0, 180);

        // Arco con relleno
        g2d.setColor(Color.CYAN);
        g2d.fillArc(130, 80, 100, 100, 180, 180);
        // Arco con relleno
        g2d.setColor(Color.CYAN);
        g2d.fillArc(110, 80, 100, 100, 180, 180);
        // Arco con relleno
        g2d.setColor(Color.CYAN);
        g2d.fillArc(80, 80, 100, 100, 180, 180);

    }
}
