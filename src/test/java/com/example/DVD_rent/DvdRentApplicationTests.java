package com.example.DVD_rent;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// JUnit 5 importok
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Mockito importok
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

// A tesztelt osztály importálása
import com.example.DVD_rent.model.Dvd;
import com.example.DVD_rent.service.DvdService;
import com.example.DVD_rent.repository.DvdRepository;

@SpringBootTest
class DvdRentApplicationTests {

	@Test
	void contextLoads() {
	}

}
