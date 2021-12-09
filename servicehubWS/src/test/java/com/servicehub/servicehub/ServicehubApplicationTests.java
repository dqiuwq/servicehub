package com.servicehub.servicehub;

import com.servicehub.service.ServiceHubImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServicehubApplicationTests {

	@Mock
	ServiceHubImpl serviceHubImpl;

	@Test
	void testSendGreeting() {
		Mockito.when(serviceHubImpl.sendGreeting(Mockito.anyString())).thenReturn("Hello, World");
		Assertions.assertEquals("Hello, World", serviceHubImpl.sendGreeting(Mockito.anyString()));
	}

}
