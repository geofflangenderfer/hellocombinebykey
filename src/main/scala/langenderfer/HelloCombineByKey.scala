import org.apache.spark.sql.SparkSession


object HelloCombineByKey {
  def main(args: Array[String]) {
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    import spark.implicits._

    val kvData = Seq(("a",1),("b",2),("a",3),("c",9),("b",6)).toDS()
    kvData.show()
    //+---+---+
    //| _1| _2|
    //+---+---+
    //|  a|  1|
    //|  b|  2|
    //|  a|  3|
    //|  c|  9|
    //|  b|  6|
    //+---+---+


    val keyAverages = kvData.rdd.combineByKey(
      x                           => (x,1),
      (a: (Int,Int), x: Int)      => (a._1+x,a._2+1),
      (b: (Int,Int), c: (Int,Int))=> (b._1+c._1,b._2+c._2)
    ).toDS()

    keyAverages.show()
    //+---+------+
    //| _1|    _2|
    //+---+------+
    //|  a|{4, 2}|
    //|  b|{8, 2}|
    //|  c|{9, 1}|
    //+---+------+

    val keyAveragesFinal = keyAverages.map(x => (x._1,x._2._1/x._2._2))

    keyAveragesFinal.show()
    //+---+---+
    //| _1| _2|
    //+---+---+
    //|  a|  2|
    //|  b|  4|
    //|  c|  9|
    //+---+---+

    spark.stop()
  }
}

