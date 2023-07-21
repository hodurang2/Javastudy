package ex04_singer;

public class MainWrapper {
  public static void main(String[] args) {
    
    Song song = new Song();
    
    song.setTitle("은인");
    song.setGenre("발라드");
    song.setPlayTime(3.5);
    
    song.info(); // 제목: 은인, 장르: 발라드, 재생시간: 3.5분
    
    Singer singer = new Singer();
    
    singer.setName("버즈");
    singer.setTitleSong(song);
    
    singer.info();  // 이름: 버즈
                    // 제목: 은인, 장르: 발라드, 재생시간: 3.5분
  }
  
}
