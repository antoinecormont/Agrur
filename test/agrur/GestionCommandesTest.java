/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agrur;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import junit.framework.TestCase;

/**
 *
 * @author sio
 */
public class GestionCommandesTest extends TestCase {
    
    private GestionCommandes uneGestionCmd;
    private Distributeur unDistrib;
    
    @Override
    public void setUp() throws Exception {
        PersistanceSQL unePersSQL = new PersistanceSQL("root","","jdbc:mysql://localhost/gestcommande","org.gjt.mm.mysql.Driver");
        ArrayList<Commande> lesCommandes = new ArrayList<Commande>();
        unDistrib = new Distributeur("carr15432","CORMONT",lesCommandes);
        
        uneGestionCmd = new GestionCommandes(unePersSQL);
        
    }
    
    public void testGetDistributeur() throws IOException, SQLException {
        Distributeur leDistrib = uneGestionCmd.getDistributeur(unDistrib.getId());
        assertEquals("Deux distributeurs différents ont été renvoyés", unDistrib,leDistrib);
    }
    
    public void testXmlNonLivrees(){
        
    }
    
}
