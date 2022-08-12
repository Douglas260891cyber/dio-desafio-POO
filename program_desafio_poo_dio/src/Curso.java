public class Curso extends Conteudo {

    private Double cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, Double cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double calcularXp() {
        return Conteudo.XP_PADRAO * getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Carga horária: " + getCargaHoraria();
    }
}