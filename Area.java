package operator;

public class Area {
    int rectLength;
    int rectBreadth;

    void setDimension(int length, int breadth) {
        rectLength = length;
        rectBreadth = breadth;
    }

    int getArea()
    {
        return rectLength*rectBreadth;
    }

    public static void main(String[] args) {
        Area area=new Area();
        area.setDimension(10,15);
        System.out.println("area  of rectangle is = "+area.getArea());
    }
}