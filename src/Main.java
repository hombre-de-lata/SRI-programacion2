import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Documentos fundamentos = new Documentos(1384, 22599, "Principales fundamentos", "https://es.slideshare.net/MabelxhitaAyme/fundamentos-de-informatica-47515487");
        Temas uno = new Temas(334, "informatica basica");
        Categoria sub = new Categoria(2236, "informatica");


        String palabra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese palabra :\n");

        while (true) {

            palabra = scanner.nextLine();

            if (palabra.equals(fundamentos.getTitulo()) || palabra.equals(uno.getNombre()) || palabra.equals(sub.getNombre())){
                System.out.println("\nTemas\n");
                System.out.println("id : " + uno.getIdTema() + "\nnombre : " + uno.getNombre());

                System.out.println("\nCategoría\n");
                System.out.println("id : " + sub.getIdCategoria() + "\nnombre : " + sub.getNombre());

                System.out.println("\nDocumento\n");
                System.out.println("Título : " + fundamentos.getTitulo() + "\nURL : " + fundamentos.getUrl() + "\nid : " + fundamentos.getIdDocumento() + "\nnumero de registro : " + fundamentos.getNumeroRegistro());
                break;
            } else {
                System.out.println("!intentelo de nuevo !!");
            }
        }
    }
}
