package constructor;

public class name {
	    private String name;
	    private int age;
	    public name(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public name(name otherPerson) {
	        this.name = otherPerson.name;
	        this.age = otherPerson.age;
	    }
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	    public String toString() {
	        return "Person [Name: " + name + ", Age: " + age + "]";
	    }
	    public static void main(String[] args) {
	        name originalPerson = new name("Tarun", 20);
	        System.out.println("Original " + originalPerson);
	        name copiedPerson = new name(originalPerson);
	        System.out.println("Copied " + copiedPerson);
	        copiedPerson.setName("Tannu");
	        copiedPerson.setAge(18);
	        System.out.println("Modified Copied " + copiedPerson);
	    }
	}
