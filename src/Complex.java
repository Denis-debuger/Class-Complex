public class Complex {
    private double x;
    private double y;


    public Complex() {
        this.x = 0;
        this.y = 0;
    }


    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }


    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }


    public void setY(double y) {
        this.y = y;
    }


    public String str() {
        return x + "+" + y + "i";
    }


    public Complex add(Complex other) {
        return new Complex(this.x + other.x, this.y + other.y);
    }


    public Complex sub(Complex other) {
        return new Complex(this.x - other.x, this.y - other.y);
    }


    public Complex mul(Complex other) {
        double real = this.x * other.x - this.y * other.y;
        double imaginary = this.x * other.y + this.y * other.x;
        return new Complex(real, imaginary);
    }


    public Complex div(Complex other) {
        double znamenatel = other.x * other.x + other.y * other.y;
        double real = (this.x * other.x + this.y * other.y) / znamenatel;
        double imaginary = (this.y * other.x - this.x * other.y) / znamenatel;
        return new Complex(real, imaginary);
    }


    public double modulus() {
        return Math.sqrt(x * x + y * y);
    }


    public boolean equals(Complex other) {
        return this.x == other.x && this.y == other.y;
    }

}

