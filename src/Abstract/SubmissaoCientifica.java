package Abstract;

import java.util.List;

/**
 *
 * @author User
 */
public class SubmissaoCientifica extends Submissao {

    protected String instituicao[];
    protected String palavraChave[];

    public SubmissaoCientifica(String tituloSubmissao, Situacao situacaoSubmissao, String[] autoresSubmissao, int MAX_AUTORES) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, MAX_AUTORES);
    }

    @Override
    public boolean incluir(Submissao submissao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public Submissao consultarTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Submissao> consultarAutor(String autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "SubmissaoCientifica{" + "instituicao=" + instituicao + ", palavraChave=" + palavraChave + '}';
    }

}
