val a=1000000
100000/27
println(a)
//keplers thrid law P2
def cuberoot(x:Int):BigInt=x*x*x

//if condition for amusement park example
val age=10
val cooler=true
val waterpark=true
var cost=20
if (age >=13) cost=35
if (cooler) cost=cost+5
if (waterpark) cost=cost+5
println(cost)

//Theme park item example
// | ITEM  |   S    |   M   |  L   |
// | Drink | 0.99   | 1.29  | 1.39 |
// | Side  | 1.29   | 1.49  | 1.59 |
// | Main  | 1.99   | 2.59  | 2.99 |
// | Combo | 4.09   | 4.99  | 5.69 |

val item=readLine()
println("waht sise do you want")
val size=readLine()
val costofitem=if (item=="Drink"){
  if (size=="S") 0.99
  else if (size=="M") 1.29
  else 1.39
} else if (item=="side"){
  if (size=="s") 1.29
  else if (size=="M") 1.49
  else 1.59
} else if (item=="Main") {
  if (size == "S") 1.99
  else if (size == "M") 2.59
  else 2.99
} else if (item=="Combo") {
  if (size=="s") 4.09
  else if (size=="M") 4.99
  else 5.69
}

//squares overlap
val x1=10
val x2=10
val y1=20
val y2=30
val size1=10
val size2=20
val overlapx=x1<x2+size2 && x1+size1>x2
val overlapy=y1<y2+size2 && y1+size1>y2
val squareoverlap=overlapx && overlapy

13 & 5
// drink allowed or not
val ageofperson=19
val drinkallowed=if (ageofperson >=18) "drink allowed" else "drink not allowed"
// true or false
val a1=1
val b1=2
val c1=3
val d1=true
val e1=false

a1==1
c1 < b1 || b1 > c1
a1 <= c1 && d1==e1
1+2==c1
d1
!e1
d1 || e1
6-(c1-a1)==b1 && (e1 || d1)
c1 > b1 && b1 > a1
a1+b1!=c1 || (c1*a1-b1==a1 && c1-a1 > b1)

//palindrome test
val sometext="abccba"
val palindrometest=if (sometext==sometext.reverse) "Palindrome" else "not palindrome"

//argb value for colours
val red=(4 & 0xff)

println(red)

//quadratic equation

def roots(a : Double, b : Double, c: Double)= {
  if (b*b-4.0*a*c >= 0) {
    Set(1,-1).map(-b + _ * math.sqrt(b*b-4.0*a*c))
  }else{
    Set()
  }
}

//isOverLap = ((r1x1 < r2x2) && (r1x2 > r2x1) &&  (r1y1 < r2y2) && (r1y2 > r2y1));
//rectangle overlap

val (r1x1,r2x2)=(10,20)
val (r1y1,r2y2)=(20,30)
val (r1x2,r2x1)=(40,50)
val (r1y2,r2y1)=(60,70)
val (g1,g2)=(40,50)

def isoverlap:Boolean={
  ((r1x1 < r2x2) && (r1x2 > r2x1) &&  (r1y1 < r2y2) && (r1y2 > r2y1))
}

println(isoverlap)


