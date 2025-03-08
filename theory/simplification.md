# Simplification rules

## Arithmetics

| **Before**  | **After** | **When** |
|-------------|-----------|----------|
| `n = n + x` | `n += x`  | Always   | 
| `n = n - x` | `n -= x`  | Always   | 
| `n = n * x` | `n *= x`  | Always   | 
| `n = n / x` | `n /= x`  | Always   | 
| `n = n % x` | `n %= x`  | Always   |

## Ranges

> `a..b`

| **Before**       | **After**     | **When** |
|------------------|---------------|----------|
| `start..end - 1` | `start..<end` | Always   | 

Examples:

- `for (i in 0..str.length - 1) { ... }`
- `for (i in 0..<str.length) { ... }`

## Shortening

1. Last return

   Before
   ```kotlin
   val result = <expr>
   return result
   ```
   After
   ```kotlin
   return <expr>
   ```

2. Indexation

   Before
   ```kotlin
   var i = <start>
   while (i < <end>) {
      ...
      i += 1
   }
   ```
   After
   ```kotlin
   for (i in <start>..<end> - 1) { ... }
   ```

3. Float return
   Before
   ```kotlin
   if (x > y) return y else return x
   ```
   After
   ```kotlin
   return if (x > y) y else x
   ```
   
4. Simplify Boolean if
   Before
   ```kotlin
   if (something) true else false
   ```
   After
   ```kotlin
   something
   ```
5. Single-expression functions
   Before
   ```kotlin
   fun myFunction(...): SomeType {
     return something
   }
   ```
   After
   ```kotlin
   fun myFunction(...) = something
   ```