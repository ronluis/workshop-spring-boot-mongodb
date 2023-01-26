package com.arsolutions.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arsolutions.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User aline = new User("1", "Aline", "aline.gmail.com");
		User luis = new User("2", "Luis", "luispi.gmail.com");

		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(aline, luis));
		return ResponseEntity.ok().body(list);
	}
}
