import scala.slick.driver.PostgresDriver.simple.Database

object Sandbox {
  def session = {
    val databaseURL = "localhost:postgresql"
    Database.forURL(databaseURL).createSession
  }
}
