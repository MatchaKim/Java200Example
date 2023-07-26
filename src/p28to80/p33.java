package p28to80;



public class p33 {

    public static class Geo{
        public double lati;
        public double longi;

        public void setLati(double lati) {
            this.lati = lati;
        }

        public void setLongi(double longi) {
            this.longi = longi;
        }
    }

    public static void main(String[] args) {
        double lati =35.5;
        double longi =23.2;
        Geo geo1 = new Geo();
        geo1.lati= lati;
        geo1.longi= longi;
        geo1.setLati(lati);
        geo1.setLongi(longi);
        System.out.println(geo1.lati + geo1.longi);
    }

//
//    이 코드는 Java에서 사용되는 방식으로 보이는데, 여기에서는 객체 geo1의 속성 lati와 longi를 두 가지 방법으로 설정하고 있습니다.
//
//    geo1.lati= lati;
//    geo1.longi= longi;
//
//    이 방식은 직접 접근 방식입니다. geo1 객체의 lati와 longi 필드에 직접 접근하여 값을 설정합니다. 이 방법을 사용하려면, lati와 longi 필드가 public 이거나 같은 클래스 또는 패키지 내에서 접근 가능한 범위에 있어야 합니다.
//
//     geo1.setLati(lati);
//     geo1.setLongi(longi);
//
//    이 방식은 메서드를 통한 접근 방식입니다. setLati와 setLongi 메서드를 호출하여 geo1 객체의 lati와 longi 값을 설정합니다. 이 방법을 사용하면, lati와 longi 필드의 접근 수준이 private이더라도, 이들에 대한 setter 메서드가 public이면 접근할 수 있습니다.
//
//    이 두 가지 접근 방식의 가장 큰 차이점은 encapsulation, 즉 캡슐화입니다. 직접 접근 방식은 객체의 내부 상태를 직접 변경할 수 있으므로 캡슐화를 위반할 수 있습니다. 반면, 메서드를 통한 접근 방식은 캡슐화를 지원하므로 객체의 상태를 안전하게 변경할 수 있습니다. 이 방식을 사용하면, 필드의 값이 변경될 때 추가적인 로직(예: 유효성 검사)을 적용할 수 있습니다. 따라서 일반적으로는 메서드를 통한 접근 방식을 사용하는 것이 좋습니다.



}
