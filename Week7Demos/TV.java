
public class TV {
	public int channel;
	public int volumeLevel;
	public boolean on;

	public TV() {
		channel = 1;
		volumeLevel = 3;
		on = false;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void channelUp() {
		channel++;
	}

	public void channelDown() {

		channel--;
	}

	public void volumeUp() {
		volumeLevel++;
	}

	public void volumeDown() {
		if (volumeLevel > 1 && on == true) {
			volumeLevel--;
		}
	}
	
	public void setChannel(int newChannel) {
		//complete for practice
	}
}
