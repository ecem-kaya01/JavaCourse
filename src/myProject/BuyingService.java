package myProject;

public class BuyingService {
	
	public void buy(Game game) {
		System.out.println(game.gameName + " adl� oyunu " + game.getPriceAfterDiscount()+ " "+game.getCurrency()+" �cretle sat�n ald�n�z.");
	}
	
}
