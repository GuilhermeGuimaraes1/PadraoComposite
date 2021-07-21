package padraocomposite_;

public class AssinaturaOuro implements Assinatura{
    
    @Override
    public void print() {
        System.out.println("========================");
        System.out.println("Assinatura Ouro");
        System.out.println("Itens: ");
        System.out.println("1 = Quadrinho R$15,00");
        System.out.println("1 = Chaveiro R$5,00");
        System.out.println("1 = Busto R$10,00");
        System.out.println("1 = Adesivo R$1,00");
        System.out.println("1 = Poster R$25,00");
        System.out.println("1 = Camiseta R$25,00");
        System.out.println("1 = Canetas R$3,00");
        System.out.println("TOTAL: 84,00");
        System.out.println("========================");
    }
}
