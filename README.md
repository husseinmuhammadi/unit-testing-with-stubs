# Unit Testing with Stubs

In this scenario we aim to simulate a test around the code which hasn't been written yet.
Suppose we have a vehicle and an engine. Each vehicle could have an engine inside so we will use a composition technique, so when create an instance of any vehicle the engine will pass throuth its constructor.
The test scenario would be something like this:
If a car start we should start the engine 
and if the car stop need to stop the engine 
So after each command to check the status of the car we check the status of an engine 

For stub testing we implement the code of the engine which hasnt been implemented yet.  


Other references

https://dzone.com/articles/why-your-junit-5-tests-are-not-running-under-maven
