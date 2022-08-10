public class Curso {

    private String titulo;
    private String descricao;
    private Double cargaHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, Double cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double calcularXp() {
        return null;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\n" +
                "Descrição: " + getDescricao() + "\n" +
                "Carga horária: " + getCargaHoraria();
    }
}