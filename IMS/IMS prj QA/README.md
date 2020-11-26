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

After forking or downloading the files, navigate to the targer folder in this folder are the .jar files required to and open a CLI, either the native cmd or in git bash. Type 
```
'ls'
```
 to verify that the "ims-0.0.1-jar-with-dependencies" is in the folder. To run the jar file and execute the program type 

```
'java -jar ims-0.0.1-jar-with-dependencies' and the program should begin if the gcp instance is up.
```
### Prerequisites

What things you need to install the software and how to install them

IDE compatible with Java 
https://www.eclipse.org/downloads/
The link above will transport you to the download page for a Java IDE called Eclipse.


Maven installation
https://maven.apache.org/install.html

https://maven.apache.org/download.cgi?Preferred=ftp://ftp.osuosl.org/pub/apache/
The links above contain instructions on how to install maven followed by the download link itself.

available from


### Installing

A step by step series of examples that tell you how to get a development env running

Download the Eclispse IDE from this link https://www.eclipse.org/downloads/
Then natvigate to your downloads folder and double click to run the .exe file.


End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
