package statisticker.statschecker;

import java.util.Collections;
import java.util.List;

import statisticker.alerter.IAlerter;

public class StatsChecker {
	public float maxThreshold;
	public IAlerter iAlerter[];

	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.maxThreshold = maxThreshold;
		this.iAlerter = alerters;
	}

	public void checkAndAlert(List<Float> numberList) {

		if (!numberList.isEmpty() && !numberList.contains(Float.NaN)) {
			Collections.sort(numberList);
			if (maxThreshold < numberList.get(numberList.size() - 1)) {
				for (IAlerter iAlerter : this.iAlerter) {
					iAlerter.alert();
				}
			}

		}
	}

}
