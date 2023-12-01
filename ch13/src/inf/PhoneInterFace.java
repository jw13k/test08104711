package inf;

public abstract interface PhoneInterFace {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {
		System.out.println("***Phone***");
	}
}
