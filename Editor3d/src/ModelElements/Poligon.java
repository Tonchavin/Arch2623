package ModelElements;

import java.util.ArrayList;
import java.util.List;

import Stuff.Point3D;

public class Poligon {
    public List<Point3D> points = new ArrayList<>();
    
    /**
     * конструктор
     *
     * @param point
     */
    public Poligon(Point3D point)
    {
        points.add(point);
    }
}
