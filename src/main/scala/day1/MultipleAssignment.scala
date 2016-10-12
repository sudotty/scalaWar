object MultipleAssignment {
  def getPersonInfo(primaryKey: Int) = {
    ("sin13", "cos14", "sin13cos14@gmail.com")
  }

  val (firstName, lastName, emailAddress) = getPersonInfo(1)

  println("First Name Is " + firstName)
  println("Last Name Is " + lastName)
  println("First Name Is " + emailAddress)
}
