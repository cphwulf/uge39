package yatzygame;
public class Die {
	private int eyeShown;
	public Die() {
		 rollDie();
	}
	public void rollDie() {
		eyeShown = (int)(Math.random()*6)+1;
	}
	public int getValue() {
		return this.eyeShown;
	}
}
