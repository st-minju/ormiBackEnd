package com.barabam.tdd_study;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

  // 서비스 레이어가 현재 의존 중인 곳
  @Mock private UserRepository mockUserRepository;

  // 서비스 레이어 테스트 중
  @InjectMocks private UserService userService;

  @Test
  void getUserById_존재하는_사용자_조회_성공() {
    /*// userRepository는 mock 객체 (=가짜 객체)
        UserRepository mockUserRepository = mock(UserRepository.class);
        UserService userService = new UserService(mockUserRepository);
    */
    // 리턴해줄 값
    User expectedUser = new User(1L, "testuser");
    // when 절에 있는 코드를 호출하면 thenReturn 값을 리턴해줌
    when(mockUserRepository.findById(1L)).thenReturn(Optional.of(expectedUser));

    // getUserById()에 아무값이나 Long 타입의 값이 들어오면 오류 발생하지 않음
    // when(mockUserRepository.findById(anyLong())).thenReturn(Optional.of(expectedUser));

    // userService 단위 테스트 코드
    User actualUser = userService.getUserById(1L);

    // System.out.println(actualUser.getUsername());
    assertEquals(expectedUser, actualUser);
    verify(mockUserRepository).findById(1L);
  }

  @Test
  void getUserById_존재하지_않는_사용자_조회_실패() {
    /*UserRepository mockUserRepository = mock(UserRepository.class);
        UserService userService = new UserService(mockUserRepository);
    */
    User expectedUser = new User(1L, "testuser");

    // 리턴 값이 아무것도 없으면 Exception 발생
    when(mockUserRepository.findById(anyLong())).thenReturn(Optional.empty());

    User actualUser = userService.getUserById(1L);

    assertThrows(UserNotFoundException.class, () -> userService.getUserById(1L));
    verify(mockUserRepository).findById(1L);
  }
}
