package Arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import Submissão.Submissao;

/**
 * Arquivo
 */
public class Arquivo {

    private File arquivo;

    public Arquivo() {
        arquivo = new File("Submissoes.bin");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
    } 

    public List<Submissao> listSubmissoes() {
        List<Submissao> submissoes;

        if(arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
            submissoes = (List<Submissao>) in.readObject();
            in.close();
        } else {
            submissoes = new ArrayList<>();
        }

        return submissoes;
    }

}