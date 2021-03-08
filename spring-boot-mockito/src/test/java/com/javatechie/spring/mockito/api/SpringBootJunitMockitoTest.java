/*package com.javatechie.spring.mockito.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.security.Provider.Service;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.javatechie.spring.mockito.api.dao.UserRepository;
import com.javatechie.spring.mockito.api.model.User;
import com.javatechie.spring.mockito.api.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJunitMockitoTest {

	@Autowired
	private UserService service;
	@MockBean
	private UserRepository repo;
	
	@Test
	public void testservice() {
		
		//predefined static metod in mockito
		when(repo.findAll()).thenReturn(Stream.of(new User(376,"danie",31, "USA"),new User(376,"danie",31, "USA")).collect(Collectors.toList()));
		assertEquals(2, service.getUsers().size());
	}
	
	@Test
	public void testservicebyaddress() {
		
		//predefined static metod in mockito
		when(repo.findByAddress("bangalore")).thenReturn(Stream.of(new User(376,"danie",31, "USA")).collect(Collectors.toList()));
		assertEquals(1, service.getUserbyAddress("galore").size());
	}
	
	@Test
	public void testservicesave() {
		User an=new User(376,"danie",31, "USA");
		//predefined static metod in mockito
		when(repo.save(an)).thenReturn(an);
		assertEquals(an, service.addUser(an));
	}
	
	@Test
	public void testservicedelete() {
		User an=new User(376,"danie",31, "USA");
		//predefined static metod in mockito
		//when(repo.delete(an)).thenReturn(an);//we cant give when condition for delete as we dont return anything, also no assert as we dont compare anything,
		//assertEquals(an, service.deleteUser(an));//we just only verify it whether git deleted
		repo.delete(an);
		verify(repo,times(1)).delete(an);
	
	}
}
*/