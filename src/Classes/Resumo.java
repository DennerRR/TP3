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
public class Resumo extends Trabalhos{
    private String autores[] = new String [7];
    private String instituicao[] = new String [7];
    private String palavraChave[] = new String [3];

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String[] getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String[] instituicao) {
        this.instituicao = instituicao;
    }

    public String[] getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String[] palavraChave) {
        this.palavraChave = palavraChave;
    }
    
    
}
