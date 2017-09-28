package com.mb.scalamockexample.utils

import com.mb.scalamockexample.{Server, Client}

/**
  * init code - run once
  */
object InitCode {

  val server = new Server("myServer")
  val client = new Client("myClient", server)

}