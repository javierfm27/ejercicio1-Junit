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
	
	public static void main(String[] args) {
		Vector<Integer> vector1 = new Vector<Integer>();
		Vector<Integer> vector2 = new Vector<Integer>();
		
		Vector<Integer> vectorUnion = union(vector1,vector2);
	}
}
