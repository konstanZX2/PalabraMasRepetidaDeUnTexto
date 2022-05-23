import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LectorDeFichero {
    public void leeFicheroYMuestraLaPalabraMasRepetida() {
        BufferedReader bufferedReader;
        HashMap<String, Integer>palabrasGuardadas = new HashMap<>();

        try {
            bufferedReader = new BufferedReader(new FileReader("Resources/FicheroDePruebaDeLaPalabraMasRepetida.txt"));
            String linea = bufferedReader.readLine();
            int hashvalue=0;
            while (linea != null) {
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    palabrasGuardadas.put(palabra,hashvalue);
                    if (hashvalue==)

                }


            }} catch(FileNotFoundException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }