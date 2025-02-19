```groovy
def myMethod(Closure closure) {
  println "Before closure execution"
  closure()
  println "After closure execution"
}

myMethod { 
  println "Inside closure"
  // Simulate an exception
  throw new RuntimeException("Something went wrong!")
}
```