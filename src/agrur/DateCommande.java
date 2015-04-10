

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author JV
 */
public class DateCommande {
   private int annee;
   private int mois;
   private int jour;
   
  public DateCommande(int a, int m, int j){
      this.annee=a;
      this.mois=m;
      this.jour=j;
  } 
   

  
   public static DateCommande aujourdhui(){	

    int jour, mois, annee;
    Calendar calendar = new GregorianCalendar();
    Date dateJour = new Date();
    calendar.setTime(dateJour);
    annee = calendar.get(Calendar.YEAR);
    mois = calendar.get(Calendar.MONTH)+1;
    jour=  calendar.get(Calendar.DAY_OF_MONTH);
    
  
    DateCommande d = new DateCommande(annee, mois, jour);
     
    return d; 
   }
   
   public int annee(){
       return annee;
   }
      public int mois(){
       return mois;
   }
      public int jour(){
       return jour;
   }
      
}  