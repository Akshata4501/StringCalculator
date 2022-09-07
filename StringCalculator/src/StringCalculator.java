import org.junit.platform.commons.annotation.Testable;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
@Testable
public class StringCalculator {
	private Calculate cal;
	@Before
	public void init() {
		cal=new Calculate();
	}
public void EmptyString() throws Exception {
	assertEquals(cal.calculate(""), 0);
}
public void singleval() throws Exception {
	assertEquals(cal.calculate("1"), 1);
}
public void returnsum() throws Exception {
	assertEquals(cal.calculate("1,2"), 3);
}
public void delimitednewline() throws Exception {
	assertEquals(cal.calculate("1\n2"), 3);
}
public void delimitedbothways() throws Exception {
	assertEquals(cal.calculate("1,2,3"), 6);
}
@Test(expected=Exception.class)
public void negativeinput() throws Exception {
	cal.calculate("-1");
}
public void greaterthan1000() throws Exception {
	assertEquals(cal.calculate("10,10,1001"), 20);
}
}
