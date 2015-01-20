import scala.slick.driver.PostgresDriver.simple._

case class Shipment(snum: String, pnum: String, qty: Int)

class Shipments(tag: Tag) extends Table[Shipment](tag, "shipments") {
  def snum = column[String]("snum")
  def pnum = column[String]("pnum")
  def qty = column[Int]("qty")
  def * = (snum, pnum, qty) <> (Shipment.tupled, Shipment.unapply _)
  def supplier = foreignKey("SUP_FK", snum, suppliers)(_.snum)
}
