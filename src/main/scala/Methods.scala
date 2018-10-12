object Methods {
  def test( num: Int, strings: String*)={
    for (i<-0 to strings.size){
      if(i<num && i < strings.size){
        println(findWord(strings(i)))
      }
    }
    //strings.map(x=> println(findWord(x)))
  }

  def findWord(string: String)={
    val pattern = "^[" + string.toLowerCase +"]*$"
    val lines = scala.io.Source.fromFile("C:\\\\Users\\\\Admin\\\\Desktop\\\\files\\\\enable1.txt").getLines.toArray
    val validWords = scala.collection.mutable.ArrayBuffer[String]()
    for(i<-0 to lines.size - 1 ){
      if (lines(i).matches(pattern)){
        validWords += lines(i)
      }
    }
    validWords.maxBy(x=>x.length)
  }
}
