/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Categoria;


import SituacaoTipo.Situacao;
import SituacaoTipo.Tipo;
import Submissão.SubmissaoCientifica;

/**
 *
 * @author User
 */
public class Monografia extends SubmissaoCientifica{
    private Tipo tipo;
    private String orientador;
    private String curso;
    private int ano;
    private int numeroDePaginas;
    private String resumo;
    private String abs;
    private final int MAX_INSTITUICOES = 1;
    private final int MAX_PALAVRACHAVE = 4;

    public Monografia(String tituloSubmissao, Situacao situacaoSubmissao, String autoresSubmissao[],
            String instituicao[], String palavraChave[], Tipo tipo, String orientador, String curso, int ano,
            int numeroDePaginas, String resumo, String abs) {
        super(tituloSubmissao, situacaoSubmissao, autoresSubmissao, 1,instituicao, palavraChave);
        this.tipo = tipo;
        this.orientador = orientador;
        this.curso = curso;
        this.ano = ano;
        this.numeroDePaginas = numeroDePaginas;
        this.resumo = resumo;
        this.abs = abs;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
