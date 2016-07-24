def printmultipletime(a:String,howmanytimes:Int)={
  println(a*howmanytimes)
}

printmultipletime("kali",3)


def calhms(totalseconds:Int):(Int,Int,Int)={
  val displayseconds=totalseconds%60
  val totalminutes=totalseconds/60
  val displayminutes=totalminutes%60
  val displayhours=totalminutes/60
  (displayhours,displayminutes,displayseconds)

}


def formatHMS(numhours:Int,numMinutes:Int,numSeconds:Int):String={
  val sec=numSeconds.toString
  val min=numMinutes.toString
  numhours+":"+("0"*(2-min.length))+min+":"+("0"*(2-sec.length))+sec
}


def entrycost(age:Int,cooler:Boolean,waterpart:Boolean):Double={
  (if (age < 13 || age > 65) 20 else 35) +
  (if (cooler) 5 else 0) +
  (if(waterpart) 10 else 0)
}

val name="kali"
println(name.length)

val (last,first)="Sri Tummala"

println(last)
println(first)

def addition(a:(Int,Int)):Int=
{
  a._1+a._2
}

println(addition(1,2))




