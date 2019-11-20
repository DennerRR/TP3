package Abstract;

/**
 *
 * @author User
 */
public abstract class Situacao {
    public final int aprovado = 1;
    public final int reprovado = 2;
    public final int sobAvaliacao = 3;
    
    public abstract void aprovado();
    
    public abstract void reprovado();
    
    public abstract void sobAvaliacao();
    
}
