public class Program {
    public static void main(String[] args) {
        
        Cube cube = new Cube(2);
        System.out.println(cube.getVolume());

        Sphere sphere = new Sphere(7);
        System.out.println(sphere.getVolume());

        Cylinder cylinder = new Cylinder(7,10);
        System.out.println(cylinder.getVolume());

    }
}


class Cylinder {
    double radius, height;
    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    double getVolume(){
        return Math.PI*radius*radius*height;
    }
}

class Sphere {
    double radius;
    Sphere(double radius){
        this.radius = radius;
    }
    double getVolume(){
        return 4*Math.PI*radius*radius*radius/3;
    }
}

class Cube {
    double side;
    Cube(double side){
        this.side = side;
    }
    double getVolume() {
        return side*side*side;
    }
}