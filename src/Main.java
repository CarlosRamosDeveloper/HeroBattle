//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hero testSubjectA = new Hero("A", 7,100,10,5);
        Hero testSubjectB = new Hero("B", 3,80,50,10);

        System.out.println(testSubjectA);
        System.out.println(testSubjectB);

        Battle.start(testSubjectA,testSubjectB);
    }
}