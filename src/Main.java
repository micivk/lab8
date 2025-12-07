public class Main {
    public static void main(String[] args) {

        System.out.println("Circle");
        double radius = 10.0;
        Circle circle = new Circle(radius);

        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circumference: %.2f%n", circle.calculateCircumference());



        System.out.println("\nSphere");
        Sphere sphere = new Sphere(radius);

        System.out.println("Radius: " + sphere.getRadius());
        System.out.printf("Volume: %.2f%n", sphere.calculateVolume());
        System.out.printf("Surface Area: %.2f%n", sphere.calculateSurfaceArea());



        System.out.println("\nmatrix");


        System.out.println("Generated Matrix A (3x3):");
        Matrix matrixA = new Matrix(3, 3);
        matrixA.print();


        System.out.println("\nTranspose of Matrix A:");
        Matrix transposedA = matrixA.transpose();
        transposedA.print();


        System.out.println("\nSpiral Order of Matrix A:");
        matrixA.printSpiral();
        System.out.println();


        System.out.println("\n4. Matrix Multiplication:");

        System.out.println("Generated Matrix B (3x3):");
        Matrix matrixB = new Matrix(3, 3);
        matrixB.print();

        System.out.println("\nResult of A * B:");
        Matrix product = matrixA.multiply(matrixB);

        if (product != null) {
            product.print();
        } else {
            System.out.println("Multiplication not possible.");
        }
    }

    }


