package Concrate;

import Abstract.MernisService;


public class MernisManager implements MernisService {

	public boolean validate(Player player) {
		
		System.out.println(player.getFirstName() + " is validated to register");
		
		return true;
	}
	}


