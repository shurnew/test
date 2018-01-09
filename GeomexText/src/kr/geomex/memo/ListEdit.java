package kr.geomex.memo;

public interface ListEdit extends ListClear {
	final int MIN_INDEX=0;
	
	public abstract void add(String s);
	public abstract void delete(int i)throws Exception;
	public abstract void print(int i);
	public abstract void printAll();
	public abstract String get(int i);
}
