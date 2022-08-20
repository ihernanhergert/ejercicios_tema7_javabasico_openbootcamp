import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JTextPane Price;
    private JTextPane IVA;
    private JTextPane TOTAL;
    private JButton ButtonCalculate;
    private JPanel taxPane;

    public ActionListener botonPulsado(){
        /*return actionPermormed(ActionEvent e){

        }*/
        return null;
    };

    public MainForm() {
        ButtonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(Price.getText());
                double t = Double.parseDouble(IVA.getText());

                double result = p + (p / 100 * t);
                TOTAL.setText(Double.toString(result));
            }
        });

        Price.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                String valorPrecio = Price.getText();
                Price.setText(valorPrecio);

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
    }
}
