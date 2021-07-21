/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraocomposite_;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class CompositeAssinatura implements Assinatura{
    
    private List<Assinatura> childAssinaturas = new ArrayList<Assinatura>();
    
    @Override
    public void print() {
        for (Assinatura assinaturas : childAssinaturas ) {
            assinaturas.print();
        }
    }
    
    public void add(Assinatura assinaturas) {
        childAssinaturas.add(assinaturas);
    }
    
        public void remove(Assinatura assinaturas) {
        childAssinaturas.remove(assinaturas);
    }
}
