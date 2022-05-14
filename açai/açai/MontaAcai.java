package açai;

public class MontaAcai {

    public static void main(String[] args) { 
        Adicional add = new Acai();
        System.out.println(add.getDescricao());
        Adicional bn = new Morango(add);         
        System.out.println(bn.getDescricao());
        Adicional mr = new Morango(add);        
        mr = new LeiteCondensado(mr);
        mr = new Banana(mr);
        System.out.println(mr.getDescricao());
       
        
        
        
    }
    
}
