
package açai;


public class LeiteCondensado extends BaseDecorator {
    
    public LeiteCondensado(Adicional ac) {
        super(ac);
    }
    @Override
    public double custo() {
        return super.custo() + 2;
    }
    
    @Override
    public String getDescricao() {
        return super.getDescricao() + " Leite condensado";
    }
}
