package com.mb.scalamockexample

import com.mb.scalamockexample.utils._

import org.scalamock.scalatest.MockFactory
import org.scalatest._

class MockTest extends WordSpecLike with Matchers with MockFactory {

  val server: ServerTrait = mock[ServerTrait]
  val client: Client      = new Client("myClient", server)

  "example mocked-server" must {

    /**
      * configure mocked server
      */
    (server.doSth _).expects( Request("Hello mocked World", "myClient") ).returning( Response("Hello mocked World - Request from 'myClient'", "myServer") )

    "reply with with modified message" in {

      val result = client.getRequestFromServer( "Hello mocked World" )
      result should be ( Response("Hello mocked World - Request from 'myClient'", "myServer") )

    }

  }

}