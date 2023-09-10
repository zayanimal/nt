package com.zayanimal.nt;

import org.junit.jupiter.api.Test;
import us.abstracta.jmeter.javadsl.core.TestPlanStats;

import java.io.IOException;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

class NtApplicationTests {

	@Test
	void performance() throws IOException {
		TestPlanStats stats = testPlan(
			threadGroup(4, 1,
				httpSampler("http://localhost:8080")
			),
			//this is just to log details of each request stats
			jtlWriter("target/jtls")
		).run();
	}
}
