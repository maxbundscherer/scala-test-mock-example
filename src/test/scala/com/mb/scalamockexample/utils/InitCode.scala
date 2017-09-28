package com.mb.scalamockexample.utils

import com.mb.scalamockexample._

/**
  * init code - run once
  */
object InitCode {

  val exampleServer = new ExampleServer("myServer")
  val client        = new Client("myClient", exampleServer)

}