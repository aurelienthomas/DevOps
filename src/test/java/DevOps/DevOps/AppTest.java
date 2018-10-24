package DevOps.DevOps;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	App app;

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	public void setUp() throws Exception {
		this.app = new App();
	}

	public void tearDown() throws Exception {
		this.app = null;
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void testUnegaleUn() {
		assertEquals(1, 1);
	}

	public void testHelloWorld() {
		assertEquals(this.app.helloWorld(), "Hello World");
	}

}
