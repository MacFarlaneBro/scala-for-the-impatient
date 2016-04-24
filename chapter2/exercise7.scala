object exercise7 {

  //using named variables
  "Hello".foldLeft(1l)((a,b) =>  a * b)

  //using default variables
  "Hello".foldLeft(1l)(_ * _)
}
