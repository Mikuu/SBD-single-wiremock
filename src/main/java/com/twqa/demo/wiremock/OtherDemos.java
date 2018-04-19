package com.twqa.demo.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class OtherDemos {

    //curl localhost:2345/api/demo1
    private static void stubForGet() {
        stubFor(get(urlMatching("/api/demo1"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withStatusMessage("Everything was just fine!")
                        .withHeader("Content-Type", "text/plain")
                        .withBody("Stub For demo1 (Java)")));
    }

    //curl -X POST localhost:2345/api/demo2
    private static void stubForPost() {
        stubFor(post(urlMatching("/api/demo2"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("Stub For Demo2 (Java)")));
    }

    //curl -X POST --data apple localhost:2345/api/demo3
    private static void stubForPostWithReq() {
        stubFor(post(urlMatching("/api/demo3"))
                .withRequestBody(equalTo("apple"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withBody("Stub For Demo3 (Java)")));
    }

    public static void runStubs() {
        stubForGet();
        stubForPost();
        stubForPostWithReq();

        System.out.print("===== All stubs started =====");
    }
}
