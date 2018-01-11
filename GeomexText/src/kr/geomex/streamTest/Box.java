package kr.geomex.streamTest;
import java.io.Serializable;

public class Box  implements Serializable{
	int w;
	transient String h;
	int d;
	
	public Box(int w,String h,int d) {
		
		
		this.w=w;
		this.h=h;
		this.d=d;
	}
	public String getString() {
		
		return h;
	}
	@Override
	public String toString() {
		return w+h+d;
	}
	
}
