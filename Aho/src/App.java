import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Permite escribir
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta= "intel";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }
        //Estructura de control iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        //Se usa cuando hay una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas)+ " " + palabraSecreta.length() + " letras");

            System.out.println("Introduce una letra: ");

            //Se usa para pedir la letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            //Estructura de control iterativa (Bucle)

            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("Te quedan " + (intentosMaximos = intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Acertaste toda la palabra: " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("F");
        }
        
        scanner.close();

    }
}
