package agrur;

public class CommandesXML {
    
    //Données de commande
    private int id;
    private Produit leProduit;
    private double prixHT;
    private String conditionnement;
    private int quantite;
    private String dateConditionnement;
    private String dateEnvoi;
	
    public CommandesXML(int id, Produit leProduit, double prixHT, String conditionnement, int quantite, String dateConditionnement) {
        this.id = id;
        this.leProduit = leProduit;
        this.prixHT = prixHT;
        this.conditionnement = conditionnement;
        this.quantite = quantite;
        this.dateConditionnement = dateConditionnement;
        this.dateEnvoi = null;
    }

    public int getId() {
        return id;
    }

    public Produit getLeProduit() {
        return leProduit;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public String getConditionnement() {
        return conditionnement;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDateConditionnement() {
        return dateConditionnement;
    }

    public String getDateEnvoi() {
        return dateEnvoi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLeProduit(Produit leProduit) {
        this.leProduit = leProduit;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public void setConditionnement(String conditionnement) {
        this.conditionnement = conditionnement;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setDateConditionnement(String dateConditionnement) {
        this.dateConditionnement = dateConditionnement;
    }

    public void setDateEnvoi(String dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
    
    public static void main(String[] args) {
        try {
            Produit p1 = new Produit("Mayette","Fraîche entière",2);
            CommandesXML c1 = new CommandesXML(1,p1,15.30,"Sachet",50,"2014-12-05");
            XMLTools.encodeToFile(c1, "c1.xml");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
