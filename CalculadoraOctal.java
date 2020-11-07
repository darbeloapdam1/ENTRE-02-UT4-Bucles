
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Diego Arbeloa
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int base = 10;
        int base2 = 1;
        int acarreo = 0;
        int sigUnidad = 0;
        int resultado = 0;
        for(int i = 1;i <= Utilidades.contarCifras(n1);i++){
            int num1 = (n1 % base) / base2;
            int num2 = (n2 % base) / base2;
            base *= 10;
            base2 *= 10;
            int suma = num1 + num2 + sigUnidad;
            sigUnidad = 0;
            if(suma > 7){
                suma -= 8;
                sigUnidad = 1;
            }
            resultado += suma * (int) (Math.pow(10, acarreo));
            acarreo++;
        }
        resultado += sigUnidad * base2;
        return resultado;
    }

}
