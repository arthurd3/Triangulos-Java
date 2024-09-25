import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Digite os Lados do Triangulo Lado 1 Lateral");
        double lado1 = scanner.nextDouble();
        System.out.println("Digite os Lados do Triangulo Lado 2 Lateral");
        double lado2 = scanner.nextDouble();
        System.out.println("Digite os Lados do Triangulo Lado 3 Baixo");
        double lado3 = scanner.nextDouble();
        
        
        Triangulo triangulo = new Triangulo(lado1 , lado2 , lado3);
        
        System.out.println("Perimetro do Triangulo : " + triangulo.Perimetro() );
        System.out.println("Perimetro do Triangulo : " + triangulo.Saber() );        
    }
}
