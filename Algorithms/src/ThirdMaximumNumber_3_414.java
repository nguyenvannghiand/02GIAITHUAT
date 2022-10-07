import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber_3_414 {

	public static int thirdMax(int[] nums) {
		Set<Integer> seenMaximums = new HashSet<>();
		for (Integer value : nums) {
			seenMaximums.add(value);
			if (seenMaximums.size() > 3) {
				seenMaximums.remove(Collections.min(seenMaximums));
			}
		}
		return seenMaximums.size() == 3 ? Collections.min(seenMaximums) : Collections.max(seenMaximums);
	}

	public static void main(String[] args) {
		int[] a = {2, 2, 3, 1};
		System.out.println(thirdMax(a));

	}
}
