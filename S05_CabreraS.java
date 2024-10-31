import java.util.InputMismatchException;
import java.util.Scanner;

public class S05_CabreraS {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroRegistro;
        
        do {
            try {
            System.out.println("Introduce tu número de registro: "); 
            numeroRegistro = teclado.nextInt();
                if (numeroRegistro >= 1 && numeroRegistro <= 499) {
                    break;                    
                }else {
                    System.out.println("Tu número de registro es no es válido.");
                }
            } catch (InputMismatchException e) {
                    System.out.println("Introduce un número entero.");
                    teclado.next();
            } 
            
        } while (true);

        
        int totalPuntos = 0;
        final int puntos1 = 40;                 //variables de puntuación constantes
        final int puntos2 = 30;
        final int puntos3 = 20;
        final int puntos4 = 10;
        final int puntos5 = 15;
        final int puntos6 = 5;
        

        System.out.println("¿Tiene un hermano actualmente en el centro? (0:no, 1:sí): ");
        int respuesta1 = teclado.nextInt();
        boolean hermanoCentro = (respuesta1 != 0);
        if (hermanoCentro) {
            totalPuntos = totalPuntos += puntos1;
        }

        System.out.println("¿Vive actualmente en la zona del centro? (0:no, 1:sí): ");
        int respuesta2 = teclado.nextInt();
        boolean viveZona = (respuesta2 != 0);
        if (viveZona) {
            totalPuntos = totalPuntos += puntos2;
        }

        System.out.println("¿Trabaja el padre, la madre o tutor en la zona del centro? (0:no, 1:sí): ");
        int respuesta3 = teclado.nextInt();
        boolean trabajoZona = (respuesta3 != 0);
        if (trabajoZona) {
            totalPuntos = totalPuntos += puntos3;
        }  

        System.out.println("¿Tiene alguna discapacidad? (0:no, 1:sí): ");
        int respuesta4 = teclado.nextInt();
        boolean discapacidad = (respuesta4 != 0);
        if (discapacidad) {
            totalPuntos = totalPuntos += puntos4;
        }
        
        System.out.println("¿Forma parte de familia numerosa o monoparental? (0:no, 1:sí): ");
        int respuesta5 = teclado.nextInt();
        boolean famNumerosa = (respuesta5 != 0);
        if (famNumerosa) {
            totalPuntos = totalPuntos += puntos5;
        }       

        System.out.println("¿Estudió el padre, la madre o algún hermano en el centro? (0:no, 1:sí): ");
        int respuesta6 = teclado.nextInt();
        boolean famCentro = (respuesta6 != 0);
        if (famCentro) {
            totalPuntos = totalPuntos += puntos6;
        }    


        System.out.println("Su puntuación total es de " + totalPuntos + " puntos.");

    }
}