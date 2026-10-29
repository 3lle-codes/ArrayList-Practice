
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Boolean> violinPractice = new ArrayList<>();

        // 1. add()
        subjects.add("Math");
        subjects.add("Chemistry");
        subjects.add("Computer Science");

        scores.add(88);
        scores.add(94);
        scores.add(88);
        scores.add(100);
        scores.add(76);
        scores.add(91);

        violinPractice.add(true);
        violinPractice.add(false);
        violinPractice.add(true);

        System.out.println("1. add(): " + subjects);
        System.out.println("Scores: " + scores);
        System.out.println("Violin practice: " + violinPractice);

        // add() with an index
        subjects.add(1, "Physics");
        System.out.println("After inserting Physics: " + subjects);

        // 2. addAll()
        subjects.addAll(Arrays.asList("Art", "English"));
        System.out.println("2. addAll(): " + subjects);

        // 3. size()
        System.out.println("3. size(): " + subjects.size());

        // 4. get()
        System.out.println("4. get(2): " + subjects.get(2));

        // 5. set()
        String replaced = subjects.set(4, "Statistics");
        System.out.println("5. Replaced: " + replaced);
        System.out.println("After set(): " + subjects);

        // 6. remove()
        String removed = subjects.remove(5);
        System.out.println("6. Removed: " + removed);
        System.out.println("After remove(): " + subjects);

        // 7. contains()
        System.out.println("7. Contains Chemistry: "
                + subjects.contains("Chemistry"));

        // 8. indexOf()
        System.out.println("8. First index of 88: "
                + scores.indexOf(88));

        // 9. lastIndexOf()
        System.out.println("9. Last index of 88: "
                + scores.lastIndexOf(88));

        // 10. isEmpty()
        System.out.println("10. Is violin practice list empty? "
                + violinPractice.isEmpty());

        // 11. removeAll()
        scores.removeAll(Arrays.asList(88, 76));
        System.out.println("11. After removeAll(): " + scores);

        // 12. retainAll()
        scores.retainAll(Arrays.asList(94, 91));
        System.out.println("12. After retainAll(): " + scores);

        // 13. subList()
        System.out.println("13. subList(1, 4): "
                + subjects.subList(1, 4));

        // 14. toArray()
        Object[] subjectArray = subjects.toArray();
        System.out.println("14. toArray(): "
                + Arrays.toString(subjectArray));

        // 15. clear()
        violinPractice.clear();
        System.out.println("15. After clear(): " + violinPractice);
        System.out.println("Is violin practice list empty now? "
                + violinPractice.isEmpty());

        System.out.println("\nFinal ArrayLists:");
        System.out.println("Subjects: " + subjects);
        System.out.println("Scores: " + scores);
        System.out.println("Violin Practice: " + violinPractice);
    }
}
