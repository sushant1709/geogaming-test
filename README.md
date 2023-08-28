# geogaming-test
![image](https://github.com/sushant1709/geogaming-test/assets/19224353/a1c5249e-4641-44a8-a448-b095dbad8622)

# Folder Structure!

<img width="296" alt="image" src="https://github.com/sushant1709/geogaming-test/assets/19224353/99f94e3c-8b37-45c3-9185-4c33af555e8c">


- # src/main/java
- ##### com.geogaming.utils  : contains files to initilize driver,initilize property file and initilize Global Parameter



- # src/test/java
- ##### com.geogaming.web.pages       : contains locators, reusable methods in base page and methods for StepDef 
- ##### com.geogaming.web.stepdef     : contains pages and stepdef files for Web Automation
- ##### com.geogaming.runner          : it contains Runner file to execute test

- # src/test/resources
- #### feature : it contains feature file for web scenario

- # Execution :
-  ##### RunnerTest : update the respected tag to execute the scenario and Run
-  #### Command Line: mvn test -Dcucumber.options= "-- tags @tag" -DBrowserName="Chrome"
-  #### change the GlobalParameter according to requirement i.e to execute on Chrome test change DBrowserName="Chrome"

-  # Reports

-  #### target
-  <img width="944" alt="image" src="https://github.com/sushant1709/geogaming-test/assets/19224353/b7d1d3f2-46ff-4303-bf42-78af5b8a8594">

<img width="946" alt="image" src="https://github.com/sushant1709/geogaming-test/assets/19224353/1095050f-a655-41fc-8659-15d054389ff1">


