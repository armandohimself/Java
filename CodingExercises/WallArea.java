package CodingExercises;

public class WallArea {
    private double width;
    private double height;

    public WallArea() {
        this.width = width;
        this.height = height;
    }

    public WallArea(double width, double height) {
        if (width < 0 ) width = 0;
        if (height < 0 ) height = 0;

        this.width = width;
        this.height = height;
    }
    
    //! Width
    public void setWidth(double width) {
        if (width < 0 ) width = 0;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    //! Height
    public void setHeight(double height) {
        if (height < 0 ) height = 0;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        WallArea wall = new WallArea(5,4);

        System.out.println("area= " + wall.getArea());
        
        wall.setHeight(-1.5);
        
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

}