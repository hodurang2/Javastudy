package ex07_TourGuide;

public class MaintWrapper {

  public static void main(String[] args) {

    
    TourGuide guide1 = new TourGuide();     // TourGuide 타입 객체 guide1 생성
//    Tour tour = new HawaiiTour();
//    guide1.setTour(tour);
    guide1.setTour(new HawaiiTour());       // Tour tour = new HawaiiTour(); -> guide1.setTour(tour)를 한 줄 표현
    guide1.sightseeing();
    guide1.leisure();
    guide1.meal();
    
    TourGuide guide2 = new TourGuide();
    guide2.setTour(new JapanTour());
    guide2.sightseeing();
    guide2.leisure();
    guide2.meal();
    
    
  }

}
