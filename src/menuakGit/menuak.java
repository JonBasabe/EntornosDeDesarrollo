package menuakGit;

import java.util.Scanner;

public class menuak {

	public static void main(String[] args) {	

		Scanner scan = new Scanner(System.in);
		
		//Bi zenbaki sartu
		
		//System.out.println("Introduce dos numeros");
		int zenb1=0;
		int zenb2=0;
		
		
		//Menua:
		
		System.out.println("----MENÚ:----\n0 - Sumar \n1 - Restar \n2 - Multiplicar \n3 - Dividir \n4 - Factorial");
		int aukera = Integer.parseInt(scan.nextLine());
		
		switch(aukera){
		case 0:
			sumar(zenb1, zenb2);
			//System.out.println(zenb1 + zenb2);
			break;
			
		case 1:
			restar(zenb1,zenb2);
			//System.out.println(zenb1 - zenb2);
			break;
		
		case 2:
			multiplicar(zenb1, zenb2);
			System.out.println(zenb1 * zenb2);
			break;
			
		case 3:
			dividir(zenb1,zenb2);
			//System.out.println(zenb1 / zenb2);
			break;
			
		case 4:
			factorial(zenb1);
			/*System.out.println("Mete un numero para calcular su factorial");
			int valorCalcular = scan.nextInt();
			int factorial = 1;
			
			for(int i = valorCalcular;i>0; i--){
				factorial = factorial*i;
				
			}
			System.out.println(factorial);*/
			break;
		}
	}

	private static void factorial(int zenb1) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mete un numero para calcular su factorial");
		int valorCalcular = scan.nextInt();
		int factorial = 1;
		
		for(int i = valorCalcular;i>0; i--){
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
	}

	private static void dividir(int zenb1, int zenb2) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce dos numeros");
		zenb1=Integer.parseInt(scan.nextLine());
		zenb2=Integer.parseInt(scan.nextLine());
		System.out.println(zenb1 / zenb2);
		}
	

	private static void multiplicar(int zenb1, int zenb2) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce dos numeros");
		zenb1=Integer.parseInt(scan.nextLine());
		zenb2=Integer.parseInt(scan.nextLine());
		System.out.println(zenb1 * zenb2);
		
	}

	private static void restar(int zenb1, int zenb2) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce dos numeros");
		zenb1=Integer.parseInt(scan.nextLine());
		zenb2=Integer.parseInt(scan.nextLine());
		System.out.println(zenb1 - zenb2);
		
	}

	private static void sumar(int zenb1, int zenb2) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Introduce dos numeros");
		zenb1=Integer.parseInt(scan.nextLine());
		zenb2=Integer.parseInt(scan.nextLine());
		System.out.println(zenb1 + zenb2);
		
	}

}
