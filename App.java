import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
    }

    // Suma de dos números
    public static int suma(int a, int b) {
        a+b=suma;
        return a+b;
    }

    // Resta de dos números
    public static int resta(int a, int b) {
        a-b=resta;
        return a-b;
    }

    // Multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        a*b=multiplicacion;
        return 0;
    }

    // División de dos números
    public static double division(int a, int b) {
        a/b=division;
        return (double) 2 / 2;
    }

    // Máximo de dos números
    public static int max(int a, int b) {

        return (a > b) ? a : b;
    }

    // Mínimo de dos números
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Factorial de un número
    public static int factorial(int n) {
      if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Número par
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Número impar
    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }

    // Potencia de un número
    public static double potencia(double base, int exponente) {
         return Math.pow(base, exponente);
    }

    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        return Math.sqrt(n);
    
    }

    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
int count = 0;
        for (char c : cadena.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
   String[] palabras = cadena.trim().split("\\s+");
        return (cadena.isEmpty()) ? 0 : palabras.length;
    }

    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }
    }

    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
      
        return 3;
    }

    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {

               return Arrays.stream(array).max().orElseThrow(() -> new IllegalArgumentException("El array está vacío."));

    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
                Arrays.sort(array);

    }


    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
    for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }


    // Invertir un array
    public static void invertirArray(int[] array) {
          int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Calcular la media de un array
    public static double mediaArray(int[] array) {
        int suma = sumarArray(array);
       if (array.length == 0) {
            throw new IllegalArgumentException("El array está vacío.");
        }
        int suma = sumarArray(array);
        return (double) suma / array.length;
    
    }

    // Encontrar la mediana de un array
    public static double medianaArray(int[] array) {
        ordenarArray(array);
           ordenarArray(array);
        if (array.length % 2 == 0) {
            return (array[array.length / 2 - 1] + array[array.length / 2]) / 2.0;
        } else {
            return array[array.length / 2];
        }
    }
    

    // Calcular la desviación estándar de un array
    public static double desviacionEstandarArray(int[] array) {
         public static double desviacionEstandarArray(int[] array) {
        double media = mediaArray(array);
        double suma = 0;
        for (int num : array) {
            suma += Math.pow(num - media, 2);
        }
        return Math.sqrt(suma / array.length);
    }

    }

    // Generar un array de números aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int limite) {
         Random random = new Random();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(limite);
        }
        return array;
    }

