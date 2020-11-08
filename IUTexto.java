import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Diego Arbeloa
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char opcion = 'S';
        while(opcion == 'S' || opcion == 's'){
            Pantalla.borrarPantalla();
            System.out.println("Teclee número1: ");
            int num1 = teclado.nextInt();
            System.out.println("Teclee número2: ");
            int num2 = teclado.nextInt();
            estanEnOctal(num1, num2);
            System.out.println("Quiere hacer otra suma en octal? (S/s) ");
            opcion = teclado.next().charAt(0);
        }
    }

    /**
     * Ver si los números están en octal
     */
    private void estanEnOctal(int num1, int num2)
    {
        if(!Utilidades.estaEnOctal(num1)){
            System.out.println("Alguno de los números no está en octal");
        }else if(!Utilidades.estaEnOctal(num2)){
            System.out.println("Alguno de los números no está en octal");
        }else{
            numeroCifras(num1, num2);
        }
    }

    /**
     * Ver si los números tienen el mismo número de cifras
     */
    private void numeroCifras(int num1, int num2)
    {
        if(Utilidades.contarCifras(num1) != Utilidades.contarCifras(num2)){
            System.out.println("No tienen el mismo nº de cifras");
        }else{
            int resultado = calculadora.sumarEnOctal(num1, num2);
            System.out.println("--------------------------------------------");
            String resul = String.format("%30d\n%30d\n%21s%9d",num1,num2,"Suma octal:", resultado);
            System.out.println(resul);
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Ahora dibujará un figura\n Altura de la figura? (1-10) ");
        int altura = teclado.nextInt();
        while(altura > 10 || altura < 1){
            System.out.println("Error, Altura de la figura? (1-10) ");
            altura = teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
    }

}
