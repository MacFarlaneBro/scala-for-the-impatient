class Point private (x: Int, y: Int) extends java.awt.Point(x, y)

object Point {

  def apply(x: Int, y: Int) =
    new Point(x, y)

}
