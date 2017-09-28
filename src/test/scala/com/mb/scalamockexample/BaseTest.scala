package com.mb.scalamockexample

import com.mb.scalamockexample.utils._

trait BaseTest {

  InitCode

  val server: ServerTrait = InitCode.exampleServer
  val client: Client      = InitCode.client

}
