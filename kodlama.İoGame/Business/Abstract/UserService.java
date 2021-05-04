package Abstract;

import Concrate.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	User get();
	User[] getAll();


}
