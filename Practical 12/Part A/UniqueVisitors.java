import java.util.*;

public class UniqueVisitors {

    public static void main(String[] args) {

        List<String> logins = Arrays.asList(
                "Prince",
                "Rahul",
                "Amit",
                "Prince",
                "Neha",
                "Rahul",
                "Jay",
                "Amit"
        );

        HashSet<String> uniqueUsers = new HashSet<>(logins);

        LinkedHashSet<String> firstSeenOrder =
                new LinkedHashSet<>(logins);

        System.out.println("Unique user count: " + uniqueUsers.size());

        System.out.println("First three distinct users:");

        int count = 0;

        for (String user : firstSeenOrder) {

            System.out.println(user);

            count++;

            if (count == 3) {
                break;
            }
        }
    }
}