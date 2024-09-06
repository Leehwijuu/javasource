package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {
    public static void main(String[] args) {

        Connection con = null;
        try {
            // 오라클 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

            // 2. url. user, Password
            // localhost
            // DB 서버가 설치된 주소를 작성
            // 1521 : port 번호(오라클 서버의 기본 포트 번호)
            // xe : 오라클 서버의 인스턴스 이름
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String Password = "TIGER";

            con = DriverManager.getConnection(url, user, Password);

            System.out.println("연결되었습니다");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
