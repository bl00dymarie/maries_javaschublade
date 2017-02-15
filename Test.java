import javax.swing.*;
import javax.awt.*;
import javax.awt.event.*;

public class Fenster extends JFrame
{
  public static void main(String[] args)
  {
    new Fenster();
  }
  public Fenster()
  {
    super("Die Quadratorin");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    getContentPane().setLayout(new FlowLayout());

    JTextField textField = new JTextField("Zahl eingeben");
    getContentPane().add(textField);

    JButton button = new JButton("Quadrieren");
    getContentPane().add(button);

    JLabel label = new JLabel("Ergebnis");
    getContentPane().add(label);

    button.addActionListener(new MyListener(textField, label));

    setLocation(250, 190);
    setSize(300, 90);
    setVisible(true);
  }
}
class MyListener implements ActionListener
{
  private JTextField textField;
  private JLabel label;

  public MyListener(JTextField tf, JLabel l)
  {
    textField = tf;
    label = l;
  }

  public void actionPerformed(ActionEvent ae)
  {
    String text = textField.getText();

    String ergebnisText = "";
    try
    {
      double zahl = Double.parseDouble(text);
      double quadrat = zahl * zahl;
      ergebnisText = "" + quadrat;
    }
    catch(NumberFormatException ex)
    {
      ergebnisText = "keine Zahl";
    }

    label.setText(ergebnisText);
    textField.setText("Zahl eingeben");
  }
}
