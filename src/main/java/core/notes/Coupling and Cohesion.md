Coupling and Cohesion
--

**Coupling**
In order to create an effective application that is easy to develop, easy to maintain and easy to update, we need to know the concept of coupling and cohesion. Coupling refers to the extent to which a class knows about the other class. 
There are two types of coupling -
Tight Coupling(bad programming design)
Loose Coupling(good programming design)



**Tight Coupling**
If a class A is able to access data members/instance variables of a class B directly by dot operator (because they were declared public), the two classes are said to be tightly coupled and it leads to bad designing, because all the checks made to ensure the valid access to data members of class B are bypassed by their direct access. Let's understand this by an example - 
````java
//Tight coupling 
class Names {
	public String name;

	public String getName() {
		// some code to check valid access to name
		return name;
	}

	public void setName(String s) {
		// some code to check valid setting to name
		name = s;
	}
}

class ModifyData {
	public void updateName() {
		Name ob = new Name();
		ob.name = "Hello"; // Directly accessing name with dot operator shows
							// tight coupling between two classes
		System.out.println(ob.name); // Tight coupling because of bad
										// encapsulation
	}
}

````

**Program Analysis**

Class Name has an instance variable, name, which is declared public.
Class Name has two public getter, setter methods which check for the valid access to name before getting and setting the name.
Class ModifyData has a method updateName(), which creates an object of Name class and accesses its instance variable directly by dot operator, because they were declared public.
Hence, getName() and setName() methods of class Name are never called and their security checks are bypassed. It shows class Name is tighly coupled to class ModifyData, which is a bad designing.




**Loose Coupling**
A good application designing is creating an application with loosely coupled classes by following proper encapsulation, i.e. by declaring data members of a class with private access and forcing other classes to access them only through public getter, setter methods. Let's understand this by an example -
````java
class Names {
	private String name;

	public String getName() {
		// some code to check valid access to name
		return name;
	}

	public void setName(String s) {
		// some code to check valid setting to name
		name = s;
	}
}

class ModifyData {
	public void updateName() {
		C ob = new C();
		ob.setName("Howard");
		ob.getName();
	}
}

````

**Program Analysis**

Class Name has an instance variable, name, which is declared private.
Class Name has two public getter, setter methods which check for the valid access to name before getting and setting the name.
Class ModifyData has a method updateName(), which creates an object of Name class and using it, calls the getName() and setName() method of class Name.
Hence, getName() and setName() methods of class Name are called and their checks are run before instance member, name, of class Name is get or set. It shows class Name is loosely coupled to class ModifyData, which is a good designing.




**Cohesion**

Cohesion refers to the extent to which a class is defined to do a specific specialized task. A class created with high cohesion is targeted towards a single specific purpose, rather than performing many different specific purposes. 
There are two types of cohesion -
Low cohesion(bad programming design)
High Cohesion(good programming design)



**Low Cohesion**

When a class is designed to do many different tasks rather than focussing on a single specialized task, this class is said to be a "low cohesive" class. Low cohesive class are said to be badly designed leading to a hard time at creating, maintaining and updating them. Let's understand this by an example -

````java
class PlayerDatabase {
	public void connectDatabase();

	public void printAllPlayersInfo();

	public void printSinglePlayerInfo();

	public void printRankings()

	public void closeDatabase();
}
````

**Program Analysis**

Here, we have a class PlayerDatabase which is performing many different tasks like connecting to a database, printing the information of all the players, printing an information of a singe player, printing all the players, print players rankings and finally closing all open database connections. Now such a class is not easy to create, maintain and update and as it is involved in doing so many different tasks, a programming design to avoid. 



**High Cohesion**

A good application design is creating an application with high cohesive classes, which are targeted towards a specific specialized task and such class is easy not only easy to create, but also easy to maintain and update.
````java
class PlayerDatabase {
	ConnectDatabase connectD = new connectDatabase();
	PrintAllPlayersInfo allPlayer = new PrintAllPlayersInfo();
	PrintRankings rankings = new PrintRankings();
	CloseDatabase closeD = new CloseDatabase();
	PrintSinglePlayerInfo singlePlayer = PrintSinglePlayerInfo();
}

class ConnectDatabase {
	// connecting to database.
}

class CloseDatabase {
	// closing the database connection.
}

class PrintRankings {
	// printing the players current rankings.
}

class PrintAllPlayersInfo {
	// printing all the players information.
}

class PrintSinglePlayerInfo {
	// printing a single player information.
}
````

**Program Anaysis**

Unlike the previous program where we had a single class performing many different tasks, here we have created severaldifferent classes, each class performing a specific specialized task, leading to an easy creation, maintanence and updation of these classes . Classes created by following this programming design are said to performing a cohesive role and are high cohesion classes, which is an appropriate programming design while creating an application. 