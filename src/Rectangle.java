import java.text.DecimalFormat;
public class Rectangle { //make public for CS A

    //instance variables
    private double width;
    private double height;
    private double area;
    private double perimeter;


    //default constructor (make public for CS A)
public Rectangle(){
    width = 1.0;
    height = 1.0;
}

    //overloaded constructor (with parameters)

    /**
     * Creates a rect  with w and h
     * @param w width of rect
     * @param h height of rect
     */
    public Rectangle(double w, double h){
    width = w;
    height = h;

}

public Rectangle(double width){
    this.width = width;
}


    //accessors

    /**
     *
     * @return the width of rect
     */
    public double getWidth(){
    return width;
}
public double getHeight(){
        return height;
}

public double getPerimeter(){
        return perimeter;
}


    //mutators

    /**
     * allows change via user
     * @param newWidth the width to set the rect
     */
    public void setWidth(double newWidth){

        width  = newWidth;
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }



    //other methods
public double calcArea(){
        return height*width;
}
public double calcPeri(){
        perimeter = (height * 2 ) + (width * 2));
        return perimeter;
}

    //toString method

}

/*public class superHero(){
    private String name;
    private Power power;

    public superHero(String n, Power p)
        name = n;
        power = new Power(p.getName(), p.getStrength());
        //use getters as to get string and name for the new power
    }
public class Power() {
        private String name;
        private int strength;


        public Power() {
            name = "";
            strength = 0;
        }

        public class Power(String name, int strength) {
            name =  s;
            strength = str;
            int str;
            int str = 15;
            String s = "Dash"
        }
 }
