package kr.geomex.memo;

public class Table {
	String memo = "";
	String time = "";

	public Table(String m, String t) {
		this.memo = m;
		this.time = t;
	}

	@Override
	public String toString() {

		return "[" + time + "] : " + memo;
	}
}
