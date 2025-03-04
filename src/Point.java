public class Point {
    private double x;
    private double y;

    public String toString()
    {
        return "x= "+x+" y= "+y;
    }

    public String toSvg(){
        return "<svg height=\"500\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"45\" cx=\""+x+"\" cy=\""+y+"\" fill=\"red\" />\n" +
                "</svg>";
    }

    public void translate(double dx, double dy){
        x+=dx;
        y+=dy;
    }

    public Point translated(double dx, double dy){
        Point trPoint = new Point();
        trPoint.x= x+dx;
        trPoint.y= y+dy;
        return trPoint;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}