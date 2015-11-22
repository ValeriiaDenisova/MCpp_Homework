import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalcParamTest {
	
    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][] {
        	{ 5, 5, '+', 10 }, { 15, 5, '-', 10 }, { 5, 2, '*', 10 }, { 50, 5, '/', 10 }
        });
    }
	
	public int a, b, exp;
	public char op;

	public CalcParamTest(int a, int b, char op, int exp) {
		this.a = a;
		this.b = b;
		this.op = op;
		this.exp = exp;

//		int[][] xx = new int[][] { { 5, 5, '+', 10 }, { 15, 5, '-', 10 }, { 5, 2, '*', 10 }, { 50, 5, '/', 10 } };
//		for (int i = 0; i < xx.length; i++) {
//			testCalc(xx[i][0], xx[i][1], xx[i][2], xx[i][3]);
//		}
	}

	@Test
	public void testCalc() {
		int res = Calc.calc(a, b, op);
		assertEquals(exp, res);
	}

}
