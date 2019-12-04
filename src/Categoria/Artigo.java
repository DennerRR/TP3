/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;

import Submissão.SubmissaoCientifica;
import SituacaoTipo.Situacao;

/**
 *
 * @author User
 */
public class Artigo extends SubmissaoCientifica {

    private String resumo;
    private String abs;

    private final int MAX_INSTITUICOES = 8;
    private final int MAX_PALAVRACHAVE = 4;

    public Artigo(String tituloSubmissao, Situacao situacaoSubmissao, String autoresSubmissao[], String instituicao[],
            String palavraChave[], String resumo, String abs) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, 8, instituicao, palavraChave);
        this.resumo = resumo;
        this.abs = abs;
    }

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

    

}
