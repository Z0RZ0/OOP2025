public class Main {
    public static void main(String[] args) {

       Point p1 = new Point();
       p1.x=5;
       p1.y=6;

       p1.translate(400,200);

       System.out.println(p1.toSvg());

    }
}