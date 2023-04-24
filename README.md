# Java-Text-Analyzer
This program reads in a text file, analyzes it, and outputs statistical analyses on the character and character double frequencies.

## Prerequisites
This program requires Java to be installed on your machine.

## How to use
Clone this repository or download the source code.
Open the terminal and navigate to the directory containing the source code.
Compile the program using the command: javac AufgabeTextAnalyzer.java
Run the program using the command: java AufgabeTextAnalyzer
When prompted, enter the name of the text file you want to analyze. The program will then perform the analyses and output the results.

## Output
The program outputs the following statistics:

Frequency of a given character
Single character frequency statistics
Double character frequency statistics

## Example
Suppose we have a text file named "example.txt" containing the following text:
```
Hello world! This is an example text.
```
To analyze this file using the program, we would run the following commands:
```
javac AufgabeTextAnalyzer.java
java AufgabeTextAnalyzer

```

We would then be prompted to enter the name of the text file. We would enter "example.txt" and press Enter. The program would then output the following:

```
Frequency of character 'c': 1
------------------------------------
a: 2
b: 0
c: 1
------------------------------------
a: 2
b: 0
c: 1
d: 1
e: 5
f: 0
g: 0
h: 2
i: 3
j: 0
k: 0
l: 4
m: 1
n: 3
o: 3
p: 0
q: 0
r: 3
s: 3
t: 6
u: 0
v: 0
w: 1
x: 0
y: 0
z: 0
------------------------------------
Frequency of character double 'a': 1
------------------------------------
aa: 0
ab: 0
ac: 0
ba: 0
bb: 0
bc: 0
ca: 0
cb: 0
cc: 0
da: 0
db: 0
dc: 0
ea: 0
eb: 0
ec: 0
fa: 0
fb: 0
fc: 0
ga: 0
gb: 0
gc: 0
ha: 1
hb: 0
hc: 0
ia: 0
ib: 0
ic: 0
ja: 0
jb: 0
jc: 0
ka: 0
kb: 0
kc: 0
la: 1
lb: 0
lc: 0
ma: 0
mb: 0
mc: 0
na: 1
nb: 0
nc: 0
oa: 0
ob: 0
oc: 0
pa: 0
pb: 0
pc: 0
qa: 0
qb: 0
qc: 0
ra: 1
rb: 0
rc: 0

``

