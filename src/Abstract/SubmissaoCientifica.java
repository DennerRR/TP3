package Abstract;

import java.util.List;

/**
 *
 * @author User
 */
public class SubmissaoCientifica extends Submissao {

    protected String instituicao[];
    protected String palavraChave[];

    public SubmissaoCientifica(String[] instituicao, String[] palavraChave) {
        this.instituicao = instituicao;
        this.palavraChave = palavraChave;
    }
    
    

    public String[] getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String[] instituicao) {
        this.instituicao = instituicao;
    }

    public String[] getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String[] palavraChave) {
        this.palavraChave = palavraChave;
    }


    @Override
    public String toString() {
        return "SubmissaoCientifica{" + "instituicao=" + instituicao + ", palavraChave=" + palavraChave + '}';
    }

}
