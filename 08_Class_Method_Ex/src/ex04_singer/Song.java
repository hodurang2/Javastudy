package ex04_singer;

public class Song {
  
  // 필드
  private String title;
  private String genre;
  private double playTime;

  // Setter 메소드
  public void setTitle(String title) {
    this.title = title;
  }
  
  public void setGenre(String genre) {
    this.genre = genre;
  }
  
  public void setPlayTime(double playTime) {
    this.playTime = playTime;
  }
  
  // Getter 메소드
  public String getTitle() {
    return title;
  }
  
  public String getGenre() {
    return genre;
  }
  
  public double getPlaytime() {
    return playTime;
  }
  
  // 필드 값들 한번에 출력해주는 메소드
  public void info() {
    System.out.println("제목: " + getTitle() + ", 장르: " + getGenre() + ", 재생시간: "+ getPlaytime() + "분");
  }
  
}
