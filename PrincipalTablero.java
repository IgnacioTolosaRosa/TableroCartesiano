package TableroCartesiano;
import java.util.Scanner;

public class PrincipalTablero {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Tablero t1;
		int x,y,opcion,incremento=0;
		System.out.println("Ingrese la posicion x:");
		x=reader.nextInt();
		System.out.println("Ingrese la posicion y:");
		y=reader.nextInt();
		
		t1=new Tablero(x,y);
		
		do {
			System.out.println("MENU:");
			System.out.println("1.Mover Arriba:");
			System.out.println("2.Mover Abajo:");
			System.out.println("3.Mover a la derecha:");
			System.out.println("4.Mover a la izquierda:");
			System.out.println("5.Salir:");
			System.out.println("Ingrese la opcion del Menu:");
			opcion=reader.nextInt();
			
			if(opcion!=5) {
				System.out.println("Cuanto espacio quiere moverse:");
				incremento=reader.nextInt();
			}
			
			switch(opcion) {
			case 1: t1.moverArriba(incremento);
					break;
			case 2: t1.moverAbajo(incremento);
					break;
			case 3: t1.moverDerecha(incremento);
					break;
			case 4: t1.moverIzquierda(incremento);
					break;
			case 5: System.out.println("Usted a finalizado, salio del menu"); break;
			
			default:System.out.print("Error, usted se equivoco de opcion en el menu"); break;			}
			
			System.out.println("Su posicion actual en la tabla (X,Y):" + t1.getx() + "" + t1.gety());
			
		}while(opcion!=5);

	}

}
