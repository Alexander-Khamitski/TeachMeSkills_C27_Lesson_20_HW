## Homework for lesson #20

### 1. **Task #1.1**

#### Overview

App simulates next morning activities:
- reading news, 
- eating breakfast,
- drinking coffee.
Each task is represented by a separate thread, allowing them to run simultaneously.

#### App content

App contains:  
- 3 classes of morning activities: `MorningBreakfast`, `MorningCoffee`, `MorningNews`. All of them implements `Runnable`  
interface. Includes: constructor, private field `Thread` and method `run()` and custom activity method. Constructor   
includes `thread.start();` method. Therefore all threads runs simultaneously.
- Class `Runner` creates 3 classes of activities.
---

### 2. **Task #1.2**

#### Overview

App simulates next morning activities:
- reading news,
- eating breakfast,
- drinking coffee.
  Each task is represented by a separate thread, allowing them to run simultaneously.

#### App content

App contains:
- 3 classes of morning activities: `MorningBreakfast`, `MorningCoffee`, `MorningNews`. All of them extends `Thread`  
class. Includes: constructor, private field `threadName` and method `run()` and custom activity method. Constructor   
includes `thread.start();` method. Therefore all threads runs simultaneously.
- Class `Runner` creates 3 classes of activities.
---

### 3. **Task #2**

#### Overview

App simulates car service. Service take cars for repairing works and then returns them to customers. All methods in  
`Service` are synchronized.

#### App content

App contains:
- Interface **"Constants"** has field `SERVICE_CAPACITY`. `SERVICE_CAPACITY` equals `8` by default. 
- Class **"Service"** contains synchronized `takeCar()` & `returnCar()` methods. Method `takeCar()` waits while   
there is 8 cars in service and  then notifies `returnCar()` method. Method `returnCar()` waits while   
there is less then 1 car in service and  then notifies `takeCar()` method.
- Classes **"TakingCar"** and **"ReturningCar"** contain private field `Service`, overridden method `run()`. Class  
**"TakingCar"** contains `takeCarToService()`. Class **"ReturningCar"** contains `returnCarToCustomer` method. 
Both implements `Runnable`.
- Class `Runner` creates 3 classes and 2 threads for **"TakingCar"** and **"ReturningCar"** classes. Then calls `run`  
method.
---