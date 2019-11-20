/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Abstract.Submissao;

/**
 *
 * @author User
 */
public class Artigo extends Submissao {
    private String instituicao[] = new String [7];
    private String palavraChave[] = new String [7];
    private String resumo;

    public Artigo(String resumo) {
        this.resumo = resumo;
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

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    
}
