package com.mb.scalamockexample

import com.mb.scalamockexample.utils.InitCode

trait BaseTest {

  InitCode

  val server: Server = InitCode.server
  val client: Client = InitCode.client

}
