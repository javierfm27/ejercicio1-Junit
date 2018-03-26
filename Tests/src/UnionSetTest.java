import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class UnionSetTest {

	private Set<Integer> S1;
	private Set<Integer> S2;
	private Set<Integer> setUnion;
	
	@Before
	public void setUp()
	{
		this.S1 = new HashSet<Integer>();
		this.S2 = new HashSet<Integer>();
	}

	@Test
	public void testDuplicate()
	{
		S1.add(3);
		S1.add(3);
		assertEquals(1,S1.size());
	}
	
	@Test
	public void testUnionDuplicate()
	{
		List<Integer> lista1 = Arrays.asList(1,3,5,6,8,9,10);
		
		S1.addAll(lista1);
		S2.addAll(lista1);
		setUnion = Union.unionSet(S1,S2);
		assertEquals(setUnion.size(),S1.size());
	}
	
	@Test
	(expected = NullPointerException.class)
	public void elementosNulos()
	{
		try {
			setUnion = Union.unionSet(S1, S2);
		}catch(NullPointerException e) {
			return;
		}
		fail("NullPointerException Expected");
	}
	
	@Test
	public void numTest() {
		Set<Object> S3 = new HashSet<>();
		
		S1.add(1);
		S1.add(4);
		S2.add(5);
		S2.add(9);
		S3.add(1);
		S3.add(4);
		S3.add(5);
		S3.add(9);
		Set<Integer> unionVector = Union.unionSet(S1, S2);
		assertEquals(S3,unionVector);
	}

}

