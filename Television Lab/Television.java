// this whole class models a television
public class Television {
	
	// make of the tv
	private final String MANUFACTURER;
	// screen size of tv
	private final int SCREEN_SIZE;
	// show whether tv is on or off
	private boolean powerOn;
	// shows what channel tv is on
	private int channel;
	// volume set on the tv
	private int volume;
	
	/**
	 * Constructor that when started the tv is set to off, volume 20 and channel 2, with tv brand and size
	 * @param brand - make of tv
	 * @param size - size of tv
	 */
	public Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		this.powerOn = false;
		this.channel = 2;
		this.volume = 20;
	}
	
	// sets channel for tv
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	// Used to turn on tv if its off
	public void power() {
		powerOn =! powerOn;
	}
	
	// increase tv volume by 1
	public void increaseVolume() {
		this.volume++;
	}
	
	//decrease tv volume by 1
	public void decreaseVolume() {
		this.volume--;
	}
	
	/**
	 * gets channel the tv is set on
	 * @return the channel
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * gets the volume of tv
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}
	
	/**
	 * gets the make of the tv
	 * @return manufacturer of the tv
	 */
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * gets the screen size of tv
	 * @return the screen size of tv
	 */
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}
