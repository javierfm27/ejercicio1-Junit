import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class UnionTest {

	private Vector<Integer> V1;
	private Vector<String> V2;
	//Set up - Called before every test method
	@Before
	public void setUp() 
	{
		this.V1 = new Vector<Integer>();
		this.V2 = new Vector<String>();
	}
	
	@Test (expected = NullPointerException.class)
	public void testForSetEmpty() 
	{
		try {
			Union.union(V1,V2);
		}catch (NullPointerException e) {
			return;
		}
		fail("NullPointerException Expected");
	}
}
