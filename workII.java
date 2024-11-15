package workII;

public class workII {
	
	public class EconomiesIphoneSansWeekend {

	    public static void main(String[] args) {
	        // Définition des variables
	        double prixIphone = 285000;
	        double taxe = 0.15;
	        double montantParJour = 2500; 

	        double montantTotal = prixIphone + (prixIphone * taxe);
	        
	        int nombreDeJoursEffectifs = 0;
	        int joursCompteur = 0; 
	        double totalEconomise = 0;
	        
	        while (totalEconomise < montantTotal) {
	            if (joursCompteur % 7 != 5 && joursCompteur % 7 != 6) {
	                totalEconomise += montantParJour;
	                nombreDeJoursEffectifs++;
	            }	            
	            joursCompteur++;
	        }
	        System.out.println("Le nombre de jours nécessaires pour économiser " +
	                montantTotal + " Gourdes sans épargner le week-end est : " + joursCompteur + " jours calendaires.");
	        System.out.println("Nombre de jours effectifs d'épargne (lundi à vendredi) : " + nombreDeJoursEffectifs);
	    }
	}

}
