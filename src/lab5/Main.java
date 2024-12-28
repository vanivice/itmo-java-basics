package lab5;

public class Main {
    public static void main(String[] args) {
        Task1 one = new Task1();
        one.theLongsWord("Имеется спорная точка зрения, гласящая примерно следующее: непосредственные участники технического прогресса могут быть обнародованы!");

        Task2 two = new Task2();
        two.isPalindrome("Шалаш");
        two.isPalindrome("Гараж");
        two.isPalindrome("Ротор");

        Task3 three = new Task3();
        three.сensorship("Слово бяка досталось нам от наших предков, поэтому бяка - это старое слово", "бяка");

        Task4 four = new Task4();
        four.numOfEntries("И вот настал вечер. И вот настала ночь. И вот настало утро...", "настал");

        Task5 five = new Task5();
        five.invertWordsText("This is a test string");
    }
}
