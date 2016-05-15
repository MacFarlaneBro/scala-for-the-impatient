class UnitConversion {
  def convertUnits(value: Double): Double = 0.0
}

object InchesToCentimeters extends UnitConversion {
  override def convertUnits(inches: Double): Double = {
    inches * 2.54
  }
}

object GallonsToLiters extends UnitConversion {
  override def convertUnits(gallons: Double): Double = {
    gallons * 4.54
  }
}

object MilesToKilometers extends UnitConversion {
  override def convertUnits(miles: Double): Double = {
    miles * 1.6
  }
}
