import static org.junit.Assert.*;

import org.junit.Test;
 

public class BankingTest {

	@Test
	public void test() {
		Account a = new Account();
		a.setBalance(1000);
		assertEquals(a.getFormattedBalance(), "$1,000.00");
	}

}
