/**
 * Author: LUCY BUHAYENKO
 * Date: 02/17/2024
 * Description: recreating an angry bird
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LucyBuhayenko {
    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            //Custom Colors and fonts go here
            
            Color darkRed = new Color(181,0,0);
            Color red = new Color(255,0,0);
            Color green = new Color(0,181,0);
            Color yellow = new Color(255,255,0);
            Color darkYellow = new Color(253, 187, 1);
            Color sky = new Color(0, 127, 255);
            Color grassGreen = new Color(88,234,66);
            
            Color orangeBeak = new Color(255, 175, 0);

            
            //sky and background
            g2.setColor(sky);
            g2.fillRect(0,0, 800,600);
            g2.setColor(green);
            g2.fillRect(0,370,800,230);
            
            g2.setColor(grassGreen);
            g2.fillRect(0,380,800,230);
            
            
            
            
            //body
            g2.setColor(red);
            g2.fillOval(220, 120, 380, 380);
            
            //hair
            g2.setColor(Color.BLACK);
            g2.fillOval(235,95,170,75);
            g2.setColor(red);
            g2.fillOval(240,100,165,65);
            
            
            g2.setColor(Color.BLACK);
            g2.rotate(Math.toRadians(20),250,120);
            g2.fillOval(275,30,150,60);
            g2.rotate(Math.toRadians(-20),250,120);
            
            g2.setColor(red);
            
            g2.rotate(Math.toRadians(20),250,120);
            g2.fillOval(280,30,145,55);
            g2.rotate(Math.toRadians(-20),250,120);
            
            
            //red circles on face
            g2.setColor(darkRed);
            g2.fillOval(300, 240, 130, 130);
            g2.setColor(darkRed);
            g2.fillOval(440, 215, 125, 125);
            
            g2.setColor(darkRed);
            g2.fillOval(260,340,50,70);
            g2.fillOval(240,330,20,30);
            g2.fillOval(560,320,30,50);
            
            
            
            //eyes
            g2.setColor(Color.BLACK);
            g2.fillOval(440, 230, 100, 100);
            g2.setColor(Color.BLACK);
            g2.fillOval(320, 260, 100, 100);
            g2.setColor(Color.WHITE);
            g2.fillOval(330, 265, 85, 85);
            g2.setColor(Color.WHITE);
            g2.fillOval(445, 240, 85, 85);
            
            
            //the line near eyebrow
            g2.setColor(Color.BLACK);
            g2.drawLine(400,220,420,260);
            g2.setColor(Color.BLACK);
            g2.drawLine(440,220,420,260);
            
            //the eyes up close
            g2.setColor(Color.BLACK);
            g2.fillOval(360, 280, 40, 40);
            g2.setColor(Color.BLACK);
            g2.fillOval(460, 260, 40, 40);
            g2.setColor(Color.WHITE);
            g2.fillOval(385, 285, 20, 20);
            g2.setColor(Color.WHITE);
            g2.fillOval(485, 265, 20, 20);
            
            //stomach
            g2.setColor(Color.WHITE);
            g2.fillOval(340, 375, 200, 120);
            
            //bird's beak upper part
            Polygon beak = new Polygon();
            beak.addPoint(440,300);
            beak.addPoint(380, 360);
            beak.addPoint(540, 360);
            g2.setColor(orangeBeak);
            g2.fillPolygon(beak);
            
            //birdd's beak lower part
            Polygon beak2 = new Polygon();
            beak.addPoint(380, 360);
            beak.addPoint(440,420);
            beak.addPoint(510, 390);
            beak.addPoint(490, 380);
            beak.addPoint(490, 360);
            g2.setColor(orangeBeak);
            g2.fillPolygon(beak);
            
            
            
            
            //mouth
            Polygon mouth = new Polygon();
            mouth.addPoint(390, 360);
            mouth.addPoint(485,360);
            mouth.addPoint(485, 380);
            g2.setColor(darkRed);
            g2.fillPolygon(mouth);
            
            
            //left eyebrow
            Polygon left = new Polygon();
            left.addPoint(260,260);
            left.addPoint(300,200);
            left.addPoint(420,250);
            left.addPoint(420,280);
            g2.setColor(Color.BLACK);
            g2.fillPolygon(left);
            
            //right eyebrow
            Polygon right = new Polygon();
            right.addPoint(420,250);
            right.addPoint(520,160);
            right.addPoint(550,210);
            right.addPoint(430,280);
            g2.setColor(Color.BLACK);
            g2.fillPolygon(right);
            
            //name
            Font name = new Font("Feast of Flesh",Font.ITALIC,40);
            g2.setFont(name);
            g2.drawString("Lucy Buhayenko",20,50);
            
            Font BIRD = new Font("Feast of Flesh",Font.BOLD,50);
            g2.setFont(BIRD);
            g2.drawString("ANGRY BIRDS",240,550);
            
            
        
            //drawGrid(g2);
        }
        
        
        
        public void drawGrid(Graphics2D g2d)
        {
            g2d.setStroke(new BasicStroke(1));
            Font gridFont = new Font("Helvetica", Font.PLAIN, 10);
            g2d.setFont(gridFont);
            g2d.setColor(new Color(75,75,75));
            for (int x = 0; x<=800; x+= 20)
            {
                g2d.setColor(new Color(75,75,75));
                g2d.drawLine(x, 0, x, 600); 
                g2d.rotate(Math.toRadians(90),x,0);
                g2d.setColor(new Color(175,175,175));
                g2d.drawString(""+x,x,-1);
                g2d.rotate(Math.toRadians(-90),x,0);
            }
            for (int y = 0; y<=600; y+= 20)
            {
                g2d.setColor(new Color(75,75,75));
                g2d.drawLine(0,y,800,y); 
                g2d.setColor(new Color(175,175,175));
                g2d.drawString(""+y,1,y-1);
            }
            g2d.setColor(new Color(175,175,175));
            for (int x = 0; x<=800; x+= 100)
                g2d.drawLine(x, 0, x, 600);
            for (int y = 0; y<=600; y+= 100)
                g2d.drawLine(0, y, 800, y); 
        }
    }
    
    JFrame frame;
    DrawPanel drawPanel;
    public static void main(String... args) {
        new LucyBuhayenko().go();
    }
    private void go() {
        frame = new JFrame("Angry Bird - Lucy Buhayenko");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(805, 630));
        frame.setBackground(Color.BLACK);
        frame.pack();
        drawPanel = new DrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setResizable(true);
        frame.setLocationByPlatform(true);
        frame.setLocation(0,0);
        frame.setVisible(true);
    }
}
