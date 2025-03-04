public class Main {
    public static void main(String[] args) {

       Point p1 = new Point();
       p1.setX(5);
       p1.setY(6);

       Point p2 = new Point(7, 8);
       Point p3 = new Point(p1);
       Point p4 = new Point(p2);


//       p1.translate(400,200);
//       Point p2 = p1.translated(-400, -200);
//        System.out.println(p1.toSvg());
//        System.out.println();
//        System.out.println(p2.toSvg());

        Segment s1 = new Segment(p1, p2);
        System.out.println(s1);
        Segment s2 = new Segment(p3, p4);

        p1.setX(15);
        p1.setY(12);
        p2.setX(15);
        p2.setY(8);
    }
}