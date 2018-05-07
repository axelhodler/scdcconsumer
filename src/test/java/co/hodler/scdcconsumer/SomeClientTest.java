package co.hodler.scdcconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureStubRunner(ids = {
	"co.hodler:scdcproxy:+:stubs:8095",
}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class SomeClientTest {

	@Test
	public void runs() {

	}
}