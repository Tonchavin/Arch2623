package ModelElements;

import Stuff.Angle3D;
import Stuff.Point3D;

/**
 * класс камер
 */
public class Camera {
    
    public Point3D location;
    public Angle3D angle;

    /**
     * поворот камеры на угол
     *
     * @param angleAction
     */
    public void Rotate(Angle3D angleAction) {
    }

    /**
     * перемещение камеры к точке
     * @param pointAction
     */
    public void Move(Point3D pointAction){
    }
}
