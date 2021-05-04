package Abstract;

import Concrate.Player;

public interface PlayerService {
	
	void add(Player player);
	void delete(Player player);
	void update(Player player);
	Player get();
	Player[] getAll();

}
