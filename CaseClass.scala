package Assignments

object CaseClass {
  
  case class Point(x:Int, y:Int){
    def +(p:Point)=Point(p.x+this.x, p.y+this.y)
    def move(dx:Int, dy:Int)=Point(dx+this.x, dy+this.y)
    def distance(p:Point)=Point(this.x-p.x, this.y-p.y)
    def invert=Point(this.y, this.x)
  }

  def main(args: Array[String]): Unit = {
    val p1 = Point(5,7)
    val p2 = Point(3,4)
    val p3 = p1+p2

    println(" p1 = " + p1)
    println(" p2 = " + p2)
    println(" p1 + p2 = " + p3)
    println(" p1 move (3,7) of distance = " + p1.move(3,7))
    println(" distance between p1 and p2 = " + p1.distance(p2))
    println(" invert p1 cordinates = " + p1.invert)
  }
}
