package statisticker.alerter;

public class EmailAlert implements IAlerter {
	public boolean emailSent = false;

	@Override
	public void alert() {
		emailSent = true;
	}
}
