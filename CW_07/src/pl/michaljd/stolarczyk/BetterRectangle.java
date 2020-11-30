package pl.michaljd.stolarczyk;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
        this.setLocation(x,y);
        this.setSize(width,height);
    }

    public double getPerimeter(){ return 2*(this.height+this.width); }

    public double getArea(){ return this.height+this.width; }
}
