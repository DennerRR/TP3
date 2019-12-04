/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;


import SituacaoTipo.Situacao;
import Submissão.SubmissaoCientifica;

/**
 *
 * @author User
 */
public class Resumo extends SubmissaoCientifica{
 private final int MAX_INSTITUICOES = 8;
    private final int MAX_PALAVRACHAVE = 4;

    public Resumo(String tituloSubmissao, Situacao situacaoSubmissao, String autoresSubmissao[], String instituicao[],
            String palavraChave[]) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, 8, instituicao, palavraChave);
    }

}