package org.sevenup.rest.controller.user;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.domain.user.User;
import org.sevenup.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
    private final UserService userService;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ResponseEntity<List<User>> getUsers() {
//		return userService.findUsers();
		List<User> userList = new ArrayList<User>();
		List<org.sevenup.domain.user.User> theUsers = userService.findUsers();
		for(int i=0;i<10;i++){
			User temp = new User();
			userList.add(temp);
		}
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<User> viewUser(@PathVariable String id) {
		
		User user = new User();
		user.setName("nonumber1989");
		user.setLocactionName("ShangHai");
		return new ResponseEntity<User>(user, HttpStatus.OK);
     // return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> createUser(@RequestBody User User,UriComponentsBuilder builder) {
		UUID idKey = UUID.randomUUID();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/user/{id}").buildAndExpand(idKey.toString()).toUri());
		return new ResponseEntity<User>(User, headers, HttpStatus.CREATED);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "signIn")
	@ResponseBody
	public boolean signIn(@RequestBody User User) {
		return true;
	}

	@RequestMapping(method = RequestMethod.POST, value = "signUp")
	public ResponseEntity<User> signUp(@RequestBody User User) {
		return new ResponseEntity<User>(User, HttpStatus.OK);
	}
}
