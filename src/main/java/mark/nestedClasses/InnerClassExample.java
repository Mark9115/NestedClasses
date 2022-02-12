package mark.nestedClasses;

import java.util.Scanner;

public class InnerClassExample {

    public static void main(String[] args) {
        String pass = "";
        Person tom = new Person("Tom");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");

        while (true) {
            try {
                if (scanner.hasNext()) {
                    pass = scanner.nextLine();
                }
                tom.setPassword(pass);
                return;
            } catch (RuntimeException re) {
                System.out.println("Incorrect \nEnter password again: ");
            }
        }
    }
}

class Person {

    private final String name;
    Account account = new Account();

    Person(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        account.displayAccount(password);
    }


    private class Account {

        private boolean checkPassword(String pass) {
            String password = "qwerty";
            return password.equals(pass);
        }

        private void displayAccount(String pass) {
            double count = 300;
            if (checkPassword(pass))
                System.out.printf("Account Login: %s \nCount: %s \n", Person.this.name, count);
            else
                throw new RuntimeException("Wrong pass");
        }
    }
}

