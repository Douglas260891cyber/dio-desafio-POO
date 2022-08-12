import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 30.5);
        Curso curso2 = new Curso("Curso SQL", "Descrição curso SQL", 20.0);
      
        Mentoria mentoria = new Mentoria(LocalDate.now(), "Mentoria Java", "Descricao da mentoria em Java");
      
        Conteudo conteudo1 = new Mentoria();
        Conteudo conteudo2 = new Curso();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
  
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Camila -> Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println();
        System.out.println("Camila -> Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("Camila -> Conteúdos concluídos: " + devCamila.getConteudosConcluidos());

        System.out.println("---------------------------------------------");
      
        Dev devJoao = new Dev();
        devCamila.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("João -> Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println();
        System.out.println("João -> Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("João -> Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
    }
}
