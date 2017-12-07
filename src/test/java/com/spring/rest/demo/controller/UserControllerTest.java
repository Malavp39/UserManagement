package com.spring.rest.demo.controller;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.spring.rest.demo.service.impl.UserServiceImpl;
import com.spring.rest.demo.wrapper.UserWrapper;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@InjectMocks
	private UserController userController;

	@Mock
	private UserServiceImpl userService;

	@Before
	public void setUp() {
		userController = new UserController();
		userController.setUserService(userService);
	}

	@Test
	public void testGetAllUsersCallServiceProperly() {
		Mockito.when(userService.getAllUsers()).thenReturn(Matchers.anyList());
		List<UserWrapper> result = userController.getAllUsers();
		Assert.assertFalse(result.isEmpty());
		Mockito.verify(userService, Mockito.times(1)).getAllUsers();
	}

}
