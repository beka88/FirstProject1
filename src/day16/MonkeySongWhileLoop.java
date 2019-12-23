package day16;

class MonkeySongWhileLoop {
    public static void main(String[] args) {
        int count = 5;
        String word = "little monkeys jumping on the bed,\n" +
                "One fell down and bumped his head,\n" +
                "Mama called the doctor and the doctor said,\n" +
                "No more monkeys jumping on the bed!";
        while (count >= 1) {
            System.out.println(count + " " + word);
            --count;
        }
    }
}
