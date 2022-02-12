package mark.nestedClasses;

class Math {
    static int add(int x, int y) {
        return new Addition(x, y).calc(x, y);
    }

    static int multi(int x, int y) {
        return new Multiplication(x, y).calc(x, y);
    }

    static int div(int x, int y) {
        return new Division(x, y).calc(x, y);
    }

    static int sub(int x, int y) {
        return new Subtraction(x, y).calc(x, y);
    }

    static class Addition {
        int x;
        int y;

        Addition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int calc(int x, int y) {
            return x + y;
        }

    }

    static class Multiplication {
        int x;
        int y;

        Multiplication(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int calc(int x, int y) {
            return x * y;
        }

    }

    static class Division {
        int x;
        int y;

        Division(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int calc(int x, int y) {
            if (y != 0)
                return x / y;
            else
                return 0;
        }

    }

    static class Subtraction {
        int x;
        int y;

        Subtraction(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private int calc(int x, int y) {
            return x - y;
        }

    }
}

public class StaticNestedClassExample {
    public static void main(String[] args) {
        int resAdd = Math.add(2, 3);
        int resMulti = Math.multi(4, 1);
        int resDiv = Math.div(9, 3);
        int resSub = Math.sub(2, 2);

        System.out.println("resAdd = " + resAdd);
        System.out.println("resMulti = " + resMulti);
        System.out.println("resDiv = " + resDiv);
        System.out.println("resSub = " + resSub);
    }
}
