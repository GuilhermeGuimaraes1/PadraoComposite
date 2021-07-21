/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocomposite_;

/**
 *
 * @author Guilherme
 */
public class AssinaturaBonze implements Assinatura{
    
    @Override
    public void print() {
        System.out.println("========================");
        System.out.println("Assinatura Bronze");
        System.out.println("Itens: ");
        System.out.println("1 = Quadrinho R$15,00");
        System.out.println("1 = Chaveiro R$5,00");
        System.out.println("1 = Busto R$10,00");
        System.out.println("TOTAL: 30,00");
        System.out.println("========================");
    }
    
}
