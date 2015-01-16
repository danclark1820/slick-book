import org.postgresql.ds.PGSimpleDataSource
import scala.slick.driver.PostgresDriver.simple.Database

object Sandbox {
  def session = {
    val ds = new PGSimpleDataSource
    ds.setDatabaseName("sandbox")
    Database.forDataSource(ds).createSession
  }
}
