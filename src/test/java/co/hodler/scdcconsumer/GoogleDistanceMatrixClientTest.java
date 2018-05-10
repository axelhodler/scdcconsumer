package co.hodler.scdcconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureStubRunner
public class GoogleDistanceMatrixClientTest {

	@Autowired
	GoogleDistanceMatrixClient subject;

	@Test
	public void can_get_duration_between_two_cities() {
		Integer duration = subject.getDrivingDurationBetween("Berlin", "Stuttgart");

		assertThat(duration).isEqualTo(22738);
	}
}