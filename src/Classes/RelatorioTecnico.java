package Classes;

/**
 *
 * @author Denner
 */
public class RelatorioTecnico extends Trabalhos{

    private String autor;
    private String instituicao;
    private int ano;
    private int NdePaginas;
    private String palavraChave;
    private String resumo;
    private String abstract;

    public RelatorioTecnico() {
        super();
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
