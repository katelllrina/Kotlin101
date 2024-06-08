/*

fun, val, if-else, return - keywords / reserved words / language constructions


Two kinds of language constructions:

1. Statements
2. Expressions

Difference:

1. Expressions are values that have types
   42: Int
   false, true: Boolean
   'x': Char
   "Kate": String
   someVariable: someType (this is expression too!)
   xor: (Boolean, Boolean) -> Boolean
   if-else: if (<condition> : Boolean) { <expression_if_true> : t } else { <expression_if_false> : t } : t
      if ("January") -- WRONG !!!
      if (==) -- WRONG !!!
      if (1) -- WRONG !!!
      if (== 1) -- WRONG !!!
      if (xor(true, false)) -- OK !
      if (true) { "January" } else { 5 } -- WRONG !!!

   when (<name>) {
     <pattern1> -> <expr1> : t
     <pattern2> -> <expr2> : t
     ...
     <patternN> -> <exprN> : t
     else -> <exprElse> : t
   } : t

2. Statements: other
   val - value (immutable)
   var - variable (mutable)

   val <name> = <expr : t>
     => <name: t> is expression
   val z = 8
   val x = z + 5
     => x: Int

   var x = 10

   fun <name>(<args>): <return_type> { <body> }

   return <expr>

   for (<name> in <list>) { }

   while (<condition: Boolean>) {
     <body>
   }
*/

/* Function types

   1. Top-level functions
      myFunction(x, y, z)

   2. Member functions
      x.myFunction(y, z)

   3. Member properties
      x.someValue

 */

/* String

Examples: "Kate", "2024-04-09", "x", ""

Properties:
   myString.length - number of characters in myString

Extracting chars:

   val s = "Kate"
   // s[0] = 'K'
   // s[1] = 'a'
   // s[2] = 't'
   // s[3] = 'e'

 */

// ----------------------------------
// Code Simplifications / Refactoring
// ----------------------------------
/*
1. else-if

   From:

   if (<condition1>) {
      <expr1>
   } else {
     if (<condition2>) {
       <expr2>
     } else {
      <expr3>
     }
   }

   To:

   if (<condition1>) {
     <expr>
   } else if (<condition2>) {
     <expr2>
   } else {
     <expr3>
   }

2. Inserting just string
   From:
     "$someVariable"

      AND

      someVariable: String

   To:
     someVariable

3. Last return
   From
     val result = <expr>
     return result
   To:
     return <expr>

4. Function expression
   From:
     fun myFunction(args...): Type {
       return <expr>
     }
   To:
     fun myFunction(args...): Type =
        <expr>

5. Simplify if (Part 1)
   From:
     if (<condition>) { true } else { false }
   To:
     <condition>
 */