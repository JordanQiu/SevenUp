package org.sevenup.rest.controller.user;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sevenup.rest.domain.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
	
	@RequestMapping(value ="/users",method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<User> getAllAccounts() {
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User tempUser = new User();
			tempUser.setUid("hhhh"+i);
			userList.add(tempUser);
		}
		return userList;
	}

}
