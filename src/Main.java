//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hero testSubjectA = new Hero("A", 7,10,5,5);
        Hero testSubjectB = new Hero("B", 3,8,1,10);

        System.out.println(testSubjectA);
        System.out.println(testSubjectB);

        testSubjectB.reciveDamage(testSubjectA.attack());
        System.out.println(testSubjectB);
        testSubjectB.heal(2);
        testSubjectA.heal(5);
        System.out.println(testSubjectA);
        System.out.println(testSubjectB);
    }
}