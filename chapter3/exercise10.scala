import java.awt.datatransfer._

object exercise9 {

  val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

  flavors.getNativesForFlavor(DataFlavor.imageFlavor)

}

