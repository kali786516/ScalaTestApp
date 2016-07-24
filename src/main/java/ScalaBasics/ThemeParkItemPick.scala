package ScalaBasics

/**
  * Created by srtummala on 7/23/2016.
  */


object ThemeParkItemPick {

  def main(args: Array[String]) {

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



  }

}
