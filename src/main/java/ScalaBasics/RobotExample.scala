package ScalaBasics

/**
  * Created by srtummala on 7/23/2016.
  */
import java.awt.AWTException
import java.awt.Robot
import java.awt.event.InputEvent
import java.awt.event.KeyEvent

object RobotExample {

  def main(args: Array[String]) {

    val robot=new Robot()

    println("Robot function")

    robot.setAutoDelay(10)
    robot.setAutoWaitForIdle(true)

    robot.delay(20*1000)
    robot.mouseMove(40, 130)
    robot.delay(1*1000)

    robot.delay(1*1000)

    def leftClick {
      robot.mousePress(InputEvent.BUTTON1_MASK)
      robot.delay(200)
      robot.mouseRelease(InputEvent.BUTTON1_MASK)
      robot.delay(200)
    }

    def typeKeystroke(i: Int) {
      robot.delay(40)
      robot.keyPress(i)
      robot.keyRelease(i)
    }


  }

}
