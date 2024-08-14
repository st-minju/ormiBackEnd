package com.barabam.tdd_study.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.barabam.tdd_study.entity.User;
import com.barabam.tdd_study.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(value = UserController.class)
@WithMockUser(username = "test")
public class UserControllerTest {
  @Autowired private MockMvc mockMvc;

  @MockBean private UserService userService;

  @Autowired private ObjectMapper objectMapper;

  private User testUser;

  @BeforeEach
  void setUp() {

    testUser = new User("test@example.com", "password", "Test User");
  }

  @Test
  void testRegisterUser() throws Exception {
    UserRegistrationDto registrationDto =
        new UserRegistrationDto("test@example.com", "password", "Test User");
    when(userService.registerUser(any(), any(), any())).thenReturn(testUser);

    mockMvc
        .perform(
            post("/api/users/register")
                .with(csrf())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(registrationDto)))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.email").value("test@example.com"))
        .andExpect(jsonPath("$.name").value("Test User"));
  }

  @Test
  void testGetUser() throws Exception {
    when(userService.getUserByEmail("test@example.com")).thenReturn(testUser);

    mockMvc
        .perform(get("/api/users/test@example.com").with(csrf()))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.email").value("test@example.com"))
        .andExpect(jsonPath("$.name").value("Test User"));
  }

  @Test
  void testUpdateUser() throws Exception {
    UserUpdateDto updateDto = new UserUpdateDto("newpassword", "Updated User");
    User updatedUser = new User("test@example.com", "newpassword", "Updated User");
    when(userService.updateUser(any(), any(), any())).thenReturn(updatedUser);

    mockMvc
        .perform(
            put("/api/users/test@example.com")
                .with(csrf())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updateDto)))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.name").value("Updated User"));
  }

  @Test
  void testDeleteUser() throws Exception {
    UserDeleteDto deleteDto = new UserDeleteDto("password");

    mockMvc
        .perform(
            delete("/api/users/test@example.com")
                .with(csrf())
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(deleteDto)))
        .andExpect(status().isNoContent());
  }
}
