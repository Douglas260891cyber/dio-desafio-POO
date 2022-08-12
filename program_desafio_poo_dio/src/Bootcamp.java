import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private List<Dev> devsInscritos = new LinkedList<>();
    private List<Conteudo> conteudos = new LinkedList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(List<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(List<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bootcamp boot = (Bootcamp) o;
        return Objects.equals(nome, boot.nome) && Objects.equals(descricao, boot.descricao)
                && Objects.equals(dataInicial, boot.dataInicial) && Objects.equals(dataFinal, boot.dataFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal);
    }

}