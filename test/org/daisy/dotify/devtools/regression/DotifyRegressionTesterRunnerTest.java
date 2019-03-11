package org.daisy.dotify.devtools.regression;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
@SuppressWarnings("javadoc")
public class DotifyRegressionTesterRunnerTest {

	@Test
	public void testIsSameArgument() {
		assertTrue(DotifyRegressionTesterRunner.isSameArgument("--locale=sv", "--locale=en"));
		assertTrue(DotifyRegressionTesterRunner.isSameArgument("locale", "locale"));
		assertFalse(DotifyRegressionTesterRunner.isSameArgument("--locale=sv", "--preset=sv"));
		assertFalse(DotifyRegressionTesterRunner.isSameArgument("--locale=sv", "-locale=sv"));
	}
	
	@Test
	public void testGetArgumentKey() {
		assertEquals("--locale", DotifyRegressionTesterRunner.getArgumentKey("--locale=sv"));
		assertEquals("locale", DotifyRegressionTesterRunner.getArgumentKey("locale"));
		assertEquals("-locale", DotifyRegressionTesterRunner.getArgumentKey("-locale=sv"));
	}
}
