public class Main {
    public static void main(String[] args) {

        Task task1 = new Task("Learn Java");
        Task task2 = new Task("Call Nancy");

        task1.display();
        task2.display();

        task1.complete();

        task1.display();
    }
}