
public class Triangulo
{
    double lado1 , lado2 , lado3;
    
    
    
    public Triangulo(double lado1 , double lado2 , double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }
    
    public double Perimetro(){
        return lado1 + lado2 + lado3;
        
    }
    public String Saber() {
        if (lado1 == lado2 && lado1 == lado3) {
            return "Triângulo Equilátero";  
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Triângulo Isósceles";  
        } else {
            return "Triângulo Escaleno";  
        }
    }
}
