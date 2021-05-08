package myProject;

public class CampaignManager {	
	
	public void add(Campaign campaign) {
		System.out.println("You added : " + campaign.getCampaignName() + campaign.getProfit()  +  " $ is your profit.");
	}
	
	public void delete(Campaign campaign) {
		System.out.println("You deleted : " + campaign.getCampaignName() + campaign.getProfit()  +  " $ is your lose.");
	}
	
	public void update(Campaign campaign) {
		System.out.println("You updated : " + campaign.getCampaignName()  + campaign.getProfit()  +  " $ is your profit.");
	}

}
