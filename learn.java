# JAVA
class Dog {
  
  int age;

	public Dog(int dogsAge) {
    
  	age = dogsAge;
    
  }
  
  public void bark() {
		
    System.out.println("Woof!");
    
	}
	
  public void run(int feet) {
    
    System.out.println("Your dog ran " + feet + " feet!");

	}
  
  public int getAge() {

    return age;
    
	}
  
	public static void main(String[] args) {
    
    Dog spike = new Dog(5);
    spike.bark();
    spike.run(40);
    int spikeAge = spike.getAge();
    System.out.println(spikeAge);

	}

}
