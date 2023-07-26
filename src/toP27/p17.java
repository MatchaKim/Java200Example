package toP27;

class JLocation{
    public double lat;
    public double lng;
}

public class p17 {
    public static void main(String[] args) {
        double lati = 37.2;
        double longi = 24.22232;
        JLocation jLocation = new JLocation();
        jLocation.lat= lati;
        jLocation.lng= longi;
        JLocation newLoc = jLocation; //대입
        System.out.println(newLoc.toString());
    }

//한 클래스는 한 파일에 저장하며 클래스와 파일의 이름이 동일해야 한다.
//만약 한 파일에 클래스를 두개 이상 선언할 때는 파일 이름과 동일한 클래스에만 public을 붙일 수 있다.

}
