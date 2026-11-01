class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class Pair<A, B> {

    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}

public class GenericDemo {

    public static <T> T firstElement(T[] array) {

        return array[0];
    }

    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>();

        intBox.set(100);

        System.out.println(
                "Integer Box: " +
                intBox.get()
        );

        Box<String> stringBox = new Box<>();

        stringBox.set("Java");

        System.out.println(
                "String Box: " +
                stringBox.get()
        );

        Pair<String, Integer> pair =
                new Pair<>("Prince", 21);

        System.out.println(
                "Name: " +
                pair.getFirst()
        );

        System.out.println(
                "Age: " +
                pair.getSecond()
        );

        String[] names =
                {"Prince", "Rahul", "Amit"};

        System.out.println(
                "First element: " +
                firstElement(names)
        );
    }
}