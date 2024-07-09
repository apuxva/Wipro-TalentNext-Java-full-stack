package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestCheckPresence extends DailyTasks {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCheckPresence() {
		DailyTasks dt = new DailyTasks();
		assertTrue(dt.checkPresence("Hello World", "World"));
        assertFalse(dt.checkPresence("Hello World", "Universe"));
		//fail("Not yet implemented");
	}

}
