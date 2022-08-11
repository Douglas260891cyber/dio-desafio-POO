import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(LocalDate data, String titulo, String descricao) {
        super(titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public Double calcularXp() {
        return Conteudo.XP_PADRAO + 10.0;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Data: " + getData();
    }

}