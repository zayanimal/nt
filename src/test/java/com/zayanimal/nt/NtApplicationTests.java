package com.zayanimal.nt;

import org.junit.jupiter.api.Test;
import us.abstracta.jmeter.javadsl.core.TestPlanStats;

import java.io.IOException;

import static us.abstracta.jmeter.javadsl.JmeterDsl.*;

class NtApplicationTests {

	@Test
	void performance() throws IOException {
		TestPlanStats stats = testPlan(
			threadGroup(5, 1,
				httpSampler("http://localhost:8080/queue")
					.param("timeout", "10000")
			)
		).run();

		TestPlanStats stats2 = testPlan(
			threadGroup(5, 1,
				httpSampler("http://localhost:8080/queue")
					.param("timeout", "1000")
			)
		).run();
	}
}
