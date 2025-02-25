# Simplification rules

## Arithmetics

| **Before**  | **After** | **When** |
|-------------|-----------|----------|
| `n = n + x` | `n += x`  | Always   | 
| `n = n - x` | `n -= x`  | Always   | 
| `n = n * x` | `n *= x`  | Always   | 
| `n = n / x` | `n /= x`  | Always   | 
| `n = n % x` | `n %= x`  | Always   |

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
