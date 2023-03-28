package crudappcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crudappentity.userentity;
import crudapprepository.userrepository;

@RestController
public class usercontroller {

	
	@Autowired
	userrepository repository;
	@PostMapping("/adduser")
	public userentity adduser(@RequestBody userentity entity) {
		return repository.save(entity);
	}
	
	
	@GetMapping("/users")
	public List<userentity> userlist() {
		
		return repository.findAll();
	}
	
	
	@PutMapping("/updateuser")
	public userentity updateuser(@RequestBody userentity entity) {
		
		return repository.saveAndFlush(entity);
	}
	
	
	@DeleteMapping("/deleteusers")
	public String deleteuser(@RequestParam long id) {
		repository.deleteById(id);
		return "User is deleted";
	}
	
	
	
}












