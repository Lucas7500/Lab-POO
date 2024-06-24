import java.util.Scanner;

public class ExercLab1_2 {
	
	public static void main(String[] args) {
		Curso[] cursos = new Curso[4];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < cursos.length; i++) {
			System.out.print("Qual o nome do seu curso? ");
			cursos[i].nome = sc.nextLine();

			System.out.print("Qual o nome da sua faculdade? ");
			cursos[i].faculdade = sc.nextLine();			

			System.out.println("Quanto tempo para formar? ");
			cursos[i].tempoFormacao = sc.nextFloat();
			
			System.out.println("Qual o turno do seu curso? ");
			System.out.println("1 - Matutino\n2 - Vespertino\n3 - Noturno\n 4 - Integral ");

			int numTurno = sc.nextInt();

			switch(numTurno) {
			case 1:
				cursos[i].turno = EnumTurno.MATUTINO;
				break;
			case 2:
				cursos[i].turno = EnumTurno.VESPERTINO;
				break;
			case 3:
				cursos[i].turno = EnumTurno.NOTURNO;
				break;
			case 4:
				cursos[i].turno = EnumTurno.INTEGRAL;
				break;
			default:
				System.out.println("Número inválido");
				cursos[i].turno = null;
				break;
			}
		}
		
		sc.close();

		System.out.println("Os cursos registrados foram: ");
		
		for (Curso curso : cursos) {
			System.out.println("Curso: " + curso.nome);
			System.out.println("Faculdade: " + curso.faculdade);
			System.out.println("Tempo de Formação: " + curso.tempoFormacao);
			System.out.println("Turno: " + curso.turno.name());
		}
	}
}