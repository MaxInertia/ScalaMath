/**
  * Created by Dorian Thiessen on 2018-03-09.
  */
package object uncertainty {
  object Implicits {
    /*implicit def int2double(ui: UInt): UDouble =
      UDouble(ui.m.toDouble, ui.u.toDouble)

    implicit def double2int(ud: UDouble): UInt =
      UInt(ud.m.toInt, ud.u.toInt)*/

    class DoubleI(self: Double) {
      implicit def +-(u: Double): UDouble =
        UDouble(self, u)
      implicit def +/-(u: Double): UDouble =
        UDouble(self, u)
    }
    implicit def doubleExt(self: Double): DoubleI = new DoubleI(self)
  }

}
