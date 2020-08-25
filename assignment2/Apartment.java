public class Apartment {

    Owner owner;
    int rent;
	Apartment(Owner owner, int rent) { 
        this.rent = rent;
        this.owner = owner;
    }
	int getRent() {return this.rent; }
	Owner getOwner() {return this.owner; }
	
	
	public static void main(String[] args) {
		
		Owner owner1 = new Owner("Jeff", 40);
		Owner owner2 = new Owner("Mukesh", 50);
		Owner owner3 = new Owner("Bill", 60);
		
		Apartment a1 = new Apartment(owner1, 4000);
		Apartment a2 = new Apartment(owner2, 6000);
		Apartment a3 = new Apartment(owner1, 1000);
		Apartment a4 = new Apartment(owner3, 9000);
		
		// create an array of Apartments and initialize to the above 4
		Apartment [] apts = {a1,a2,a3,a4};
		
        // find the apt with the hightest rent
        int max = 0;
        for(int i = 0;i<4;i++)
        {
            if(apts[i].getRent() > max)
            {
                max = i;
            }   
        }
		
		// print the name of its owner (to System.out) 
		System.out.print(apts[max].getOwner().Name);

	}

}

class Owner {
    
    String Name;
    int Age;
	Owner(String name, int age) { 
        Name = name;
        Age = age;
    }
	int getAge() { return Age; }
	String getName() {return Name; }
	
	
	
}