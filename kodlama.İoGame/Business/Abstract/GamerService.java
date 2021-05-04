package Abstract;

import Concrate.Gamer;

public interface GamerService {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	Gamer get();
	Gamer[] getAll();


}
