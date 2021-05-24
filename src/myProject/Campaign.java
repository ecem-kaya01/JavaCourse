package myProject;

public class Campaign {
	String campaignName ;
	String game1Name ;
	String game2Name ;
	Double priceBeforeCampaign;
	Double campaingPrice;
	Double profit;
	

	public Campaign(String campaignName, String game1Name, String game2Name, Double priceBeforeCampaign ,Double campaingPrice) {
		super();
		this.campaignName = campaignName;
		this.game1Name = game1Name;
		this.game2Name = game2Name;
		this.priceBeforeCampaign = priceBeforeCampaign;
		this.campaingPrice = campaingPrice;
		
		
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getGame1Name() {
		return game1Name;
	}
	public void setGame1Name(String game1Name) {
		this.game1Name = game1Name;
	}
	public String getGame2Name() {
		return game2Name;
	}
	public void setGame2Name(String game2Name) {
		this.game2Name = game2Name;
	}
	public Double getCampaingPrice() {
		return campaingPrice;
	}
	public void setCampaingPrice(Double campaingPrice) {
		this.campaingPrice = campaingPrice;
	}
	public Double getProfit() {
		return this.priceBeforeCampaign - this.campaingPrice ;
	}
	public void setPriceBeforeCampaign(Double priceBeforeCampaign) {
		this.priceBeforeCampaign = priceBeforeCampaign;
	}
	
}
