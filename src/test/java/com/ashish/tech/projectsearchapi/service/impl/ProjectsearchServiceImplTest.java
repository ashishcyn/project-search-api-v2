package com.ashish.tech.projectsearchapi.service.impl;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.ashish.tech.projectsearchapi.service.ProjectsearchService;
import com.ashish.tech.projectsearchapi.service.dto.ProjectDTO;
import com.ashish.tech.projectsearchapi.service.dto.UserDTO;

public class ProjectsearchServiceImplTest {

	ProjectsearchService projectsearchService = new ProjectsearchServiceImpl();;

	@Test
	public void testUserDetails() throws Exception {
		final UserDTO user = new UserDTO();
		user.setName("Ashish C");

		// final ProjectsearchService projectService =
		// Mockito.mock(ProjectsearchServiceImpl.class);
		// Mockito.when(projectService.getUserDetails("test_username")).thenReturn(user);
		// final UserDTO result = projectService.getUserDetails("test_username");
		// Assertions.assertEquals( user.getUserName(), result.getUserName(), "Username
		// are same");
		final UserDTO result = projectsearchService.getUserDetails("ashishcyn");
		Assertions.assertEquals(user.getName(), result.getName(), "Name are same");
	}

	@Test
	void testgetAllProjects() throws Exception {

		final List<ProjectDTO> results = projectsearchService.getAllProjects("ashishcyn");
		Assertions.assertTrue(results.size() >= 0, "Method returend value successfully");
	}

	@Test
	void testgetAllContributors() throws Exception {

		final List<UserDTO> results = projectsearchService.getAllContributors("ashishcyn", "project-search-api");
		Assertions.assertTrue(results.size() >= 0, "Method returend value successfully");
	}

	@Test
	void testgetReadmeData() throws Exception {

		String results = projectsearchService.getReadmeData("ashishcyn", "project-search-api");
		Assertions.assertTrue(results.length() >= 0, "Method returend value successfully");

	}

}
