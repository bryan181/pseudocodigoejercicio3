import java.util.*;
public class ejercicio3{
	public static void main(String[] args){
		int num;
		int fact=1;
		Scanner scanner=new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		num=scanner.nextInt();
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("El factorial de "+num+" es: "+fact);
	}
}