class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(Vector other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector subtract(Vector other) {
        double newX = this.x - other.x;
        double newY = this.y - other.y;
        double newZ = this.z - other.z;
        return new Vector(newX, newY, newZ);
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
}

public class vector {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        Vector sum = vector1.add(vector2);
        System.out.print("Vector Addition: ");
        sum.display();

        Vector difference = vector1.subtract(vector2);
        System.out.print("Vector Subtraction: ");
        difference.display();
    }
}
