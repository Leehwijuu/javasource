package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEx3 {
    public static void main(String[] args) {
        // SelectEx ==> try-with-resources 형태로 변경
        // finally 자원 닫기 자동으로 처리

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "scott";
        String Password = "TIGER";

        String sql = "SELECT * FROM emp WHERE empno=7369";
        try (Connection con = DriverManager.getConnection(url, user, Password);
                PreparedStatement pstmt = con.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery()) {

            // 1.드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");

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
        }

    }
}
