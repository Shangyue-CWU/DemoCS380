public class TestSuite {
	public static void main(String[] args) {
        System.out.println("Hello, Cat!");
        System.out.println("Hello, Dog!");

    }

}

public class Cat{
    private String name;
    private int age;
    // This is a Cat function
    public Cat(String name, int age){
        this.age = age;
        this.name = name;
    }
}