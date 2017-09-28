package com.mb.scalamockexample

import com.mb.scalamockexample.utils._

/**
  * server
 *
  * @param nickname String
  */
class ExampleServer(val nickname: String) extends ServerTrait {

  override def doSth(request: Request): Response = Response(request.message + " - Request from '" + request.sender + "'", nickname)

}