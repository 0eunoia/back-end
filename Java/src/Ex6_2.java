public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); // Tv t1; t1 = new Tv(); 한 문장으로 가능
        Tv t2 = new Tv();
        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1 채널은 " + t1.channel + "입니다. ");

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");
    }
}
