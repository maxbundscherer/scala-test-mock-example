package com.mb.scalamockexample

import com.mb.scalamockexample.utils.Response

import org.scalatest._

class ExampleTest extends WordSpecLike with Matchers with BaseTest {

  "example server" must {

    "reply with with modified message" in {

      val result = client.getRequestFromServer( "Hello World" )
      result should be ( Response("Hello World - Request from 'myClient'", "myServer") )

    }

  }

}