package Categoria;

import SituacaoTipo.Situacao;

import Submissão.SubmissaoApresentacao;

/**
 *
 * @author Denner
 */
public class Palestra extends SubmissaoApresentacao {

    private String curriculo;

    public Palestra(String tituloSubmissao, Situacao situacaoSubmissao, String autoresSubmissao[], String resumo,
            String abs, int duracao, String curriculo) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, 1, resumo, abs, duracao);
        this.curriculo = curriculo;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

}
