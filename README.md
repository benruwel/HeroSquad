




<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://icons8.com/icon/83325/roman-soldier"></a>
<img src="https://img.icons8.com/color/300/000000/ninja-head.png" width="150" height="150"/>  

  <h3 align="center">Hero Squad</h3>

  <p align="center">
    Create squads, heroes and join the battle for justice!
</p>
<p align="center" >Ben Ruwel</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [BDD](#bdd)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

This is a fun app that allows users to create squads with custom heroes and with custom strengths and weaknesses.

A hero can only belong to one squad if the member list is not full.

### Built With
This is program is wholely written in Java and built with
* [Oracle Java 11.8](https://www.oracle.com/java/)
* [Gradle 6.5](https://gradle.org/)
* [Spark 2.6.0](http://sparkjava.com/)
* [Handlebars 2.5.5](https://handlebarsjs.com/)
* [Apache Maven 2.3.2](https://maven.apache.org/)
* [Heroku Plugin 3.0.2](https://elements.heroku.com/addons)
* [JUnit4](https://junit.org/junit5/)



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Prerequisites

In order to build this app locally, first make sure you have all the programs listed in [Built with](#built-with)


### Installation

1. Clone the repo
    ```sh
    $ git clone https://github.com/benruwel/HeroSquad.git
    ```

2. Wait gradle to install all the dependencies automatically


## Usage

To build this project:

1. Open your preferred terminal 

2. In your project's root directory run the project with
    ```sh
    $ gradle run
    ```
3. Then navigate to _`localhost:4567`_ to view the page    


## BDD
This project is used to illustrate the concept of creating **Objects within Objects**. In our case scenario, a single instance of a Hero object should be created in only one other instance of the Squad object.

_`POST squads/new`_ and _`POST heroes/new`_ methods create a new instance of the squad and hero squad respectively.

_`POST heroes/new`_ creates an object within an already created squad instance using the the instance's id. This id is set equal to its position on the Arraylist object which consists of all the created squad instances.


## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

My email  - ruwelmwangi@gmail.com

Project Link:  [https://github.com/benruwel/CaesarCipher.git](https://github.com/benruwel/CaesarCipher.git)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [IntelliJ](https://www.jetbrains.com/idea/)
* [Icons8](https://icons8.com/icons)
* [Bootstrap](https://getbootstrap.com/)
