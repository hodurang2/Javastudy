package ex03_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import connect.DB_Connect;

public class MainWrapper {

  public static void main(String[] args) {

 // 수정할 사용자 번호(USER_NO) 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("수정할 USER_NO >>> ");
    int user_no = sc.nextInt();
    sc.nextLine();
    System.out.print("수정할 USER_NAME >>> ");
    String user_name = sc.nextLine();
    sc.close();
    
    // Connection 객체 선언
    Connection con = null;
    
    // PreparedStatement 객체 선언
    PreparedStatement ps = null;
    
    // ResultSet 객체 선언 (검색 결과)
    ResultSet rs = null;
    
    try {
      
      
      // Connection 객체 생성 (DB_Connect 클래스의 getConnection 메소드로부터 받아오기)
      con = DB_Connect.getConnection();
      
      // 쿼리문
      String sql = "";
      sql += "UPDATE USER_T";
      sql += "   SET USER_NAME = ?";
      sql += " WHERE USER_NO = ?";
      
      // PrepareStatement 객체 생성
      ps = con.prepareStatement(sql);
      
      // 쿼리문에 변수 넣기
      ps.setString(1, user_name);  // 1번째 물음표에 user_name 넣기
      ps.setInt(2, user_no);  // 1번째 물음표에 user_no 넣기
      
      // 쿼리문 실행
      rs = ps.executeQuery(); 
      
      // 쿼리문 실행 : insert 된 행의 개수가 반환된다.
      int insertResult = ps.executeUpdate();
      
      // 결과
      System.out.println(insertResult + "개의 행이 수정되었습니다.");
      
    
    }catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      } catch (SQLException e) {
      e.printStackTrace();
      }
    }
  }
}