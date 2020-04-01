package recommend;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: recommend.proto")
public final class RecommendControllerGrpc {

  private RecommendControllerGrpc() {}

  public static final String SERVICE_NAME = "recommend.RecommendController";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<recommend.Recommend.GetRecommendPostsIdInput,
      recommend.Recommend.GetRecommendPostsIdResult> METHOD_GET_RECOMMEND_POSTS_ID =
      io.grpc.MethodDescriptor.<recommend.Recommend.GetRecommendPostsIdInput, recommend.Recommend.GetRecommendPostsIdResult>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "recommend.RecommendController", "GetRecommendPostsId"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              recommend.Recommend.GetRecommendPostsIdInput.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              recommend.Recommend.GetRecommendPostsIdResult.getDefaultInstance()))
          .setSchemaDescriptor(new RecommendControllerMethodDescriptorSupplier("GetRecommendPostsId"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendControllerStub newStub(io.grpc.Channel channel) {
    return new RecommendControllerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendControllerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecommendControllerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendControllerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecommendControllerFutureStub(channel);
  }

  /**
   */
  public static abstract class RecommendControllerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRecommendPostsId(recommend.Recommend.GetRecommendPostsIdInput request,
        io.grpc.stub.StreamObserver<recommend.Recommend.GetRecommendPostsIdResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RECOMMEND_POSTS_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_RECOMMEND_POSTS_ID,
            asyncUnaryCall(
              new MethodHandlers<
                recommend.Recommend.GetRecommendPostsIdInput,
                recommend.Recommend.GetRecommendPostsIdResult>(
                  this, METHODID_GET_RECOMMEND_POSTS_ID)))
          .build();
    }
  }

  /**
   */
  public static final class RecommendControllerStub extends io.grpc.stub.AbstractStub<RecommendControllerStub> {
    private RecommendControllerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendControllerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendControllerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendControllerStub(channel, callOptions);
    }

    /**
     */
    public void getRecommendPostsId(recommend.Recommend.GetRecommendPostsIdInput request,
        io.grpc.stub.StreamObserver<recommend.Recommend.GetRecommendPostsIdResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RECOMMEND_POSTS_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecommendControllerBlockingStub extends io.grpc.stub.AbstractStub<RecommendControllerBlockingStub> {
    private RecommendControllerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendControllerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendControllerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendControllerBlockingStub(channel, callOptions);
    }

    /**
     */
    public recommend.Recommend.GetRecommendPostsIdResult getRecommendPostsId(recommend.Recommend.GetRecommendPostsIdInput request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RECOMMEND_POSTS_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecommendControllerFutureStub extends io.grpc.stub.AbstractStub<RecommendControllerFutureStub> {
    private RecommendControllerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecommendControllerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendControllerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecommendControllerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<recommend.Recommend.GetRecommendPostsIdResult> getRecommendPostsId(
        recommend.Recommend.GetRecommendPostsIdInput request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RECOMMEND_POSTS_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RECOMMEND_POSTS_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendControllerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendControllerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RECOMMEND_POSTS_ID:
          serviceImpl.getRecommendPostsId((recommend.Recommend.GetRecommendPostsIdInput) request,
              (io.grpc.stub.StreamObserver<recommend.Recommend.GetRecommendPostsIdResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RecommendControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendControllerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return recommend.Recommend.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecommendController");
    }
  }

  private static final class RecommendControllerFileDescriptorSupplier
      extends RecommendControllerBaseDescriptorSupplier {
    RecommendControllerFileDescriptorSupplier() {}
  }

  private static final class RecommendControllerMethodDescriptorSupplier
      extends RecommendControllerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendControllerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RecommendControllerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendControllerFileDescriptorSupplier())
              .addMethod(METHOD_GET_RECOMMEND_POSTS_ID)
              .build();
        }
      }
    }
    return result;
  }
}
