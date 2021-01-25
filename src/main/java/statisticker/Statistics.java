package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {
	public static class Stats {
		public Float average;
		public Float min;
		public Float max;

		public Stats(Float average, Float min, Float max) {
			this.average = average;
			this.min = min;
			this.max = max;
		}
	}

	public static Stats getStatistics(List<Float> numbers) {
		// Computation Implementation

		Float total = 0.0F;

		if (numbers == null || numbers.isEmpty()) {
			Stats s = new Stats(Float.NaN, Float.NaN, Float.NaN);
			return s;
		}

		Collections.sort(numbers);

		for (Float num : numbers) {
			total += num;
		}

		Float average = (total / numbers.size());
		Stats s = new Stats(average, numbers.get(0), numbers.get(numbers.size() - 1));

		return s;
	}
}
