import javax.swing.JOptionPane;

public class Ola {
public static void main (String [] args) {
    Double primeiro = Double.parseDouble (JOptionPane.showInputDialog("Digite o 1o numero"));
    String segundoComoTexto = JOptionPane.showInputDialog("Digite o 2o numero");
    double segundo = Double.parseDouble(segundoComoTexto);
    double soma = primeiro + segundo;
  JOptionPane.showMessageDialog(null, "A soma é " + soma);
}
}
