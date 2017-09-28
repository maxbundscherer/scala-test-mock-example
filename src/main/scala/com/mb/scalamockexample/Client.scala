package com.mb.scalamockexample

import com.mb.scalamockexample.utils.{Request, Response}

/**
  * client
 *
  * @param server Server
  */
class Client(val nickname: String, val server: Server) {

  /**
    * get response from server
    * @param message String
    * @return Response
    */
  def getRequestFromServer(message: String): Response = server.doSth( Request(message, nickname) )

}