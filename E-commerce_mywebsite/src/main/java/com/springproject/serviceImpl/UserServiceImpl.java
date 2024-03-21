package com.springproject.serviceImpl;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.model.User;
import com.springproject.repository.UserRepository;
import com.springproject.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public void signup(User user) {

		userRepo.save(user);

	}

	@Override
	public User login(String un, String psw) {

		return userRepo.findByEmailAndPassword(un, psw);

	}

	@Override
	public User checkemail(String un) {

		return userRepo.findByEmail(un);
	}

	@Override
	public long countuser() {

		return userRepo.count();
	}

	@Override
	public User checkpassword(String psw) {
		
		
		return userRepo.findByPassword(psw);
	}

	@Override
	public void updatepassword(User user) {
		
		userRepo.save(user);
		
	}

	@Override
	public User getuserbyid(int id) {
		// TODO Auto-generated method stub
		
		return userRepo.findById(id).get();

		
	}

	

}
