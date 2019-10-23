package com.test.io

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}


object WirteAndReadFile {
  def main(args: Array[String]): Unit = {

    val fileName = "test-file"
    writeFile(fileName)

    readContentFromFile(fileName)

    getTextFromConsole()

  }

  def writeFile(fileName: String): Unit = {
    var writer = new PrintWriter(new File(fileName))
    writer.write("hello scala !")
    writer.close()
    println("write file finish >>> ")
  }

  def readContentFromFile(fileName: String): Unit = {
    Source.fromFile(new File(fileName)).foreach(
      print
    )
    println("read file finish <<<<")
  }

  def getTextFromConsole(): Unit = {
    println("Please input something")
    val line = StdIn.readLine()
    println("content from console >>> " + line)
  }

}
