package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private Random random = new Random();
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
	this.nom = nom;
	this.effetPotionMin = effetPotionMin;
	this.effetPotionMax = effetPotionMax;
	parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
	+ effetPotionMax + ".");
	}
	
	public String getNom() {
	return nom;
	}
	
	public void parler(String texte) {
	System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
	return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		System.out.println(effetPotionMax);
		forrandom.nextInt(effetPotionMax); //rajouter variable locale
		if (forcePotion>7) {
			parler("J'ai pr�par� une super potion de force :"+forcePotion+" de force");
		}
		else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force: "+forcePotion);
		}
		
		
	}


	}

