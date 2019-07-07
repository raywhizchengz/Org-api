# Org-api

This is a spark-java api that enables one dispay the data from a database in form of a json object;

## Author

- **Arnold Oduma**

### -_Initial works_-

- [Hero-Squad](https://github.com/ArnoldOduma/hero-squad) - A java and sparkjava framework application for creating heroes and assigning them squads.
- [Github Search](https://github.com/ArnoldOduma/git-search) - An app to search github users and their repositories
- [Quotes](https://github.com/ArnoldOduma/quotes) - An app that enables a user create quotes and delete quotes they don't want
- [Goals](https://github.com/ArnoldOduma/goals-application) - This is an application to create goals and checkout the ones you completed
- [Pig Dice](https://github.com/ArnoldOduma/Pig-Dice) - This is a simole java script game of pigdice
- [Delani Studio](https://github.com/ArnoldOduma/Delani_Studio) - A front end of a studio website
- [Triangle Tracker](https://github.com/ArnoldOduma/triangle-tracker) - Tracks what type a triangle is by checking its length width and height
- [portfolio](https://github.com/ArnoldOduma/portfolio) - My portfolio website

## Demo

<!-- <img src="./demo.png" width="100%"/> -->

## Getting Started

Clone this repository to your local machine to get Started

Github: [https://github.com/ArnoldOduma/.git](https://github.com/ArnoldOduma/Hero-Squad.git)

### Prerequisites

You need the following installed on your machine

- java
- JDK - Java Development Kit
- Maven
- Gradle
- An IDE - Intellij
- Postman - for testing the api

To confirm run the following command on linux

```
$ java --version       //java version
$ mvn --version        //maven version
$ gradle --version     //gradle version
```

## Installing

After cloning to your local machine navigate to the folder you cloned into and open it with intellij.

- Navigate into the `src/main/java/App.java` and open it in intellij idea or your favorite editor.
- Go to your browser and type `localhost:4567`

After this you will probably get a 500 error since we do not have a database yet.
```
in psql:
CREATE DATABASE wildlife_tracker;
CREATE TABLE IF NOT EXISTS news(id SERIAL PRIMARY KEY, news VARCHAR, departmentId int);
CREATE TABLE IF NOT EXISTS departments(id SERIAL PRIMARY KEY,animal_id int,animal_name VARCHAR);
CREATE TABLE IF NOT EXISTS users(id SERIAL PRIMARY KEY,animal_id int,animal_location VARCHAR ,ranger_name VARCHAR,created_at TIMESTAMPDEFAULT CURRENT_TIMESTAMP);

//for the test database
In psql:
CREATE DATABASE wildlife_tracker_test WITH TEMPLATE wildlife_tracker;

```

## Running the App
Navigate to the project directory through your terminal and type gradle run.


Your code should look something like this where moringa is your computer username

```

moringa@moringa-Lenovo-V110-15ISK:~/moringa-projects/JAVA/wild$ gradle run

```


## Running the Tests

Create a test class for running tests in the application.

This is a sample test that tests if the method adding animals to the database works

```
@Test
public void saveAnimal() {
    Animal newAnimal = Animal.setUpNewAnimal();
    EndangeredAnimal newDanger = new EndangeredAnimal("Rhino","ill","young");
    newDanger.saveAnimal(newDanger);
    int initialId = newAnimal.getId();
    newAnimal.saveAnimal(newAnimal);
    assertNotEquals(initialId,newAnimal.getId());
}

```

## Built With

- [Java](https://www.java.com/) - The language used
- [Intellij Idea](https://www.jetbrains.com/idea/) - Intergated development
- [Spark]() - Framework

## Contributing

If you want to put out a pull request you first have to send us the sample code that you want to add to our repository for cross-checking before we allow the pull.

## Versioning

We use [Github](https://github.com/) for versioning. This is the first version of this application

## License

This project is licensed under the MIT License -see the [LICENSE](LICENSE) file for details

## Acknowledgments

- Hat tip to `Stackoverflow`
