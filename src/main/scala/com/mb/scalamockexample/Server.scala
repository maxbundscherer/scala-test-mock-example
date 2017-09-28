package com.mb.scalamockexample

import com.mb.scalamockexample.utils.{Request, Response}

/**
  * server
 *
  * @param nickname String
  */
class Server(val nickname: String) {

  /**
    * do sth (dummy function)
    * @param request String
    * @return Response
    */
  def doSth(request: Request): Response = Response(request.message + " - Request from '" + request.sender + "'", nickname)

}