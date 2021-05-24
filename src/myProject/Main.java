package myProject;

public class Main {

	public static void main(String[] args) {
		
		
		Game game1 = new Game("1" , "Hearts Of Iron 4 " , 2870.0 , "TL " ,10.0 );
		Game game2 = new Game("2" , "EA SPORTS™ FIFA 21 " , 419.99 , "TL " ,67.0);
		Game game3= new Game("3", "Counter-Strike: Global Offensive", 127.0 , "$",2.0 );
		
		Game games[] = new Game[] {game1,game2, game3};
		
		BuyingService buyingService = new BuyingService();
		
		for (Game game : games) {
			buyingService.buy(game);
			System.out.println("---------------------------------------------");
		}
		
				
		Customer  customer1 = new Customer("12345","Ecem" , "Kaya", "2007" );
		Customer customer2 = new Customer("23456", "Ayþe", "Yýldýz" , "1990" );
		Customer customer3 = new Customer("34567","Mehmet" , "Çakmak", "2010");
		Customer customer4 = new Customer("45678", "Engin", "Demiroð","1987");
		
		Customer customers[] = new Customer[] { customer1 ,customer2 ,customer3 ,customer4};
		
		VerifyingService verifyingService = new VerifyingService();
		
		for (Customer customer : customers) {
			verifyingService.verify(customer);
			System.out.println("---------------------------------------------");			
		}
		
		
		Campaign campaign1 = new Campaign("Old But Gold Campaign" , "Sims 4" , "GTA 4" , 1340.0 , 987.0);
		Campaign campaign2 = new Campaign("Summer Campaign" , "PUBG" , "GTA San Andreas" , 389.0 , 232.0);
		Campaign campaign3 = new Campaign("Crazy Campaign" , "Doki Doki Literature Club " , "The Witcher 3" , 567.0 , 458.0);
		
		Campaign campaigns[] = new Campaign[] {campaign1 , campaign2 , campaign3};
		
		CampaignManager campaignManager = new CampaignManager();
		
		for (Campaign campaign : campaigns) {
			campaignManager.add(campaign);
			System.out.println("---------------------------------------------");	
			campaignManager.update(campaign);
			System.out.println("---------------------------------------------");	
			campaignManager.delete(campaign);
			System.out.println("---------------------------------------------");	
		}
		
	
	
		
	}
	}


