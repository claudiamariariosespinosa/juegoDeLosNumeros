import javax.swing.*;

public class LosNumeros {
    public static void main(String[] args) {
        int numero = 0, contador = 0, aleatorio;
        aleatorio = (int) (Math.random() * 100);

        JOptionPane.showMessageDialog(null, "bienvenido al juego de los numeros");
        JOptionPane.showMessageDialog(null, "estas listo para jugarlo");
        JOptionPane.showMessageDialog(null, "el juego consiste en que yo tengo un numero y tu debes adivinarlo y hasta que no lo adivines no podras salir");

        numero = Integer.parseInt(JOptionPane.showInputDialog("ahora empezamos por favor digita un numero"));
        do {

            if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "el numero es menor por favor digite otro numero");
                numero = Integer.parseInt(JOptionPane.showInputDialog("ahora empezamos por favor digita un numero"));


            } else {
                JOptionPane.showMessageDialog(null, "el numero es mayor por favor digite otro numero");
                numero = Integer.parseInt(JOptionPane.showInputDialog("ahora empezamos por favor digita un numero"));


            }

        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "felicidades haz acertado el es numero  " + aleatorio);

        contador++;


        JOptionPane.showMessageDialog(null, "el numero de intentos que tuviste fueron " + contador);
    }


}
