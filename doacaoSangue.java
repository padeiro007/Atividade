
import java.util.Scanner;
public class doacaoSangue {
      public static void main(String[]args){
    Scanner idades = new Scanner(System. in);
    Scanner pesos = new Scanner (System. in);
    
    System.out.println("Digite o peso: "); 
    double peso = pesos.nextDouble();

    System.out.println("Digite a idade: ");
   int idade = idades.nextInt();
    double peso_Minino = 50;
    
    if (idade>=18) {

if (peso >= peso_Minino){

System.out.println("Apto");

}

    }else{
        System.out.println("Inapto");
    
    
    
    }
    
      }
}