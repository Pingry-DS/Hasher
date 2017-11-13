Hasher
=======

Provides a simple interface called `Hasher` for hashing Strings. And a runner for comparing several Hasher implementations.

Usage
-----
For the simplest usage with the included Hashers and 100 most common English words:

```java HashRunner```

To use a custom word list:

```java HashRunner 3kWords.txt```

For actual interesting results, edit `HashRunner.java` to include your custom Hashers and a custom number of bins. Then recompile and rerun:
```
javac HashRunner.java MyHasher.java
java Hashrunner 3kWords.txt
```

Hashers
-------
Classes that implement the `Hasher` interface (found in `Hasher.java`) implement a single custom hash function. By using the Hasher interface, your Hashers will be ready to be compared via this project's `HashRunner`.

Authors
-------
Written by Josh Orndorff for DataStructurs course Fall 2017

License
-------
See unlicense.org
