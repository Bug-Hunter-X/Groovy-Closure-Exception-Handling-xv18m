```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  try {
    closure()
  } catch (RuntimeException e) {
    println "Exception caught within closure: ${e.message}"
    // Add more robust error handling, such as logging
  }
  println "After closure execution"
}

myMethod { 
  println "Inside closure"
  throw new RuntimeException("Something went wrong!")
}
```