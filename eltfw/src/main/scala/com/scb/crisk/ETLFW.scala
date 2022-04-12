package com.scb.crisk

import org.apache.spark.sql.SparkSession

object ETLFW {

  def main(args: Array[String]): Unit = {
    var etlFile=args(0)
    var wfRunInfo=args(1)

    val ss = SparkSession
      .builder()
      .appName(wfRunInfo)
      .enableHiveSupport()
      .getOrCreate()
    val sc = ss.sparkContext

    println("SOURCE_QUERY :: "+sc.textFile(etlFile).collect().mkString("\n"))
    //get the target records
    //var qry = "SELECT"
  }

}
