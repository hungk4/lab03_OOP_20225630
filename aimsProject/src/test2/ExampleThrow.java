package test2;

public class ExampleThrow {
    public void checkAge(int age) {
        if (age < 18) {
            // Ném ngoại lệ nếu tuổi nhỏ hơn 18
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        ExampleThrow example = new ExampleThrow();
        example.checkAge(16);  // Sẽ ném ngoại lệ vì tuổi không hợp lệ
    }
}
