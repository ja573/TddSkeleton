package com.oocode;

import org.junit.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.*;

public class recentlyUsedListShould {

	@Test
	public void beEmptyWhenInitialised() {
		RecentlyUsedList rul = new RecentlyUsedList();
		assertThat(rul.count(), is(0));
	}

	@Test
	public void shouldBeNlongIfNAdded() {
		RecentlyUsedList rul = new RecentlyUsedList();
		rul.add("Hen");
		assertThat(rul.count(), is(1));
		rul.add("Javi");
		assertThat(rul.count(), is(2));
	}

}
