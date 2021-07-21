
package padraocomposite_;

public class AssinaturaPlatina implements Assinatura{
    
    @Override
    public void print() {
        System.out.println("========================");
        System.out.println("Assinatura Platina");
        System.out.println("Itens: ");
        System.out.println("2 = Quadrinho R$30,00");
        System.out.println("2 = Chaveiro R$10,00");
        System.out.println("1 = Busto R$10,00");
        System.out.println("1 = Adesivo R$1,00");
        System.out.println("1 = Poster R$25,00");
        System.out.println("1 = Camiseta R$25,00");
        System.out.println("1 = Canetas R$3,00");
        System.out.println("1 = Miniaturas R$20,00");
        System.out.println("TOTAL: 124,00");
        System.out.println("========================");
    }
}
