package Abstract;

import Interfaces.ISubmissoes;
import java.util.ArrayList;

/**
 *
 * @author Denner
 */
public abstract class Submissao implements ISubmissoes {
    ArrayList<Submissao> listaSubmissao = new ArrayList();
    
    protected String tituloSubmissao ;
    protected Situacao situacaoSubmissao;
    protected String autoresSubmissao[] ;
    protected int MAX_AUTORES ;

    public Submissao(String tituloSubmissao, Situacao situacaoSubmissao, String[] autoresSubmissao, int MAX_AUTORES) {
        this.tituloSubmissao = tituloSubmissao;
        this.situacaoSubmissao = situacaoSubmissao;
        this.autoresSubmissao = autoresSubmissao;
        this.MAX_AUTORES = MAX_AUTORES;
    }
    

    public ArrayList<Submissao> getListaSubmissao() {
        return listaSubmissao;
    }

    public void setListaSubmissao(ArrayList<Submissao> listaSubmissao) {
        this.listaSubmissao = listaSubmissao;
    }

    public String getTituloSubmissao() {
        return tituloSubmissao;
    }

    public void setTituloSubmissao(String tituloSubmissao) {
        this.tituloSubmissao = tituloSubmissao;
    }

    public Situacao getSituacaoSubmissao() {
        return situacaoSubmissao;
    }

    public void setSituacaoSubmissao(Situacao situacaoSubmissao) {
        this.situacaoSubmissao = situacaoSubmissao;
    }

    public String[] getAutoresSubmissao() {
        return autoresSubmissao;
    }

    public void setAutoresSubmissao(String[] autoresSubmissao) {
        this.autoresSubmissao = autoresSubmissao;
    }

    public int getMAX_AUTORES() {
        return MAX_AUTORES;
    }

    public void setMAX_AUTORES(int MAX_AUTORES) {
        this.MAX_AUTORES = MAX_AUTORES;
    }
    @Override 
    public String toString() {
        return "Submissao{" + "tituloSubmissao=" + tituloSubmissao + ", situacaoSubmissao=" + situacaoSubmissao + ", autoresSubmissao=" + autoresSubmissao + ", MAX_AUTORES=" + MAX_AUTORES + '}';
    }
    
}

