# About
Safetypes is a Java library, which aims to decrease the cost and effort for 
input validation for REST APIs.

## Summary
The safetypes-java library contains special classes which 
can substitute their conventional alternatives in Java and 
which aid input validation on deserialization level, 
when used in a REST API implementation.

## Example
safetypes-java contains classes which can be used instead of 
String when declaring a request parameter:

```
//Spring REST example
import Word;
...
@GetMapping("/word")
public ResponseEntity<String> word(@RequestParam Word word) {
return new ResponseEntity<>(word.get(), HttpStatus.OK);
}
...
```
The class Word is used instead of String and in the same time 
Word is constructed in such a way, that it allows only for 
letters, e.g. "abcd", "test", "Todor", etc. and it throws 
an exception for everything else, e.g. "this is a test", 
"number1", "Ol3v". From the API point of view, a correct and 
expected input will be successfully processed, while something 
incorrect or unexpected will lead to a Bad Request response.

## Extensibility
The library contains useful classes ready to be used, but it is also easily extensible for customisation.
Every special class in the library is in a hierarchy extending AbstractSafeType.java. This abstract class has
two methods:

```
protected abstract void accept(T value) throws TypeValidationException;
protected void validate(T value) throws TypeValidationException { }
```

`accept()` must be implemented by any new special class, which is not part of the library, while
`validate()` is intended to facilitate the customization of existing classes.

## License
OWASP Java safetypes is free to use under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0).