package scala.recursion

/**
  * Created by kalit_000 on 23/07/2016.
  */

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkContext, SparkConf}

object RecurcisionExample {

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.WARN)
    Logger.getLogger("akka").setLevel(Level.WARN)

    val conf = new SparkConf().setMaster("local[*]").setAppName("YOUR_APP_NAME_USER").set("spark.hadoop.validateOutputSpecs", "false")
    val sc = new SparkContext(conf)

    if (args.length < 2)
      {
        System.err.println("Usage:-")

        System.exit(1)
      }

    // write a function to sum values until user types quit

    def sum():Int={
      val n=readLine()

      if(n!="QUIT"){
        n.toInt+sum()
      }
      else {
        0
      }
    }

    // some recurcive function

    def inputandcount(base:Int):(Int,Int)={
      val n=readLine()
      if (n!="quit"){
        val (s,c)=inputandcount(base)
        (s*n.toInt,c+1)
      }else
        {
          (base,0)
        }
    }

   // exponential function
    def ex(n:Int):Double={
     if(n > 0) {
       math.exp(n*ex(n))
     }
     else
       {
         0.0
       }
   }

    //powers of two
    def power(a:Int):Double={
      math.pow(2,a)
    }

    //function is prime
    def isprime(a:Int):Boolean={
      if (a %2 != 0)
        {
          true
        }
      else
        {
          false
        }
    }

    println(isprime(4))

  }



}
