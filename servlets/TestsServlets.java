package servlets;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class TestsServlets {
	
	@Test
	void testSaveVariablesAndParseThem() throws Exception {
		String[] reqParamsValues = {"globe", "5.687"};
		String shape = reqParamsValues[0];
		ArrayList<Double> doubleParams = new ArrayList<Double>();
		for (int i = 1; i < reqParamsValues.length; i ++) {
			doubleParams.add(Double.parseDouble(reqParamsValues[i]));
		}
		
		assertEquals("globe", shape);
		assertEquals(5.687, doubleParams.get(0));
	}
}
