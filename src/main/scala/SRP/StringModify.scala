
package SRP
import scala.annotation.tailrec

object StringModify extends App {
  val text = (text: String) => text

  /**.
   * modification is used for text modifier or reversing the string
   */

  val modified_Text = (text_To_BeModified: String) =>  {

    @tailrec
    def modify(accumulator: String, index: Int): String = {

      if (index == text_To_BeModified.length)
        return accumulator
      var temp_Var: String = text_To_BeModified.charAt(index).toString
      if (index % 2 != 0)
        temp_Var = index.toString

      modify(accumulator + temp_Var, index + 1)
    }
    modify("",0)
  }
  /**
   * Result as a output of reverse text and modified text.....
   */

  val reverse= (text: String) => text.reverse

  (new StringPrint).StringPrint(reverse(text("Kites ")))
  (new StringPrint).StringPrint(modified_Text(text("Shashikant Tanti")))
}