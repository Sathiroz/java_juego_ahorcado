import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        //CLASE SCANNER QUE NOS PERMITE QUE EL USUARIO ESCRIBA
        Scanner scanner = new Scanner(System.in);

        //DECLARACIONES Y ASIGNACIONES
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinado = false;

        // ARREGLOS:

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //BUCLE
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            // System.out.print(letrasAdivinadas[i]);
        }

        while (!palabraAdivinado && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "( " + palabraSecreta.length() + " letras)");

            System.out.println("introduce una letra, por favor");
            //uSAMOS LA CLASE SCANNER PARA PEDIR UNA LETRA
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //ESTRUCTURA DE CONTROL CONDICIONAL
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }

            }if (!letraCorrecta) {
                intentos++;
                System.out.println("Letra incorrecta te quedan: " + (intentosMaximos - intentos) + " intentos.");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinado = true;
                System.out.println("felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinado) {
            System.out.println("Te quedaste sin intentos intentalo de nuevo");
        }

    }
}
