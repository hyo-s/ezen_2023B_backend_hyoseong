package day15;  // PACKAGE NAME

// Vehicle 상속
public class Taxi extends Vehicle { // CLASS START

    // 부모 타입으로부터 오버라이딩 / 재정의
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }

}   // CLASS END
