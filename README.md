# FizzBuzz -- Java insanity edition

I think everyone by now is familiar with the classic interview question FizzBuzz. My favorite implementation to date is these few lines of python:

```python
replacements = {
    3: "Fizz",
    5: "Buzz"
}

def fizzbuzzer(num, replacements):
    return "".join(map(lambda key: replacements[key] if num % key == 0 else "", replacements.keys())) or num

for num in range(100):
    print(fizzbuzzer(num, replacements))
```

I've been writing quite a bit of Java code lately, and wanted to explore what FizzBuzz would look like using modern Java and OO best practices. I want to the application to be as modular as possible, so as to forster code re-use. 

I managed to use Singleton, Factory, Delegate, and Observer patterns to this end. 

## Obviously, this is a joke

This is obviously terrible practice. Not that these patterns don't have any usage (though I become increasingly skeptical about Singleton's usefulness), but when asked to do a simple task, the solution ought to be simple. See the python implementation above.

If you can think of any ways to "improve" my implementation, feel free to send me a PR.

## Build instructions

You will need JDK 11 or later and Gradle 4.4 or later. Once installed, type:

```bash
gradle run
```

And that's it.