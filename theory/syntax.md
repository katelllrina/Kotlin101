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
- `break`: finish loop earlier
- `when`: pattern matching
  - `when (c) { '1' -> true; else -> false }`

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
- `c.code`: ASCII code for symbol
  - `c.code = 48` then symbol is '0' (see ASCII table)
- `c.digitToInt()`: Convert symbol to digit integer

**!!! IMPORTANT !!!** `1` and `'1'` are not the same!

### String

Text of arbitrary length: `"Hello, it's Friday!"`

- `str[i]`: symbol at index `i` (starts with 0)
  - Has type `Char`
- `s.length`: number of symbols in the string
- `s.substring(start..end)`: substring from `s` between `start` and `end` (both inclusive)
  - `s.substring(0..2)`
  - `s.substring(3..<8)`
  - `s.substring(1..<len)`

## Standard Functions

- `println`: print anything to terminal and add new line
- `print`: print anything to terminal; don't add new line
- `min`: minimum of two numbers
  - Requires: `import kotlin.math.*`
  - Example: `min(3, 7)`