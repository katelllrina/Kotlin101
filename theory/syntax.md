# Kotlin Syntax

## Operators

### Arithmetics  

- `+`: addition/plus
- `-`: subtraction/minus
- `*`: multiplication
- `/`: division/div
- `%`: modulus/mod

### Comparison

- `<`: less
- `>`: greater
- `<=`: less or equal
- `>=`: greater or equal
- `==`: equal
- `!=`: not equal

## Keywords

- `fun`: define new function
  - `fun sumDigit(n: Int): Int { ... }`
- `val`: create new immutable variable
- `var`: create new   mutable variable
- `if-else`: condition
  - `if (x < 10) { ... } else { ... }`
  - `if (x < 10) { ... }`
- `return`: return result from function and end function
  - `return n`
  - `return 10`
  - `return n + 7`
  - `return lastDigit(n) * 10`
- `while`: conditional loop
  - `while (n < 10) { n += 1 }`
- `for`: for-loop
  - `for (i in 3..7) { println(i) }`

### For-loops

Indexed for-loop:

```kotlin
val str = "Hello"
for (i in 0..str.length - 1) { ... }  // i: Int, i is index
for (i in 0..<str.length) { ... }  // i: Int, i is index
for (c in str) { ... }  // c: Char, c is symbol
```

## Types

- Int: numbers (436, -2)
- Long: "big" numbers
- String: text ("Hello, Kate!")
- Char: symbol ('x')
- Boolean: true, false

### Int

Numbers, positive or negative, 32 bits, between:

- `-2^31..2^31 - 1`

### Long

Numbers, positive or negative, 64 bits, between:

- `-2^63..2^63 - 1`

### Char

Single symbol

- '1', 'x', '5'

**!!! IMPORTANT !!!** `1` and `'1'` are not the same!

### String

Text of arbitrary length: `"Hello, it's Friday!"`

- str[i]: symbol at index `i` (starts with 0)
  - Has type `Char`
- s.length: number of symbols in the string