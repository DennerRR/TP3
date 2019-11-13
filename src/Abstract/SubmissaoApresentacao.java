/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.util.List;

/**
 *
 * @author User
 */
public class SubmissaoApresentacao extends Submissao {
    protected String resumo;
    protected String abs;
    protected int duracao;

    public SubmissaoApresentacao(String tituloSubmissao, Situacao situacaoSubmissao, String[] autoresSubmissao, int MAX_AUTORES) {
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
        return "SubmissaoApresentacao{" + "resumo=" + resumo + ", abs=" + abs + ", duracao=" + duracao + '}';
    }
    
}
