package hijava.oop;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface TestInterface {
	public ResultSet select(String sql) throws SQLException;
	
	default void print(String str) {
		System.out.println(str);
	}

	int max(int i, int j);
	
	static void out(int ii) {
		System.out.println("ii=" + ii);
	}

}
