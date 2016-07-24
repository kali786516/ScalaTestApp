package ScalaBasics

/**
  * Created by srtummala on 7/23/2016.
  */

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkContext, SparkConf}
object ThemeParkItemPick {

  def main(args: Array[String]) {

    Logger.getLogger("org").setLevel(Level.WARN)
    Logger.getLogger("akka").setLevel(Level.WARN)

    val conf = new SparkConf().setMaster("local[*]").setAppName("YOUR_APP_NAME_USER").set("spark.hadoop.validateOutputSpecs", "false")
    val sc = new SparkContext(conf)


    if (args.length < 2)
      {
        println("Atleast two arguments need to be passed")
        System.err.println("Usage:- item + Size" +
          "Drink S")
        sys.exit(1)
      }

    val item=args(0)
    val size=args(1)

    println("item value passed:-%s".format(args(0)))
    println("size value passed:-%s".format(args(1)))

    //Theme park item example
    // | ITEM  |   S    |   M   |  L   |
    // | Drink | 0.99   | 1.29  | 1.39 |
    // | Side  | 1.29   | 1.49  | 1.59 |
    // | Main  | 1.99   | 2.59  | 2.99 |
    // | Combo | 4.09   | 4.99  | 5.69 |

    /*
    val cost=if (item=="Drink"){
      if (size=="S") 0.99
      else if (size=="M") 1.29
      else 1.39
    } if (item=="Side") {
      if (size=="S") 1.29
      else if (size=="M") 1.49
      else 1.59
    } if (item=="Main") {
      if (size=="S") 1.99
      else if (size=="M") 2.59
      else 2.99
    }

    println("cost value after calulation:-%s".format(cost))
    */

    def calculatecost(a:String)=a match {

      case "Drink" => if (size=="S") 0.99 else if (size=="M") 1.29 else 1.39
      case "Side"  => if (size=="S") 1.29 else if (size=="M") 1.49 else 1.59
      case "Main"  => if (size=="S") 1.99 else if (size=="M") 2.59 else 2.99
      case "Combo" => if (size=="S") 4.09 else if (size=="M") 4.99 else 5.69
      case _ => 0.00
    }

    println("calculate cost case statement:- %s".format(calculatecost(item)))

    //theme park second example

    def foodpricematch(item:String,size:String):Double= item match {
      case "Drink" => size match {
        case "S" => 0.99
        case "M" => 1.29
        case _ => 1.39
      }
      case "Side" => size match {
        case "S" => 1.29
        case "M" => 1.49
        case _ => 1.59
     }
      case "Main" => size match {
        case "S" => 1.99
        case "M" => 2.59
        case _ => 2.99
     }
      case "Combo" => size match {
        case "S" => 4.09
        case "M" => 4.99
        case _ => 5.69
      }
     }

     // some case statement example

    def buy(food:(String,Double)):Boolean= food match {
     case("steak",cost) if (cost < 10) => true
     case ("Steak",_) => false
     case(_,cost) => cost < 1
   }


    /*
    * val QuoteRDD=ConvertToMap(FilterDataSet("1017",17,"").
      map(x => ((x(5)+x(4)) , (x(5),x(4),x(1) ,
      if (x.length >= 15) if (x(15) =="B")
        (
          if (x.length >= 25) {if (x(25) == "") x(9)   else x(25)},
          if (x.length >= 37) {if (x(37) == "") x(11)  else x(37)}
          )
      else if (x(15) =="C" )
        (
          if (x.length >= 25) {if (x(24) == "") (x(9))  else x(24)},
          if (x.length >= 30) {if (x(30) == "") (x(11)) else x(30)}
          )
      else if (x(15) =="A")
      {(x(9),x(11))}
      ))))
    *
    *
    * */

    val test=List("1~2~3~4~5")
    val data=sc.parallelize(test)

    data.map(x => x.split("\\~")).map(x => ((x(0),x(1)),(x(2),if (x.length < 2) x(3) match {
      case "B"  => x(3) match {
         case " " => x(3)
         case _ => x(4)
      }

      case "C" => x(5) match {
        case " " => x(6)
        case _ => x(7)
      }
      case "A" => x(6) match {
        case "" => x(8)
        case _ => x(9)
     }
    })))






  }
}
