# PinGenerator Library
This library provides a way to generate a batch of unique PINs. You can configure the number of PINs to generate and the length of each PIN.

# Usage
To use this library, first, create an instance of PinGenerator. You can use the default constructor to create a PinGenerator that 
generates 1000 unique 4-digit PINs:

```java
    PinGenerator pinGenerator = new PinGenerator();
    Set<String> pins = pinGenerator.generatePins();
```

To configure the PIN length and the number of PINs to generate, use the other constructor:
```java
    int pinLength = 5;  // The length of each PIN.
    int pinCount = 2000;  // The number of PINs to generate.
    PinGenerator pinGenerator = new PinGenerator(pinLength, pinCount);
    Set<String> pins = pinGenerator.generatePins();
```
In this example, the PinGenerator generates 2000 unique 5-digit PINs.

# Build
## Building the Library

You can build this library using any Java IDE or directly from the command line with Maven. If you're using Maven, navigate to the project directory and run:

```bash
  mvn clean install
```

## Running the Tests
```bash
  mvn test
```
