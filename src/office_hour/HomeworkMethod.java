package office_hour;

public class HomeworkMethod {
    public static void reversePrintMyOwnName() {
        String name = "Bermet";
        System.out.println("" + name.charAt(5) + name.charAt(4) + name.charAt(3) + name.charAt(2) + name.charAt(1) + name.charAt(0));
    }

    public static void reversePrintAnyName(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void printLastCharacterOfName(String name) {
        System.out.println(name.charAt(name.length() - 1));
    }

    public static void printFullNameInformation(String firstName, String lastname) {
        System.out.println("My first name is: " + firstName);
        System.out.println("My last name is: " + lastname);
    }

    public static void fullNameLength(String firstName, String lastname) {
        String fullName = firstName + lastname;
        System.out.println("My full name lengthis: " + fullName.length());
    }

    public static void compareNameCharacterCount(String name1, String name2) {
        if (name1.length() > name2.length()) {
            System.out.println("name1 is longer");
        } else if (name2.length() > name1.length()) {
            System.out.println("name2 is longer");
        } else {
            System.out.println("\" name 1 and name 2 same character count \" ");
        }
    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printZtoA() {
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAlphabetInRange(char beginning,char ending) {
        if (beginning < ending) {
            System.out.println("We need to increment from " + beginning + "till " + ending);
            for (char ichar = beginning; ichar <= ending; ichar++) {
                System.out.println(ichar + " ");
            }
            System.out.println();
        } else if (beginning > ending) {
            System.out.println("We need to decrement from " + beginning + "till " + ending);
            for (char ichar = beginning; ichar <= ending; ichar--) {
                System.out.println(ichar + " ");
            }
            }else{
                System.out.println("they are same characters");
            }
        }


        public static void main (String[]args){
            reversePrintMyOwnName();
            reversePrintAnyName("Ertai");
            printLastCharacterOfName("Bermet");
            printFullNameInformation("Bermet", "Kadyrova");
            fullNameLength("Bermet", "Kadyrova");
            compareNameCharacterCount("Bermet", "Kenzhebek");
            printAtoZ();
            printZtoA();
            printAlphabetInRange('a', 'f');
            printAlphabetInRange('g', 'b');

        }
    }