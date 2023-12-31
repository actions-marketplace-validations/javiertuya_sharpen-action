package test4giis.sharpen.action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import giis.visualassert.VisualAssert;

/**
 * Check that translation works by comparing translated files (in src/main/main.net) and the expected (in expected)
 */
public class TestSharpenOutputComparison {
	@Test
	public void testTranslatedMainApp() throws Throwable {
		String expected=FileUtils.readFileToString(new File("expected/MainApp.cs"), "UTF-8").replace("\r","");
		String actual=FileUtils.readFileToString(new File("src/main/main.net/Giis.Sharpen.Action/MainApp.cs"), "UTF-8").replace("\r","");
		new VisualAssert().setBrightColors(true).assertEquals(expected, actual);
	}
	@Test
	public void testTranslatedSimpleClass() throws Throwable {
		String expected=FileUtils.readFileToString(new File("expected/SimpleClass.cs"), "UTF-8").replace("\r","");
		String actual=FileUtils.readFileToString(new File("src/main/main.net/Giis.Sharpen.Action/SimpleClass.cs"), "UTF-8").replace("\r","");
		new VisualAssert().setBrightColors(true).assertEquals(expected, actual);
	}
}
