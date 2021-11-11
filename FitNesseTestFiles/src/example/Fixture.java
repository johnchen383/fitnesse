package example;
import fit.ColumnFixture;

public class Fixture extends ColumnFixture {
	public int x1;
	public int x2;
	
	public int addTwo() {
		return Main.add(x2, x1);
	}
}
