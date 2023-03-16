package inter;

public class DaoEx {
	public static void main(String[] args) {
		//OracleDao oracle = new OracleDao();
		DataAccessObject oracle = new OracleDao();	//왼쪽 부모 오른쪽 자식
		dbWork(oracle);
		
//		Mysql mysql = new Mysql();	//위에 밑에 두개 다 사용 가능
		DataAccessObject mysql = new Mysql();
		dbWork(mysql);
//		dbWork2(oracle);
	}

	static void dbWork(DataAccessObject dao) {	//부모가 들어오면 됨. - 클래스/추상클래스/인터페이스 셋 중 하나 들어옴
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
//		static void dbWork2(OracleDao oracle) {	//이렇게 여러개 만들 필요없이
//		oracle.select();
//		oracle.insert();
//		oracle.update();
//		oracle.delete();
//
//	}
	
	
}
