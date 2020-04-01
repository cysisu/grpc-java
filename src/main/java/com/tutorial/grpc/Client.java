package com.tutorial.grpc;

import io.grpc.*;
import recommend.Recommend;
import recommend.RecommendControllerGrpc;

public class Client {

    public static void main(String []args) {
        final ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080")
                .usePlaintext(true)
                .build();

        RecommendControllerGrpc.RecommendControllerBlockingStub stub = RecommendControllerGrpc.newBlockingStub(channel);
        Recommend.GetRecommendPostsIdInput input = Recommend.GetRecommendPostsIdInput.newBuilder().setNumber(10).setOffset(10).setUserId(12323).build();

        Recommend.GetRecommendPostsIdResult result = stub.getRecommendPostsId(input);

        System.out.println(result);
        channel.shutdown();
    }


}
