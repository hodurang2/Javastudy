package ex04_singer;


public class Singer {
  
  private String name;
  private Song titleSong;
  

  public void setName(String name) {
    this.name = name;
  }
  
  // Setter 메소드
  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }
  
  public void info() {
    System.out.println("이름: " + name);
    titleSong.info();
  }
  
}
