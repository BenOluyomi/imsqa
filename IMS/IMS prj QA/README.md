Coverage of src/main: 65.1%
# Project Title

This project is about the creation of an IMS(Integrated Management System), specifically based around a customer ordering system. 
This project works through interacting with a CLI to manipulate data within a SQL database inside of a GCP instance. Within the database there are the following datables;

- customers
- orders
- order_items
- items

These tables each have a CRUD functionality (Create, Read, Update and Delete) where you can delete orders, customers, items from orders and items themselves. You can also update these values throught the update functionality and the changes will be relflected in the MySQL database.

## Getting Started

### Prerequisites

What things you need to install the software and how to install them

A Java version of 14.0.2 or higher is recommended

IDE compatible with Java 
https://www.eclipse.org/downloads/
The link above will transport you to the download page for a Java IDE called Eclipse.


Maven installation
https://maven.apache.org/install.html

https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/
The links above contain instructions on how to install maven followed by the download link itself.

In order to rebuild the jar files to run, the following cammands need to be input into the a cli where your pom.xml files is located.

```
mvn clean 
```
```
mvn install 
```
this should provide you with the jar files in your directory.
### Installing

After forking or downloading the files, navigate to the targer folder in this folder are the .jar files required to and open a CLI, either the native cmd or in git bash. Type 
```
'ls'
```
 to verify that the "ims-0.0.1-jar-with-dependencies" is in the folder. To run the jar file and execute the program type 

```
'java -jar ims-0.0.1-jar-with-dependencies' and the program should begin if the gcp instance is up.
```

To test some basic functionality is working, after entering the username and password for the server type;
```
customer
```
```
read
```
This should display the people already in the customer list...
```
create
```
```
Steven
```
```
Jacobs
```
This will add a new person called Steven Jacobs to the customer database
```
read
```
Now Steve Jacobs should be shown as another customer in a database
## Running the tests

### Unit Tests 

These tests test the classes in the src/main folder and they are there to ensure that everything wrtten on the development side is working as is it should for each class. For example the code below would be testing the create function for the customer class.

```
@Test
	public void testCreate() {
		final Customer created = new Customer((long)3,"adam", "one");
		assertEquals(created, custDAO.create(created));
	}
```

### Integration Tests 
Integration tests are performed to highlight imperfections in the interactions between different entities integrated within a system, or between systems. Integration tests typically focus on the interface between modules and the transfer of information between them.

For example for a website when a user logs in they ought to be directed to a home page, the test would verify that the link between the home page and login page is functional.


### And coding style tests

Explain what these tests test and why


## Deployment

This can be deployed ona live system using the .jar files provided in the target folder.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)
* **Benjamin Oluyomi** 

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*


