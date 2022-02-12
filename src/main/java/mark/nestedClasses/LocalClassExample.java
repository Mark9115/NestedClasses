package mark.nestedClasses;

public class LocalClassExample {

    public static void main(String[] args) {
        String newString = WorkWithStrings.reverseString("ANDERSEN");
        System.out.println(newString);
    }
}

class WorkWithStrings {
    static String reverseString(String startedString) {

        class Reversing {
            private String reverseString() {
                StringBuilder nextString = new StringBuilder();
                for (int i = startedString.length() - 1, j = 0; i >= 0; i--, j++) {
                    nextString.append(startedString.charAt(i));
                }

                return String.valueOf(nextString);
            }
        }

        Reversing reversing = new Reversing();
        return reversing.reverseString();
    }
}


