object exercise9 {

  java.util.TimeZone.getAvailableIDs.filter(_.contains("America")).map(_.drop(8)).sorted

}
