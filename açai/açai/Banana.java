
package açai;


public class Banana extends BaseDecorator {

    public Banana(Adicional ac) {
        super(ac);
    }

    @Override
    public double custo() {
        return super.custo() + 3; 
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " Banana ";
    }
   
    
}
