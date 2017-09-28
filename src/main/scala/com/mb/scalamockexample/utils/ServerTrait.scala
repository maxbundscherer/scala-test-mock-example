package com.mb.scalamockexample.utils

/**
  * trait for server
  */
trait ServerTrait {

  /**
    * do sth (dummy function)
    * @param request String
    * @return Response
    */
  def doSth(request: Request): Response

}