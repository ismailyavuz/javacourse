package tr.com.ismailyavuz.javacourse.week5.interfacerunner;

public class Retired implements Human {

	public String name;
	public int age;
	boolean isRetired = true;

	public void introduce() {
		System.out.println("I am retired, what was my name? " + name.substring(0, 3));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isRetired() {
		return isRetired;
	}

	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}

}
