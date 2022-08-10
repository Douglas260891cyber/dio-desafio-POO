import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 30.5);
        Curso curso2 = new Curso("Curso SQL", "Descrição curso SQL", 20.0);
        System.out.println(curso1.toString());
        System.out.println();
        System.out.println(curso2.toString());

        Mentoria mentoria = new Mentoria("Mentoria Java", "Mentoria em Java", LocalDate.now());
        System.out.println();
        System.out.println(mentoria.toString());
    }
}
