package Abstract;

import Interfaces.ISubmissoes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Denner
 */
public abstract class Submissao implements ISubmissoes {
    
    
    protected String tituloSubmissao;
    protected Situacao situacaoSubmissao;
    protected String autoresSubmissao[] ;
    protected int MAX_AUTORES ;
    ArrayList<Submissao> listaSubmissao = new ArrayList();

    public Submissao() {
       listaSubmissao= new ArrayList();
    }
    
    
    
    enum SituacaoSub{
        Aprovado(1), Reprovado(2),sobAvaliacao(3);
        protected int valorSituacao;
    
        SituacaoSub(int valor){
            valorSituacao = valor;
        }
    }

    @Override
    public boolean incluir(Submissao submissao) {
        listaSubmissao.add(submissao);
        return true;
    }

    @Override
    public Submissao consultarTitulo(String titulo) {
        for(Submissao subApresentacao : listaSubmissao){
            if(subApresentacao.tituloSubmissao.equals(titulo)){
                return subApresentacao;
            }
            
        }
        return null;
    }

    @Override
    public List<Submissao> consultarAutor(String autor) {
        for(Submissao consultaAutorAp : listaSubmissao){
            if(consultaAutorAp.autoresSubmissao.equals(autor)){
                
               return (List<Submissao>) consultaAutorAp;
            }
        }
        return null;
    }

    @Override
    public boolean excluir(String titulo) {
       for(Submissao excluirApTitulo : listaSubmissao){
           if(excluirApTitulo.tituloSubmissao.equals(titulo)){
               listaSubmissao.remove(excluirApTitulo);
               return true;
           }
       }
       return false;
    }
    
    
}

