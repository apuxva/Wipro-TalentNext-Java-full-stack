/*Create a class named TestSort to test the functionality of the sortValues method [hint: use assertArrayEquals method]*/

package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort extends DailyTasks {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortValues() {
		DailyTasks dt = new DailyTasks();
		int[] input = {1,3,4,2,5};
		int[] expected = {1,2,3,4,5};
		assertArrayEquals(expected, dt.sortValues(input));
		//fail("Not yet implemented");
	}

}
