package kr.geomex.z.question;



public class Unit{
	
	Weapon w = null;
	
	public Unit(Weapon w) {
		
		this.w = w;
		this.w.attack();
	}
}
