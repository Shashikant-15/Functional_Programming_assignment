package LSP

case class Printer(message: String) {
  def printMessage(): Unit = println(message)
}
