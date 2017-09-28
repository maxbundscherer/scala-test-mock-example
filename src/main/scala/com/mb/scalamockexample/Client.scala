package com.mb.scalamockexample

import com.mb.scalamockexample.utils._

/**
  * client
 *
  * @param server ServerTrait
  */
class Client(val nickname: String, val server: ServerTrait) {

  /**
    * get response from server
    * @param message String
    * @return Response
    */
  def getRequestFromServer(message: String): Response = server.doSth( Request(message, nickname) )

}