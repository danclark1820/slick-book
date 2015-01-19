import scala.slick.driver.PostgresDriver.simple._

case class Supplier(snum: String, sname: String, status: Int, city: String) 

class Suppliers(tag: Tag) extends Table[Supplier](tag, "suppliers") {
  def snum = column[String]("snum")
  def sname = column[String]("sname")
  def status = column[Int]("status")
  def city = column[String]("city")
  def * = (snum, sname, status, city) <> (Supplier.tupled, Supplier.unapply _)
}
