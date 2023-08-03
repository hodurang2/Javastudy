package ex03_InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MainWrapper {
  
  /*
   * java.io.InputStream 클래스
   * 1. 바이트 기반의 입력스트림이다.
   * 2. 입력 단위
   *    1) int
   *    2) byte[]
   */

  
  public static void ex01() {
    
    // 디렉토리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");
    
    // 파일 입력스트림 선언
    FileInputStream fin = null;
    
    try {
      
      // 파일입력스트림 생성 (반드시 예외 처리 필요, 파일이 없으면 예외 발생
      fin = new FileInputStream(file);
      
      // 입력된 데이터 저장 변수
      int c = 0;
      
      // read() 메소드
      // 1. 1개 데이터를 읽는다.
      // 2. 읽은 내용이 없으면 -1을 반환한다.
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();
      
      // 반복문 : 읽은 내용이 -1이 아니면 계속읽기.
      while((c = fin.read()) != -1) {
        sb.append((char)c);
      }
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex02() {
    
    // 바이트 기반 스트림은 원래 한글처리가 안 된다.
    
    //  디렉토리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex02.dat");
    
    // 파일 입력스트림 선언
    FileInputStream fin = null;
    
    try {
      
      // 파일입력스트림 생성 (반드시 예외 처리 필요, 파일이 없으면 예외 발생
      fin = new FileInputStream(file);
      
      // 입력된 데이터 저장 변수
      byte[] b = new byte[4]; // 임의로 크기 설정(최대 4바이트 입력 가능)
      
      // 실제로 읽은 바이트 수 저장 변수
      int readByte = 0;
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();
      
      // read(byte[]) 메소드
      // 1. 파라미터로 전달된 byte[] b에 읽은 내용을 저장
      // 2. 실제로 읽은 바이트 수를 반환한다. 
      // 3. 읽은 내용이 없으면 -1을 반환한다.
      
      // 반복문 : read()의 반환값이 -1이 아니면 계속읽기.
      while( (readByte = fin.read(b)) != -1 ) {
        sb.append(new String(b, 0, readByte));    //  배열 b의 인덱스 0부터 readByte개 데이터를 String변환.
      }
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fin != null) {
          fin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex03() {
    
    /*
     * java.io.BufferedInputStream 클래스
     * 2. 많은 데이터를 한 번에 입력받기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조스트림 이므로 메인 스트림과 함께 사용
     */
//  디렉토리를 File 객체로 만들기
    File dir = new File("C:/storage");
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex03.dat");
    
    // 버퍼 입력스트림 선언
    BufferedInputStream bin = null;
    
    try {
      
      // 파일입력스트림 생성 (반드시 예외 처리 필요, 파일이 없으면 예외 발생
      bin = new BufferedInputStream(new FileInputStream(file));
      
      // 입력된 데이터 저장 변수
      byte[] b = new byte[16 ]; // 임의로 크기 설정(최대 4바이트 입력 가능)
      
      // 실제로 읽은 바이트 수 저장 변수
      int readByte = 0;
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder 생성
      StringBuilder sb = new StringBuilder();
      
      // read(byte[]) 메소드
      // 1. 파라미터로 전달된 byte[] b에 읽은 내용을 저장
      // 2. 실제로 읽은 바이트 수를 반환한다. 
      // 3. 읽은 내용이 없으면 -1을 반환한다.
      
      // 반복문 : read()의 반환값이 -1이 아니면 계속읽기.
      while( (readByte = bin.read(b)) != -1 ) {
        sb.append(new String(b, 0, readByte));    //  배열 b의 인덱스 0부터 readByte개 데이터를 String변환.
        System.out.println(readByte);
      }
      System.out.println(sb.toString());
      
    } catch(IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(bin != null) {
          bin.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
    ex03();
    
    
  }

}