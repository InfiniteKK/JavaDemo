public class Application {
    public static void main(String[] args) {
        Person p = null;
        try {
            p = new Person(666);
        } catch (ThrowNoSuchAgeException e) {
            e.printStackTrace();
        }

    }
}
