package myProject;

public class Game {
	String gameId;
	String gameName;
	Double gamePrice;
	Double discount;
	String currency ;
	Double priceAfterDiscount;
	
		
	public Game(String gameId, String gameName, Double gamePrice, String currency , Double discount) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.currency = currency;
		this.discount = discount;
		
	}



	public String getCurrency() {
		return currency;
	}


	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Double getPriceAfterDiscount() {
		return this.gamePrice - (this.gamePrice * this.discount/100);
	}
	
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public Double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(Double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public Double getDiscount() {
		
		return discount;
	}
}