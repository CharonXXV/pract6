import ColorForm.PaintForm;
import ShapeForm.ShapeForm;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/**
 * TODO:javadoc to add
 * */
public class TitlesFrame extends JFrame {
   public TitlesFrame() {
      this.initUI();
   }

   private void initUI() {
      this.setTitle("Криві фігури");
      this.setDefaultCloseOperation(3);
      this.add(new TitlesPanel(ShapeForm.Star, PaintForm.Red));
      this.setSize(350, 350);
      this.setLocationRelativeTo((Component)null);
   }
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            TitlesFrame ps = new TitlesFrame();
            ps.setVisible(true);
         }
      });
   }
}
