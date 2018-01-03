import java.util.*;
public class Union {
	
	public static <T> Vector<T> union(Vector<T> a, Vector<T> b)
	{
		Set<T> set = new HashSet<T>();
		
		if(a.size() == 0 || b.size() == 0) {
			throw new NullPointerException("Union.union");
		}
		set.addAll(a);
		set.addAll(b);
		
		return new Vector<T>(set);
	}
	
	/**
	* @return New Set (different from a and b) that contains the
	* union set of a and b
	* @param a Set of elements. It can contain the null element. It can’t
	* contain repeated elements
	* @param b Set of elements. It can contain the null element. It can’t
	* contain repeated elements
	* @throws NullPointerException If a or b is null
	*/
	public static Set unionSet (Set a, Set b)
	{
		if(a.isEmpty() || b.isEmpty()) {
			throw new NullPointerException("Union.unionSet");
		}
		a.addAll(b);
		return a;
	}
	
	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<Integer>();
		Vector<Integer> vector2 = new Vector<Integer>();
		
		//Vector<Integer> vectorUnion = union(vector1,vector2);
		
		//Prueba del Set
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		Set<Integer> setUnion = unionSet(s1,s2);
		System.out.println(setUnion.isEmpty());
	}
}
