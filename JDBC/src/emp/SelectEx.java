package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            // 1.드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            // 2. 연결 문자열 작성
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String Password = "TIGER";
            // 3. connection 얻기
            con = DriverManager.getConnection(url, user, Password);

            // 4. connection 을 통해서 실행하고자 하는 sql 구문 전송
            String sql = "SELECT * FROM emp WHERE empno=7369";

            pstmt = con.prepareStatement(sql);

            // 5. 전송된 sql 구문 실행
            rs = pstmt.executeQuery();

            // 6. 결과값이 담긴 rs에서 하나씩 조회
            if (rs.next()) {
                // number => getInt() / varchar2 => getString() / date => getDate()
                // () 안에는 컬럼 번호 or 컬럼명 가능
                System.out.println("empno : " + rs.getInt(1));
                System.out.println("enqme : " + rs.getString(2));
                System.out.println("job : " + rs.getString(3));
                System.out.println("mgr : " + rs.getInt(4));
                System.out.println("hiredate : " + rs.getDate(5));
                System.out.println("sal : " + rs.getInt(6));
                System.out.println("comm : " + rs.getInt(7));
                System.out.println("daptno : " + rs.getInt(8));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                pstmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
