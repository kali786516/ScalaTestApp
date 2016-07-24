package scala.functions

/**
  * Created by srtummala on 7/23/2016.
  */

import scala.math._

object FunctionExamples {

  def main(args: Array[String]) {

    def maths(a:(Int,Int),b:String):Int={
       b match {
        case "addition" => a._1+a._2
        case "subtract" => a._1-a._2
        case "multiplication" => a._1*a._2
        case "division" => a._1/a._2
        case _ => 0
      }
    }

    println(maths((1,2),"addition"))
    println(maths((10,30),"subtract"))

    def sinh(x:Int):Double=1/2 * (math.exp(x)-math.exp(-x))
    def cosh(x:Int):Double=1/2 * (math.exp(x)+math.exp(-x))
    def tanh(x:Int):Double=sinh(x)/cosh(x)

    print(tanh(10))



  }

}
