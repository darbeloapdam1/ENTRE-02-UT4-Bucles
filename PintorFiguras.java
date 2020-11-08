
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Diego Arbeloa
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        int altura2 = altura;
        for(int i = 1; i <= altura; i++){
            escribirEspacios(ESPACIO, (altura2 * 2 - 2));
            for(int l = 1; l <= i; l++){
                if(l % 2 != 0){
                    for(int j = 1; j <= ANCHO_BLOQUE; j++){
                        System.out.print(CAR1);
                    }
                }
                if(l % 2 == 0){
                    for(int k = 1; k <= ANCHO_BLOQUE; k++){
                        System.out.print(CAR2);
                    }
                }
            }
            altura2--;
            System.out.println();
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n){
        for(int i = 1; i <= n; i++){
            System.out.print(caracter);
        }
    }  
}

