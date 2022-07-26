import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ejercicio_Cuatro {

    //En un vector de 23 posiciones se tienen las temperaturas máximas
    // de las capitales de las 23 provincias argentinas en el último mes.
    // A partir de esta información, un noticiero desea determinar
    // el top 5 de las temperaturas más altas para poder mostrar en la pantalla
    // de su programa, para ello se necesita un programa que sea capaz
    // de recorrer el vector de temperaturas, determinar las 5 más altas
    // y copiarlas en un nuevo vector de 5 posiciones

        public static void main (String[] args) {

            class Pais {

                private String nombre;
                Pais(String pais){
                    super();
                    this.nombre = pais;
                }
                String obtenerPais(){
                    return this.nombre;
                }

            }

            class Provincia extends Pais {

                String provincia;

                Provincia(String pais, String provincia) {
                    super(pais);
                    this.provincia=provincia;
                }
              String  obtenerProvincia(){
                  return this.provincia;
              }

            }

            class Temperatura extends Provincia{
                String escala = "Celsius";
                Integer temperatura;

                Temperatura(String pais, String provincia, int temperatura){
                    super(provincia, pais);
                    this.temperatura = temperatura;
                }

                Integer obtenerTemperatura(){
                    return this.temperatura;
                }



            }


            Temperatura[] arr;
            arr = new Temperatura[9];
            arr[0] =  new Temperatura("Argentina", "BuenosAires", 5);
            arr[1] = new Temperatura("Argentina", "SantaFe", 27);
            arr[2] = new Temperatura("Argentina", "Cordoba", 33);
            arr[3] = new Temperatura("Argentina", "SanLuis ", 14);
            arr[4] = new Temperatura("Argentina", "Catamarca ", 11);
            arr[5] = new Temperatura("Argentina", "RioNegro ", 16);
            arr[6] = new Temperatura("Argentina", "Ushuaia ", 25);
            arr[7] = new Temperatura("Argentina", "Chaco ", 35);
            arr[8] = new Temperatura("Argentina", "Formosa ", 6);

            List<Integer>indicesBuscados = new ArrayList();

            for (int i = 0; i < arr.length; i++) {

                indicesBuscados.add(arr[i].obtenerTemperatura());
            }
            List<Integer> sortedList = indicesBuscados.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            sortedList.remove(8);
            sortedList.remove(7);
            sortedList.remove(6);
            sortedList.remove(5);

           sortedList.stream().forEach(data -> {
               System.out.println("Top 5 Temperaturas " + data + " Grados Celsius");
           });
















    }
}
