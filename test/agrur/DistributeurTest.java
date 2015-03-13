/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author sio
 */
public class DistributeurTest extends TestCase {
    
    private Distributeur leDistributeur;
    
    public DistributeurTest(String testName) {
        super(testName);
    }

    public void testSomeMethod() {
    }

    @Override
    protected void setUp() throws Exception {
        String unId = "carr15432";
        String unNom="CORMONT";
        ArrayList<Commande> lesCommandes = new ArrayList<Commande>;
        
        leDistributeur = new Distributeur(unId,unNom,lesCommandes);
        
        
    }
    
    
    
}
