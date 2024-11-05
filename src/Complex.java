public class Complex {
    private double x; // вещественная часть
    private double y; // мнимая часть

    // Конструктор по умолчанию (0 + 0i)
    public Complex() {
        this.x = 0;
        this.y = 0;
    }

    // Перегруженный конструктор, инициализирующий комплексное число (x + yi)
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттер для вещественной части
    public double getX() {
        return x;
    }

    // Сеттер для вещественной части
    public void setX(double x) {
        this.x = x;
    }

    // Геттер для мнимой части
    public double getY() {
        return y;
    }

    // Сеттер для мнимой части
    public void setY(double y) {
        this.y = y;
    }

    // Метод для возвращения комплексного числа как строки
    public String str() {
        return x + "+" + y + "i";
    }

    // Метод для сложения комплексных чисел
    public Complex add(Complex other) {
        return new Complex(this.x + other.x, this.y + other.y);
    }

    // Метод для вычитания комплексных чисел
    public Complex sub(Complex other) {
        return new Complex(this.x - other.x, this.y - other.y);
    }

    // Метод для умножения комплексных чисел
    public Complex mul(Complex other) {
        double real = this.x * other.x - this.y * other.y;
        double imaginary = this.x * other.y + this.y * other.x;
        return new Complex(real, imaginary);
    }

    // Метод для деления комплексных чисел
    public Complex div(Complex other) {
        double denominator = other.x * other.x + other.y * other.y;
        double real = (this.x * other.x + this.y * other.y) / denominator;
        double imaginary = (this.y * other.x - this.x * other.y) / denominator;
        return new Complex(real, imaginary);
    }

    // Метод для вычисления модуля комплексного числа
    public double modulus() {
        return Math.sqrt(x * x + y * y);
    }

    // Метод для сравнения двух комплексных чисел
    public boolean equals(Complex other) {
        return this.x == other.x && this.y == other.y;
    }

}

