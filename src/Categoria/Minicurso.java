/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;


import SituacaoTipo.Situacao;
import Submissão.SubmissaoApresentacao;

/**
 *
 * @author User
 */
public class Minicurso extends SubmissaoApresentacao{
       private String recursos;
    private String metodologia;

    public Minicurso(String tituloSubmissao, Situacao situacaoSubmissao, String autoresSubmissao[], String resumo,
            String abs, int duracao, String recursos, String metodologia) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, 3, resumo, abs, duracao);
        this.recursos = recursos;
        this.metodologia = metodologia;
    }


    public String getRecursos() {
        return recursos;
    }

    public void setRecursos(String recursos) {
        this.recursos = recursos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }
    
}
