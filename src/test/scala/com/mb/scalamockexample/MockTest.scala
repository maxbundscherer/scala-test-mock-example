package com.mb.scalamockexample

import com.mb.scalamockexample.utils._

import org.scalatest._

class MockTest extends WordSpecLike with Matchers with BaseTest {

  "example mocked-server" must {

    "reply with with modified message" in {

      //TODO: Add mocked server

      val result = client.getRequestFromServer( "Hello mocked World" )
      result should be ( Response("Hello mocked World - Request from 'myClient'", "myServer") )

    }

  }

}