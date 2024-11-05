public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(1, 2);

        System.out.println("c1: " + c1.str());
        System.out.println("c2: " + c2.str());

        Complex sum = c1.add(c2);
        System.out.println("Сумма: " + sum.str());

        Complex difference = c1.sub(c2);
        System.out.println("Разность: " + difference.str());

        Complex product = c1.mul(c2);
        System.out.println("Произведение: " + product.str());

        Complex quotient = c1.div(c2);
        System.out.println("Частное: " + quotient.str());

        System.out.println("Модуль c1: " + c1.modulus());
        System.out.println("Модуль c2: " + c2.modulus());

        System.out.println("c1 и c2 равны? " + c1.equals(c2));
        }
    }
