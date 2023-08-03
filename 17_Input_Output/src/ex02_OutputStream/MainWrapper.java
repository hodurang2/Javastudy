package ex02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class MainWrapper {
  
  /*
   * java.io.OutputStream 클래스
   * 1. 바이트 기반의 출력 스트림이다. 스트림이라는건 도로라고 생각하면 좋음 (출력할 때 사용하는 통로)
   * 2. 출력 단위
   *    1) int
   *    2) byte[]
   */
  
  public static void ex01() {
    
    // 디렉토리를 File객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File객체로 만들기
    File file = new File(dir, "ex01.dat"); 
    // .dat : 우리가 다를 파일
    
    // 파일로 데이터 내보낼 때 사용하는 스트림 : FileOutputStream이다. 이름이 매우 직관적
    // 출력스트림 선언
    FileOutputStream fout = null;
    // 출력스트림 생성
    try {
      fout = new FileOutputStream(file); // 파일객체를 목적지로 전달하는 메소드
      // 오류나는 이유는 생성자로부터 예외 처리를 하기 때문. -> 그래서 try오픈 후 사용
      
      int c = 'A'; // 바이트 기반의 출력스트림은 int 아니면 byte[]이기 때문에 'A'는 char 이지만 int 사용;
      
      String s = "pple";
      
      // 스트링을 바이트 배열로 바꿔주는 메소드가 3개 있음. getBytes.
      // 3가지 방식이 있는데 파라미터가 없는건 인코딩할 필요가 없는 것
      // 2, 3은 charset을 전달하게 되어있으므로 인코딩이 필요한것
      
      byte[] b = s.getBytes();
      
      fout.write(c);
      fout.write(b);
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fout != null) {
          fout.close(); // 예외 발생 여부와 상관없이 fileoutstream은 close를 해주어야함
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    } 
    
    System.out.println(file.getPath() + "파일크기" + file.length() + "바이트");
  }
  
  public static void ex02() {
 // 디렉토리를 File객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File객체로 만들기
    File file = new File(dir, "ex02.dat"); 
    // .dat : 우리가 다를 파일
    
    // 파일로 데이터 내보낼 때 사용하는 스트림 : FileOutputStream이다. 이름이 매우 직관적
    // 출력스트림 선언
    FileOutputStream fout = null;
    // 출력스트림 생성
    try {
      fout = new FileOutputStream(file); // 파일객체를 목적지로 전달하는 메소드
      
      
      String s = "안녕하세요";
      byte[] b = s.getBytes("UTF-8");
      
      
      fout.write(b);
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fout != null) {
          fout.close(); 
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    } 
    
    System.out.println(file.getPath() + "파일크기" + file.length() + "바이트");
  }
  
  public static void ex03() {
    
    /*
     * java.io.BufferedOutputStream 클래스
     * 1. 내부 버퍼를 가지고 있는 출력 스트림
     * 2. 만은 데이터를 한 번에 출력하기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    // 디렉토리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }

    //파일 File 객체 선언 & 생성
    File file = new File(dir, "ex03.dat");
    
    // 버퍼출력스트림 선언
    BufferedOutputStream bout = null;
    
   // 파일 출력스트림 선언
//    FileOutputStream fout = null;
    
    try {
      
    
    // 버퍼출력스트림 생성
    bout = new BufferedOutputStream(new FileOutputStream(file));
    
    // 출력할 데이터(파일로 보낼 데이터)
    String s1 = "안녕하세요";
    String s2 = "반갑습니다";
    int c = '\n';
    
    // 출력(파일로 데이터 보내기)
    bout.write(s1.getBytes("UTF-8"));
    bout.write(c);
    bout.write(s2.getBytes(StandardCharsets.UTF_8)); // getBytes("UTF-8)과 동일
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bout != null) {
          bout.close();  // 출력스트림은 반드시 닫아줘야함 (반드시 예외처리가 필요한 코드
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println(file.getPath() + "파일크기" + file.length() + "바이트");
  }

  public static void ex04() {
    
    /*
     * java.io.DataOutputStream 클래스
     * 1. int, double, String 등의 변수 그대로 출력하는 출력 스트림이다.
     * 2. 보조 스트림이므로 메인스트림과 함께 사용한다.
     */
    
    // 디렉토리를 File객체로 생성
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File객체로 생성
    File file = new File(dir, "ex04.dat");
    DataOutputStream dout = null;
    try {
      
      // 데이터출력스트림 생성 (반드시 예외 처리가 필요한 코드)
      dout = new DataOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터(파일로 보낼 데이터)
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산대학교";
      
      // 출력(파일로 데이터 보내기)
      dout.writeChars(name);
      dout.writeInt(age);
      dout.writeDouble(height);
      dout.writeUTF(school);
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(dout != null) {
          dout.close();  // 출력스트림은 반드시 닫아줘야함 (반드시 예외처리가 필요한 코드
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println(file.getPath() + "파일크기" + file.length() + "바이트");
    
  }
  
  public static void ex05() {
    
    /*
     * java.io.ObjectOutputStream 클래스
     * 1. 객체를 그대로 출력하는 출력스트림이다. -> 객체를 바로보내는게 안되므로 직렬화 과정을 거쳐서 객체를 내보낸다.
     * 2. 직렬화(Serializable)된 객체를 보낼 수 있다.
     */
    
    // 디렉토리를 File객체로 생성
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File객체로 생성
    File file = new File(dir, "ex05.dat");
    DataOutputStream dout = null;
    
    // 객체출력스트림 선언
    ObjectOutputStream oout = null;
    
    try {
      
      // 객체출력스트림생성( 반드시 예외처리가 필요한 코드)
      oout = new ObjectOutputStream(new FileOutputStream(file));
      
      // 출력할 데이터(파일로 보낼 데이터)
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산대학교";
      Student student = new Student(name, age, height, school);
      
      // 출력(파일로 데이터 보내기)
      oout.writeObject(student);
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(dout != null) {
          dout.close();  // 출력스트림은 반드시 닫아줘야함 (반드시 예외처리가 필요한 코드
        }
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    System.out.println(file.getPath() + "파일크기" + file.length() + "바이트");
  }
  
  public static void main(String[] args) {
    
    ex01();
    ex02();
    ex03();
    ex04();
    ex05();
    
    
  }

}
