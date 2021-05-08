package myProject;

public class BuyingService {
	
	public void buy(Game game) {
		System.out.println(game.gameName + " adlý oyunu " + game.getPriceAfterDiscount()+ " "+game.getCurrency()+" ücretle satýn aldýnýz.");
	}
	
}
