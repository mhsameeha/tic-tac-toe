import javax.swing.*;
import java.awt.*;

public class TTT extends JFrame {

  @Override
  public void paint(Graphics graphics) {
    graphics.drawLine(100, 100, 100, 400);
    graphics.drawLine(200, 100, 200, 400);
    graphics.drawLine(300, 100, 300, 400);
    graphics.drawLine(400, 100, 400, 400);
    graphics.drawLine(400, 100, 100, 100);
    graphics.drawLine(400, 200, 100, 200);
    graphics.drawLine(400, 300, 100, 300);
    graphics.drawLine(400, 400, 100, 400);





  }

  public static void main(String[] args) {
    TTT frame = new TTT();
    frame.setSize(500, 500);
    frame.setVisible(true);
  }
}