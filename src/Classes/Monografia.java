/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author User
 */
public class Monografia extends Trabalhos{
    
    private String tipo;
    private String autor;
    private String instituicao;
    private String orientador;
    private String curso;
    private int ano;
    private int NdePaginas;
    private String palavraChave;
    private String resumo;
    private String abstract;

    public Monografia() {
        super();
    }

    public String getTipo() {
	    return this.tipo;
    }

    public void setTipo(String tipo) {
	    this.tipo = tipo;
    }


    public String getAutor() {
    	return this.autor;
    }
    public void setAutor(String autor) {
    	this.autor = autor;
    }


    public String getInstituicao() {
    	return this.instituicao;
    }
    public void setInstituicao(String instituicao) {
    	this.instituicao = instituicao;
    }


    public String getOrientador() {
    	return this.orientador;
    }
    public void setOrientador(String orientador) {
    	this.orientador = orientador;
    }


    public String getCurso() {
    	return this.curso;
    }
    public void setCurso(String curso) {
    	this.curso = curso;
    }


    public int getAno() {
    	return this.ano;
    }
    public void setAno(int ano) {
    	this.ano = ano;
    }


    public int getNdePaginas() {
    	return this.NdePaginas;
    }
    public void setNdePaginas(int NdePaginas) {
    	this.NdePaginas = NdePaginas;
    }


    public String getPalavraChave() {
    	return this.palavraChave;
    }
    public void setPalavraChave(String palavraChave) {
    	this.palavraChave = palavraChave;
    }


    public String getResumo() {
    	return this.resumo;
    }
    public void setResumo(String resumo) {
    	this.resumo = resumo;
    }


    public String getAbstract() {
    	return this.abstract;
    }
    public void setAbstract(String abstract) {
    	this.abstract = abstract;
    }




}
