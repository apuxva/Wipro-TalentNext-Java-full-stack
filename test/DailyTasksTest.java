package com.wipro.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class DailyTasksTest extends DailyTasks {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoStringConcat() {
		DailyTasks d = new DailyTasks();
		String s = d.doStringConcat("apurva","patil");
		assertEquals("apurva patil" , s);
		//fail("Not yet implemented");
	}

}
