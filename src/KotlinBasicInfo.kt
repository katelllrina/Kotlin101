/*

fun, val, if-else, return - keywords / reserved words / language constructions


Two kinds of language constructions:
1. Statements
2. Expressions

Difference:
1. Expressions are values that have types
1: Int
false, true: Boolean
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

2. Statements: other
val <name> = <expr : t>
=> <name: t> is expression
val z = 8
val x = z + 5
=> x: Int

fun <name>(<args>): <return_type> { <body> }

return <expr>

for (<name> in <list>) { }
*/
