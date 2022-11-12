package zadacha4;

public class Brojach {
	public int x = 0;
	public int y = 0;
	public int  ZgolemuvanjeX(){
		x = x + 1;
		return x;
	}
	public int ZgolemuvanjeY() {
		y = y + 1;
		return y;
	}
	public void Reset() {
		x = 0;
		y = 0;
	}
}
