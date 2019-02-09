package hijava.oop;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestImpl implements TestInterface{

	@Override
	public int max(int i, int j) {
		int m = i > j ? i : j;
		print("max=" + m);
		return m;
	}

	@Override
	public ResultSet select(String sql) throws SQLException {
		return null;
	}

}
