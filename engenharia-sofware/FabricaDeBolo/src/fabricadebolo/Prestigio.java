
package fabricadebolo;

public class Prestigio extends AbstractBolo{

    public Prestigio() {
        setNome("Prestigio");
        setPreco(15.56f);
        setTipo("4 ovos");
    }

    
    @Override
    public void receita() {
       System.out.println("Receita");
    }

    
}
