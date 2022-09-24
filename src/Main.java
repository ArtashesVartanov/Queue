import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        List<Person> people = generateClients();
        for (Person person : people) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Посетитель " + person.getName() + " покатался");
            person.spendOneTicket();
            if (person.moreTickets()) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> ans = new ArrayList<>();
        ans.add(new Person("Настя", "С", 1));
        ans.add(new Person("Ваня", "П", 3));
        ans.add(new Person("Виктор", "В", 1));
        ans.add(new Person("Арина", "К", 2));
        ans.add(new Person("Даниил", "Я", 1));
        return ans;
    }
}