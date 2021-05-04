package Abstract;

import Concrate.Campaign;

public interface CampingService {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
	Campaign get();
	Campaign[] getAll();

}
