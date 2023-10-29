# The-RPG-Engine
Mirror of the ReadMe.md from [The RPG Engine](https://store.steampowered.com/app/1818180/The_RPG_Engine/) that I co-founded

An API is also available. The webpage can be found [here](https://o-litnon.github.io/The-RPG-Engine_API/)

[![Watch the video](https://cdn.akamai.steamstatic.com/steam/apps/1818180/header.jpg?t=1678558364)](https://www.youtube.com/watch?v=nQwn7k3Rb3s)


# Description
Looking for a more immersive digital TTRPG experience? The RPG Engine offers a powerful all-in-one solution for crafting and experiencing your own roleplaying worlds.

Create unique and interactive 3D maps with an intuitive world-building interface. With an integrated dice roller, chat system and character control, hosting and playing your favourite TTRPGs online has never been so engaging!


As a Game Master, you have freedom to create and manage your very own interactive worlds. To bring life to your stories you can…
Automatically host a server for your friends to join as players
Build new custom maps
Sculpt and paint the terrain, including overhangs and caves
Fill the world with props and items for your players to discover
Assign characters to your players, allowing them to move freely and explore your world
Attach and remove weapons and items from players


The RPG Engine offers unparalleled freedom to adventurous players. In The RPG Engine, you can…
Explore unique, custom-built 3D worlds with your friends
Control the movement and animations of your assigned characters
Visualise and engage in exciting combat scenarios
Chat with fellow players
Use effects to add to your storytelling


Need fast access to an item or a fully built world? Simply download from the Steam Workshop and have it in seconds.
Assets created in game can be shared with others- this includes maps, characters, special items, and player sheets.
We believe in sharing and growing our creations as a community, as such, workshop sharing will always remain free.


But it doesn’t stop at hosting and playing TTRPGs. With an easy-to-learn and versatile interface, The RPG Engine can also be used for:
Brainstorming
Storyboarding
Visual storytelling
Level design prototyping




# RPG Engine Roll Syntax
```
Basic Roll NdX
Rolls N traditional (almost, you can have any number of sides that you want) dice with X sides per die. N must be greater than or equal to 0 and X must be greater than or equal to 1.

Fate/Fudge Roll Ndf
Rolls N Fate/Fudge dice. These dice have three sides with values of -1, 0, and 1.
This command is actually a short cut for: Ndf == Nd6c>4f<3
For example, the d6 roll will give the following results:
A Roll of 1 or 2 = -1
A Roll of 3 or 4 = 0
A Roll of 5 or 6 = +1
4df = (-1 + 1 + 1 + 0)

Example Fudge Roll
3df - Roll 3 d6's, count one success for each roll higher than 4, and one failure for each roll bellow 3.

Roll Modifiers
Modifiers that can change the behavior or outcome of dice rolls. Each modifier states which Types Of Dice it can be applied to in parentheses after the modifier name. Rolls can have multiple modifiers applied to a single roll to allow for complex dice expressions.

B - Basic Roll
Many modifiers compare each die to a target number to decided if the modifier action should be applied. We'll call this a Compare Point or CP for short in the roll modifiers below. A Compare Point consists of an optional compare operation <,=,> and a target number. If the operation is not specified = is assumed and for most modifiers the entire Compare Point can be left off for the default behavior.

Example Compare Points
=3 - If the roll is equal to 3
>2 - If the roll is greater than or equal to 2
<18 - If the roll is less than or equal to 18

Target Number / Successes - cCP
Normally when you perform a roll, The RPG Engine reports back the total value of all the dice rolled, plus any modifiers. Some game systems, though, work by rolling a set of dice versus a target number, and then adding up the total number of successes instead.

Example Success Checks
3d6c>3 - Roll 3 d6's and count one success for each roll higher than 3
10d6c<4 - Roll 10 d6's and count one success for each roll less than 4

Failures - fCP
Some systems build on success checks by also including failures. Failure checks only work when a success check is already being done and each failure subtracts one from the total number of successes.

Example Failure Checks
3d6c>3f1 - Roll 3 d6's and count one success for each roll higher than 3 and one failure for each 1
10d6c<4f>5 - Roll 10 d6's and count one success for each roll higher than 4 and one failure for each roll higher than 5

Exploding Dice - xCP
Exploding dice, also known as "rule of 6" or "rule of 10s" depending on your gaming system, rolls an additional die if the maximum is rolled. If the additional roll is also the maximum number the additional rolls keep on going! The Compare Point can be specified to change the exploding trigger.

Example Exploding Dice
3d6x - Rolls 3d6 and explodes every time a 6 is rolled
3d6x>4 - Rolls 3d6 and explodes every time a 5 or 6 is rolled

Exploding Once Only Dice - xoCP
In some systems (such as D&D 5E) you want to reroll dice below a certain value, but you only want to reroll the dice one time each. To do that, just use xo instead of x.

Example Reroll Once Rolls
2d10xo<3 - Roll 2 d10's and reroll any time a 2 or lower is rolled, but only up to one time per dice.

Penetrating Dice - xpCP
HackMaster (and some other systems) use a special style of exploding dice where the additional rolls for each dice have 1 subtracted from the roll. To do this, add a p after the x mark. A die can penetrate multiple times but the modifier is only ever -1 to each additional die.

Example Compounding Dice
5d6xp - Rolls 5d6 and explode with a -1 modifier every time a 6 is rolled
5d6xp>4 - Rolls 5d6 and explode with a -1 modifier every time a 5 or higher is rolled.

Keep / Drop Dice - khN/klN/dhN/dlN
Some game systems ask you to roll a large number of dice, and then either drop a certain number (N) of the lowest rolls, or keep only a certain number (N) of the highest rolls. The RPG Engine supports this type of roll through the d and k commands, respectively. The optional h/l parameter can either be h to keep or drop the highest N dice or l to keep or drop the lowest N dice. If not specified when keeping rolls the high rolls will be kept and when dropping rolls the low rolls will be dropped. The Compare Point can be specified to change the matching trigger.

Example Keep Rolls
8d100k4 - Roll 8 d100's and keep the four largest rolls.
8d100kl4 - Roll 8 d100's and keep the four smallest rolls.
8d100k>4 - Roll 8 d100's and keep the rolls that are larger than four.

Example Drop Rolls
8d100d4 - Roll 8 d100's and drop the four smallest rolls.
8d100dh4 - Roll 8 d100's and drop the four largest rolls.
8d100d=4 - Roll 8 d100's and any that are equal to four.

Sort Ascending / Descending - s/sd
Normally when you perform a roll, The RPG Engine reports back the rolled dice in no particular order. If you want to return the dice results is ascending or descending order, adding 's' or 'sd' respectively will give the desired results.

Example Ascending order
3d6s - Roll 3 d6's and sort the results in ascending order
10d6sd - Roll 10 d6's and sort the results in descending order

#######
Example Complex Rolls
10d6dl3dh3sc>2f<3k<4 - Rolls 10 d6's, then drops lowest 3, then drop highest 3, then sorts ascending, then count success when the roll is above 2 and count failure when the roll is less than 3, then keep values less than 4.
######################################
######################################
Expressions can be combined using operators, each with their own precedence priority. Here is a list of the priority of these operators:

Primary (parentheses and values)
Unary (not, -, ~)
Power (^)
Multiplicative (*, /, %)
Additive (+, -)
Relational (<, <=, >, >=, =, ==, !=, <>)
Logical (or, ||, and, &&)

Logical operators are used to make comparisons between other expressions, for example "true or false and true". The "and" operator has a higher priority than "or", so in this example "false and true" would be evaluated first.

Example Unary Operations
not true = false
-2 = -2
~3 = -4

Example Power Operation
2 ^ 3 = 8

Example Multiplicative Operations
3 * 4 = 12
5 / 2 = 2.5
7 % 3 = 1

Example Additive Operations
2 + 3 = 5
5 - 2 = 3

Example Relational Operations
3 < 4 = true
5 <= 5 = true
7 > 6 = true
8 >= 8 = true
3 = 3 = true
4 == 4 = true
3 != 4 = true
5 <> 6 = true

Example Logical Operations
true or false = true
false and true = false
(5 > 3) and (2 < 4) = true
(5 > 3) || (2 < 1) = true
(5 > 3) and (2 > 4) || (1 < 2) = false
######################################
######################################
This framework includes a set of functions that perform various mathematical operations.

Abs - Returns the absolute value of a number. Example:
Abs(-1) returns 1.

Acos - Returns the angle whose cosine is a specified number. Example:
Acos(1) returns 0.

Asin - Returns the angle whose sine is a specified number. Example:
Asin(0) returns 0.

Atan - Returns the angle whose tangent is a specified number. Example:
Atan(0) returns 0.

Ceiling - Returns the smallest integer greater than or equal to a specified number. Example:
Ceiling(1.5) returns 2.

Cos - Returns the cosine of a specified angle.
Example: Cos(0) returns 1.

Exp - Returns e raised to a specified power.
Example: Exp(0) returns 1.

Floor - Returns the largest integer less than or equal to a specified number. Example:
Floor(1.5) returns 1.

IEEERemainder - Returns the remainder resulting from the division of one specified number by another.
Example: IEEERemainder(3, 2) returns -1.

Log - Returns the logarithm of a specified number.
Example: Log(1, 10) returns 0.

Log10 - Returns the base 10 logarithm of a specified number.
Example: Log10(1) returns 0.

Max - Returns the larger of two specified numbers.
Example: Max(1, 2) returns 2.

Min - Returns the smaller of two numbers.
Example: Min(1, 2) returns 1.

Pow - Returns a specified number raised to a specified power.
Example: Pow(3, 2) returns 9.

Round - Rounds a value to the nearest integer or specified number of decimal places. Example:
Round(3.222, 2) returns 3.22.

Sign - Returns a value indicating the sign of a number. Example:
Sign(-10) returns -1.

Sin - Returns the sine of a specified angle. Example:
Sin(0) returns 0.

Sqrt - Returns the square root of a specified number. Example:
Sqrt(4) returns 2.

Tan - Returns the tangent of a specified angle. Example:
Tan(0) returns 0.

Truncate - Calculates the integral part of a number. Example: 
Truncate(1.7) returns 1.

Additionally, the framework includes other general-purpose functions:

in - Returns whether an element is in a set of values. Example: 
in(1 + 1, 1, 2, 3) returns true.

if - Returns a value based on a condition. Example:
if(4 / 2 == 2, 'value is A', 'value is B') returns 'value is A'.

with - creates an execution context with a default name of 'it'. Example:
with(1d10, if(it == 10, 2, if(it > 3, 1, 0))) returns 2 for a roll of 10, otherwise 1 for a roll above 3, otherwise 0.
with(true, 'dice', if(dice, 'value is A', 'value is B')) returns 'value is A'.

any - returns true if any item is true. Example:
any(true, false, false) returns True
any(false, false, false) returns False

all - returns true if all items are true. Example:
all(true, false, false) returns False
all(true, true, true) returns True

switch - performs a switch operation based on the first input. Example:
switch('A', 'A', 'value is A', 'B', 'value is B') returns 'value is A'
switch('C', 'A', 'value is A', 'B', 'value is B', 'default value') returns 'default value'

join - performs a string join operation. Example:
join(',', 'A', 'B', 'C') returns 'A,B,C'

replace - replaces a given sub-string. Example:
replace('A,2,3', 'A', '1') returns '1,2,3'

format - formats a string based on the given template. Example:
format('{0},{1},{2}', 'A', 'B', 'C') returns 'A,B,C'
format('{0},{0},{1}', 'A', 'B') returns 'A,A,B'

evaluate - executes a string as a standard input. Example:
evaluate('3 + 9') returns 9

roll - rolls a dice at runtime. Example:
roll('3d6') rolls a 6 sided dice, 3 times
roll(format('{0}d6', 4 - 1)) rolls a 6 sided dice, 3 times
with(4-1, roll('' + it + 'd6'))" rolls a 6 sided dice, 3 times
```
