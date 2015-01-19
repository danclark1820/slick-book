import scala.slick.driver.PostgresDriver.simple.Database

object Sandbox {
  def session = {
    val databaseURL = "localhost:postgresql:sandbox"
    Database.forURL(databaseURL).createSession
  }
}
