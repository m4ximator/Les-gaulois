package scenario;
import personnages.*;

public class 	Scenario {

	public static void main(String[] args) {
		Gaulois asterix=new Gaulois("asterix", 8);
		Romain minus= new Romain ("minus",6);
		System.out.println(asterix);
		asterix.parler("Bonjour a tous");
		minus.parler("un GAU... UN GAUUUUUGAU...");
		asterix.frapper(minus);
		
		
		Druide panoramix= new Druide("panoramix",5,10);
		panoramix.preparerPotion();
		panoramix.preparerPotion();panoramix.preparerPotion();
		
	}

}
