package Categoria;

import SituacaoTipo.Situacao;
import Submissão.SubmissaoCientifica;

/**
 *
 * @author Denner
 */
public class RelatorioTecnico extends SubmissaoCientifica {

    private String resumo;
    private String abs;
    private int ano;
    private int numeroDePaginas;

    private final int MAX_INSTITUICOES = 1;
    private final int MAX_PALAVRACHAVE = 4;

     public RelatorioTecnico(String tituloSubmissao, Situacao situacaoSubmissao, String autoresSubmissao[],
            String instituicao[], String palavraChave[], String resumo, String abs, int ano,
            int numeroDePaginas) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, 4, instituicao, palavraChave);
        this.resumo = resumo;
        this.abs = abs;
        this.ano = ano;
        this.numeroDePaginas = numeroDePaginas;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

}
