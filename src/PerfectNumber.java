import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PerfectNumber {

	public static Set<Integer> divisors(int n){
		Set<Integer> set = new HashSet<Integer>();
		for(int i=1; i<n; i++){
			if(n%i == 0){
				set.add(i);
			}
		}
		return set;
	}
	public enum STATE {
		DEFICIENT, ABUNDANT, PERFECT
	}
	
	public static STATE process(int n){
		if(n == 1) return STATE.DEFICIENT;
		Set<Integer> set = new HashSet<Integer>();
		set = divisors(n);
		int sum =0;
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()){
			sum += (int)iterator.next();
		}
		sum=sum-n;
		if(sum<n) return STATE.DEFICIENT;
		if(sum == n) return STATE.PERFECT;
		return STATE.ABUNDANT;
	}
}
	
	
	