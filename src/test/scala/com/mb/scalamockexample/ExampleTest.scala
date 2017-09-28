package com.mb.scalamockexample

import com.mb.scalamockexample.utils._

import org.scalatest._

class ExampleTest extends WordSpecLike with Matchers {

  val server: ServerTrait = new ExampleServer("myServer")
  val client: Client      = new Client("myClient", server)

  "example server" must {

    "reply with with modified message" in {

      val result = client.getRequestFromServer( "Hello mocked World" )
      result should be ( Response("Hello mocked World - Request from 'myClient'", "myServer") )

    }

  }

}