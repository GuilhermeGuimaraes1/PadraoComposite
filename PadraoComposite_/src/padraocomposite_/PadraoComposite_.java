
package padraocomposite_;

public class PadraoComposite_ {

    public static void main(String[] args) {
        
        AssinaturaBonze assinaturaBronze = new AssinaturaBonze();
        AssinaturaPrata assinaturaPrata = new AssinaturaPrata();
        AssinaturaOuro assinaturaOuro = new AssinaturaOuro();
        AssinaturaPlatina assinaturaPlatina = new AssinaturaPlatina();
        
        CompositeAssinatura assinatura = new CompositeAssinatura();
        CompositeAssinatura assinatura1 = new CompositeAssinatura();
        CompositeAssinatura assinatura2 = new CompositeAssinatura();
        CompositeAssinatura assinatura3 = new CompositeAssinatura();
        
        assinatura.add(assinaturaBronze);
        assinatura1.add(assinaturaPrata);
        assinatura2.add(assinaturaOuro);
        assinatura3.add(assinaturaPlatina);
        
        assinatura.print();
        assinatura1.print();
        assinatura2.print();
        assinatura3.print();
        
    }
    
}
