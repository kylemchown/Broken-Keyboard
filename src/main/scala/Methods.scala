object Methods {
  def test( num: Int, strings: String*):Unit ={
    strings.indices.foreach{ i =>
      if(i<num && i < strings.size){
        println(findWord(strings(i)))
      }
    }
  }

  def findWord(string: String):String ={
    val pattern = "^[" + string.toLowerCase +"]*$"
    val lines = scala.io.Source.fromFile("C:\\\\Users\\\\Admin\\\\Desktop\\\\files\\\\enable1.txt").getLines.toArray
    val validWords = scala.collection.mutable.ArrayBuffer[String]()
    lines.indices.foreach{ i =>
      if (lines(i).matches(pattern)){
        validWords += lines(i)
      }
    }
    if (validWords.nonEmpty){
      validWords.maxBy(x=>x.length)
    }
    else{
      ""
    }
  }

}
