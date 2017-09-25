/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeterareavolume;
import java.util.Scanner;
/**
 *
 * @author jaysa
 */
public class PerimeterAreaVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double perimeter;
        double area;
        double volume;
        int choice;
        int peri;
        int ar;
        int vo;
        double pi = 3.14159;
        Scanner entry = new Scanner(System.in);
        Scanner select = new Scanner(System.in);
        System.out.println("You want to find ______ ?");
        System.out.println("1.Perimeter");
        System.out.println("2.Area");
        System.out.println("3.Volume");
        
        choice = select.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Choose Shape");
                System.out.println("1.Square/Rectangle");
                System.out.println("2.Circle");
                System.out.println("3.Triangle");
                Scanner per_choice = new Scanner(System.in);
                peri = per_choice.nextInt();
                switch (peri) {
                    case 1:
                        Rectangle rect = new Rectangle();
                        System.out.println("Enter Length");
                        rect.length = entry.nextDouble();
                        System.out.println("Enter Breadth");
                        rect.breadth = entry.nextDouble();
                        perimeter = 2 * (rect.length + rect.breadth);
                        System.out.println("Perimeter = " + perimeter + " units");
                        break;
                    case 2:
                        Circle cir = new Circle();
                        System.out.println("Enter Radius");
                        cir.radius = entry.nextDouble();
                        perimeter = 2 * pi * cir.radius;
                        System.out.println("Perimeter = " + perimeter + " units");
                        break;
                    case 3:
                        Triangle tri = new Triangle();
                        System.out.println("Enter side one");
                        tri.side1 = entry.nextDouble();
                        System.out.println("Enter side two");
                        tri.side2 = entry.nextDouble();
                        System.out.println("Enter side three");
                        tri.side3 = entry.nextDouble();
                        perimeter = tri.side1 + tri.side2 + tri.side3;
                        System.out.println("Perimeter = " + perimeter + " units");
                        break;
                    default:
                        break;
                }   break;
            case 2:
                System.out.println("Choose Shape");
                System.out.println("1.Square/Rectangle");
                System.out.println("2.Circle");
                System.out.println("3.Triagle");
                Scanner are_choice = new Scanner(System.in);
                ar = are_choice.nextInt();
                switch (ar) {
                    case 1:
                        Rectangle rect = new Rectangle();
                        System.out.println("Enter Length");
                        rect.length = entry.nextDouble();
                        System.out.println("Enter Breadth");
                        rect.breadth = entry.nextDouble();
                        area = rect.length * rect.breadth;
                        System.out.println("Area = " + area + " sq. units");
                        break;
                    case 2:
                        Circle cir = new Circle();
                        System.out.println("Enter Radius");
                        cir.radius = entry.nextDouble();
                        area = pi * cir.radius * cir.radius;
                        System.out.println("Area = " + area + " sq. units");
                        break;
                    case 3:
                        Triangle tri = new Triangle();
                        System.out.println("Enter height");
                        tri.height = entry.nextDouble();
                        System.out.println("Enter base");
                        tri.base = entry.nextDouble();
                        area = 0.5 * (tri.height * tri.base);
                        System.out.println("Area = " + area + " sq. units");
                        break;
                    default:
                        break;
                }   break;
            case 3:
                System.out.println("Choose 3D shape");
                System.out.println("1.Cube/Cuboid");
                System.out.println("2.Sphere");
                System.out.println("3.Cylinder");
                System.out.println("4.Cone");
                Scanner v = new Scanner(System.in);
                vo = v.nextInt();
                switch (vo) {
                    case 1:
                        Cube cub = new Cube();
                        System.out.println("Enter length");
                        cub.length = entry.nextDouble();
                        System.out.println("Enter width");
                        cub.width = entry.nextDouble();
                        System.out.println("Enter height");
                        cub.height = entry.nextDouble();
                        volume = cub.length * cub.width * cub.height;
                        System.out.println("Volume = " + volume + " cub. units");
                        break;
                    case 2:
                        Sphere sph = new Sphere();
                        System.out.println("Enter radius");
                        sph.radius = entry.nextDouble();
                        volume = (4 * sph.radius * sph.radius * sph.radius * pi)/3;
                        System.out.println("Volume = " + volume + " cub. units");
                        break;
                    case 3:
                        Cylinder cyl = new Cylinder();
                        System.out.println("Enter radius");
                        cyl.radius = entry.nextDouble();
                        System.out.println("Enter height");
                        cyl.height = entry.nextDouble();
                        volume = (cyl.radius * cyl.radius * pi * cyl.height);
                        System.out.println("Volume = " + volume + " cub. units");
                        break;
                    case 4:
                        Cone con = new Cone();
                        System.out.println("Enter radius");
                        con.radius = entry.nextDouble();
                        System.out.println("Enter height");
                        con.height = entry.nextDouble();
                        volume = (pi * con.height * con.radius * con.radius) / 3;
                        System.out.println("Volume = " + volume + " cub. units");
                        break;
                    default:
                        break;
                }   break;
            default:
                break;
        }
        
    }
    
}
