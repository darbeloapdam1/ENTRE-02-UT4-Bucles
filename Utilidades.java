import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Diego Arbeloa
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) { 
        boolean esOctal = false;
        while(n != 0){
            if(n % 10 <=7 && n % 10 >= 0){
                esOctal = true;
            }else{
                return esOctal;
            }
            n = n / 10;
        }
        return esOctal;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cifras = 0;
        while(n != 0){
            cifras++;
            n = n / 10;
        }
        return cifras;
    }

}
