package ScalaBasics

/**
  * Created by
  * srtummala on 7/23/2016.
  */



object ThreeIngredients {

def main(args:Array[String]){

  if (args.length < 2)
    {
      println("atleast 2 arguments need to be passed")
      System.err.println("Usage:-" +
        "ingredient1:- Apple" +
        "Ingredient2:- Bannana" +
        "Ingredient3:- Orange" +
        "Ingedient1cost:- 10" +
        "Ingredient2cost:- 20"+
        "Ingredient3cost:- 30"+
        "No of units:- 4"
      )
      System.exit(1)
    }

  println("ingredient value passed:- %s".format(args(0)))
  println("no of units passed:- %s".format(args(1)))

  val ingredients1=args(0)
  val noofunits=args(1).toInt

  println("calculation for ingredient:-%s".format(ingredients1))

  def calculate(a:String):Int=a match{
    case "apple"   => 4*noofunits
    case "orange"  => 5*noofunits
    case "bannana" => 6*noofunits
    case _ => 0
  }

  println("value of calculation :- %s".format(calculate(ingredients1)))





}
}
