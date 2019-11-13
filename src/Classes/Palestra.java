package Classes;

/**
 *
 * @author Denner
 */
public class Palestra extends Trabalhos{
    private String autor;
    private String resumo;
    private int duracao;
    private String curriculo;

    public Palestra(String autor, String resumo, int duracao, String curriculo) {
        this.autor = autor;
        this.resumo = resumo;
        this.duracao = duracao;
        this.curriculo = curriculo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }
    
}
