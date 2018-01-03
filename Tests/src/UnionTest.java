import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
public class UnionTest {

	private Vector<Integer> V1;
	private Vector<Integer> V2;
	private Vector<Integer> vectorUnion;
	//Set up - Called before every test method
	@Before
	public void setUp() 
	{
		this.V1 = new Vector<Integer>();
		this.V2 = new Vector<Integer>();
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
	
	@Test
	public void testElementosRepetidos()
	{
		V1.add(1);
		V2.add(1);
		
		this.vectorUnion = Union.union(V1, V2);
		assertEquals(1,vectorUnion.size());
	}
	
	@Test
	public void oneVectorEmpty()
	{
		this.V2 = null;
		this.V1.add(1);
		try {
			this.vectorUnion = Union.union(V1, V2);
		}catch(NullPointerException e) {
			return;
		}
		fail("NullPointerException Expected");
	}
}
