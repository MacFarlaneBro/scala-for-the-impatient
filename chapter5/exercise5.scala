import scala.reflect.BeanProperty

class Student {
  @BeanProperty var name: String = _
  @BeanProperty var id: Long = _
}
/*
 Generated methods:
 Get and Set for both name and Id both scala and java style
 Though these are both probably fine for the name as it is possible
 that a student could change their name at some point the id value
 should be a val and should not possess a setter as once established it should
 not change.
 */
