package com.test

import com.typesafe.scalalogging.Logger

object HelloWorld {

  lazy val logger = Logger(org.slf4j.LoggerFactory.getLogger("log-scala"))


  def main(args: Array[String]): Unit = {
    print("hello \t world\n")


    val a = 0

    for (a <- 0 to (10)) {
//      logger.debug("hello debug")
      logger.info("hello debug {}",a)
    }


  }
}
