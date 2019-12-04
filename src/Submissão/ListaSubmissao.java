/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Submissão;

import Interfaces.ISubmissoes;
import SituacaoTipo.Situacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public abstract class ListaSubmissao implements ISubmissoes {
    private ArrayList<Submissao> listaSub = new ArrayList<>();
    
    @Override
    public boolean incluir(Submissao submission) {
        return listaSub.add(submission);
    }

    public ArrayList<Submissao> getLista() {
        ArrayList<Submissao> submissoes = new ArrayList<>();
        
        for (Submissao submissao : listaSub) {
               submissoes.add(submissao);
        }

        return submissoes;
    }

    @Override
    public Submissao consultarTitulo(String titulo) {
        for (Submissao submissao: listaSub) {
            if (submissao.getTituloSubmissao().equals(titulo)) {
                return submissao;
            }
        }
        return null;
    }

    @Override
    public List<Submissao> consultarAutor(String autor) {
        List<Submissao> submissoesAutor = new ArrayList<>();

        for (Submissao submissao : listaSub) {
            String autores[] = submissao.getAutoresSubmissao();
            for (int i = 0; i < autores.length; i++) {
                if (autores[i].equals(autor)) {
                    submissoesAutor.add(submissao);    
                }
            } 
        }

        return submissoesAutor;
    }

    
    public List<Submissao> consultarCategoria(String categoriaName) {
        List<Submissao> submissoesCategoria = new ArrayList<>();

        for (Submissao submissao : listaSub) {
            if (submissao.getClass().getSimpleName().equals(categoriaName)){
               submissoesCategoria.add(submissao);
            }
        }

        return submissoesCategoria;
    }

    public List<Submissao> consultarSituacao(Situacao situacao) {
        List<Submissao> submissoesSituacao = new ArrayList<>();
        
        for (Submissao submissao : listaSub) {
            if (submissao.getSituacaoSubmissao().equals(situacao)){
               submissoesSituacao.add(submissao);
            }
        }

        return submissoesSituacao;
    }

    public List<Submissao> consultaSituacaoCategoria(String categoriaNome, Situacao situacao) {
        List<Submissao> submissoesSituacaoCategoria = new ArrayList<>();
        
        for (Submissao submissaoSitu : consultarSituacao(situacao)) {
            for (Submissao submissaoCategoria : consultarCategoria(categoriaNome)) {
                if (submissaoSitu.equals(submissaoCategoria)) {
                    submissoesSituacaoCategoria.add(submissaoCategoria);
                }
            }
        }

        return submissoesSituacaoCategoria;
    }



    @Override
    public boolean excluir(String titulo) {
        for (Submissao submissao : listaSub) {
            if (submissao.getTituloSubmissao().equals(titulo)) {
                listaSub.remove(submissao);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String lista= "";
        for (Submissao submissao : listaSub) {
            lista += submissao.tituloSubmissao+ "\n";
        }
        return lista;
    }
}
    

