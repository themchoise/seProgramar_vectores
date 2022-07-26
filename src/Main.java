import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<List> tenIntegers = new ArrayList();

        List <String> positions = new ArrayList();
        positions.add("Primero");
        positions.add("Segundo");
        positions.add("Tercero");
        positions.add("Cuarto");
        positions.add("Quinto");
        positions.add("Sexto");
        positions.add("Septimo");
        positions.add("Octavo");
        positions.add("Noveno");
        positions.add("Ultimo");

        int counter = 0;
        do {
            try{
                int numberObatined = Integer.parseInt(JOptionPane.showInputDialog(null, "Se necesitan 10 numeros entre 1 y 100, ingrese el " + positions.get(counter)));
                tenIntegers.add(Collections.singletonList(numberObatined));
                if (   numberObatined > 0 && numberObatined < 100 ){
                    counter +=1;
                }else{
                    JOptionPane.showMessageDialog(null, "Valor Fuera de Rango" );
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar Numero" );
            }

        }while (counter < 10);

        JOptionPane.showMessageDialog(null, "Exito " );
        JOptionPane.showMessageDialog(null, tenIntegers );
    }
}