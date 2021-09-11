



package DIP
object ApplySwitch extends App {

  val electricSwitch = (client: Switchable) => {

    if (client.isOn) {
      println(client.name + " is off")
      client.isOn = false
    }
    else {
      println(client.name + " is On")
      client.isOn = true
    }
  }
  val bulbSwitch = new Switchable {
    override var isOn: Boolean = false
    override var name: String = "Bulb"
  }

  electricSwitch(bulbSwitch)
  electricSwitch(bulbSwitch)

  println()
  val FanSwitch: Fan = new Fan
  electricSwitch(FanSwitch)
  electricSwitch(FanSwitch)

}

