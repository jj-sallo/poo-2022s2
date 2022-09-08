import java.util.Scanner;

public class DiaLaboral {
	public static void main(String[] args) {
	String day;
	if (args.length == 0) {
		System.out.println("Inserte un día de la semana");
		Scanner scanner = new Scanner(System.in);
		day = scanner.nextLine();
	} else {
	day = args[0];
	}
	switch (day) {
	case "Lunes":
		System.out.println("Día laboral");
		break;
	case "Martes":
		System.out.println("Día laboral");
		break;
	case "Miércoles":
	case "Miercoles":
		System.out.println("Día laboral");
		break;
	case "Jueves":
		System.out.println("Día laboral");
		break;
	case "Viernes":
		System.out.println("Día laboral");
		break;
	case "Sábado":
	case "Sabado":
		System.out.println("No es día laboral");
		break;
	case "Domingo":
		System.out.println("No es día laboral");
		break;
	default:
		System.out.println("Esto no es un día");
	}
	}
}
