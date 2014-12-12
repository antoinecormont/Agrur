
package agrur;

public class CommandesXML {
    
    //Données de produit
    private String variete;
    private String type;
    private int calibre;
    
    //Données de commande
    private int id;
    private double prixHT;
    private String conditionnement;
    private int quantite;
    private String dateConditionnement;
    private String dateEnvoi;
	
    /*public CommandesXML() {
	    this("anonymous", "");
    }
	
    public CommandesXML(String login, String password) {
        this.login = login;
        this.password = password;
    }
	
    public String getLogin() {
        return login;
    }
	
    public void setLogin(String login) {
        this.login = login;
    }
	
    public String getPassword() {
        return password;
    }
	
    public void setPassword(String password) {
        this.password = password;
    }
	
    public String toString() {
        return login;
    }
    
    public static void main(String[] args) {
        try {
            CommandesXML user = new CommandesXML("admin", "azerty");
            XMLTools.encodeToFile(user, "user.xml");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
*/