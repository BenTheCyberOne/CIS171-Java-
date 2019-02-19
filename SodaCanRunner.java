import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class SodaCanRunner
{
   public static void draw(Graphics g)
   {
     int x = 0;
     int y = 0;
     for (int i = 0; i < 6; i++){
      g.drawOval(x,y,30,30);
      x = x+30;
    }
      y = y+30;
      x = 0;
      for (int i = 0; i < 6; i++){
        g.drawOval(x,y,30,30);
        x = x+30;
      }
      x = 0;
      y = y+30;
      for (int i = 0; i < 6; i++){
        g.drawOval(x,y,30,30);
        x = x+30;
      }
      x = 0;
      y = y+30;
      for (int i = 0; i < 6; i++){
        g.drawOval(x,y,30,30);
        x = x+30;
      }
  }

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new JComponent()
      {
         public void paintComponent(Graphics graph)
         {
            draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }
}
