package Abstract;


/**
 *
 * @author Denner
 */
public class SubmissaoApresentacao extends Submissao {
    protected String resumo;
    protected String abs;
    protected int duracao;

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    

    
    @Override
    public String toString() {
        return "SubmissaoApresentacao{" + "resumo=" + resumo + ", abs=" + abs + ", duracao=" + duracao + '}';
    }
    
}
