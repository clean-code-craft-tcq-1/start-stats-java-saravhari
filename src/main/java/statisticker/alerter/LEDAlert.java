package statisticker.alerter;

public class LEDAlert implements IAlerter {
	public boolean ledGlows = false;

	@Override
	public void alert() {
		ledGlows = true;
	}

}
