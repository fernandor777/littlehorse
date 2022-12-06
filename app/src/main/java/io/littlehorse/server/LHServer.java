package io.littlehorse.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.HealthStatusManager;
import io.grpc.stub.StreamObserver;
import io.littlehorse.common.LHConfig;
import io.littlehorse.common.exceptions.LHConnectionError;
import io.littlehorse.common.model.command.subcommand.PutExternalEvent;
import io.littlehorse.common.model.command.subcommand.PutExternalEventDef;
import io.littlehorse.common.model.command.subcommand.PutTaskDef;
import io.littlehorse.common.model.command.subcommand.PutWfSpec;
import io.littlehorse.common.model.command.subcommand.RunWf;
import io.littlehorse.common.model.command.subcommandresponse.PutExternalEventDefReply;
import io.littlehorse.common.model.command.subcommandresponse.PutExternalEventReply;
import io.littlehorse.common.model.command.subcommandresponse.PutTaskDefReply;
import io.littlehorse.common.model.command.subcommandresponse.PutWfSpecReply;
import io.littlehorse.common.model.command.subcommandresponse.RunWfReply;
import io.littlehorse.common.model.meta.ExternalEventDef;
import io.littlehorse.common.model.meta.TaskDef;
import io.littlehorse.common.model.meta.WfSpec;
import io.littlehorse.common.proto.GetExternalEventDefPb;
import io.littlehorse.common.proto.GetExternalEventDefReplyPb;
import io.littlehorse.common.proto.GetExternalEventPb;
import io.littlehorse.common.proto.GetExternalEventReplyPb;
import io.littlehorse.common.proto.GetNodeRunPb;
import io.littlehorse.common.proto.GetNodeRunReplyPb;
import io.littlehorse.common.proto.GetTaskDefPb;
import io.littlehorse.common.proto.GetTaskDefReplyPb;
import io.littlehorse.common.proto.GetVariablePb;
import io.littlehorse.common.proto.GetVariableReplyPb;
import io.littlehorse.common.proto.GetWfRunPb;
import io.littlehorse.common.proto.GetWfRunReplyPb;
import io.littlehorse.common.proto.GetWfSpecPb;
import io.littlehorse.common.proto.GetWfSpecReplyPb;
import io.littlehorse.common.proto.LHPublicApiGrpc.LHPublicApiImplBase;
import io.littlehorse.common.proto.LHResponseCodePb;
import io.littlehorse.common.proto.PutExternalEventDefPb;
import io.littlehorse.common.proto.PutExternalEventDefReplyPb;
import io.littlehorse.common.proto.PutExternalEventPb;
import io.littlehorse.common.proto.PutExternalEventReplyPb;
import io.littlehorse.common.proto.PutTaskDefPb;
import io.littlehorse.common.proto.PutTaskDefReplyPb;
import io.littlehorse.common.proto.PutWfSpecPb;
import io.littlehorse.common.proto.PutWfSpecReplyPb;
import io.littlehorse.common.proto.RunWfPb;
import io.littlehorse.common.proto.RunWfReplyPb;
import io.littlehorse.common.proto.SearchWfRunPb;
import io.littlehorse.common.proto.SearchWfRunReplyPb;
import io.littlehorse.server.streamsbackend.KafkaStreamsBackend;
import java.io.IOException;

public class LHServer extends LHPublicApiImplBase {

    private LHConfig config;
    private KafkaStreamsBackend backend;
    private Server grpcServer;

    public LHServer(LHConfig config) {
        this.config = config;

        // Hypothetically we could implement different backends in the future...
        // perhaps a Pulsar/Cassandra/Yugabyte backend.
        backend = new KafkaStreamsBackend();

        HealthStatusManager grpcHealthCheckThingy = new HealthStatusManager();
        backend.init(this.config, grpcHealthCheckThingy);

        this.grpcServer =
            ServerBuilder
                .forPort(config.getApiBindPort())
                .addService(this)
                .addService(grpcHealthCheckThingy.getHealthService())
                .build();
    }

    @Override
    public void getWfSpec(GetWfSpecPb req, StreamObserver<GetWfSpecReplyPb> ctx) {
        GetWfSpecReplyPb.Builder out = GetWfSpecReplyPb.newBuilder();

        try {
            WfSpec spec = backend.getWfSpec(
                req.getName(),
                req.hasVersion() ? req.getVersion() : null
            );
            if (spec == null) {
                out.setMessage("Couldn't find specified WfSpec.");
                out.setCode(LHResponseCodePb.NOT_FOUND_ERROR);
            } else {
                out.setResult(spec.toProto());
                out.setCode(LHResponseCodePb.OK);
            }
        } catch (LHConnectionError exn) {
            out.setCode(LHResponseCodePb.CONNECTION_ERROR);
            out.setMessage("Had an internal connection error: " + exn.getMessage());
        }

        ctx.onNext(out.build());
        ctx.onCompleted();
    }

    @Override
    public void getTaskDef(GetTaskDefPb req, StreamObserver<GetTaskDefReplyPb> ctx) {
        GetTaskDefReplyPb.Builder out = GetTaskDefReplyPb.newBuilder();

        try {
            TaskDef spec = backend.getTaskDef(
                req.getName(),
                req.hasVersion() ? req.getVersion() : null
            );
            if (spec == null) {
                out.setMessage("Couldn't find specified TaskDef.");
                out.setCode(LHResponseCodePb.NOT_FOUND_ERROR);
            } else {
                out.setResult(spec.toProto());
                out.setCode(LHResponseCodePb.OK);
            }
        } catch (LHConnectionError exn) {
            out.setCode(LHResponseCodePb.CONNECTION_ERROR);
            out.setMessage("Had an internal connection error: " + exn.getMessage());
        }

        ctx.onNext(out.build());
        ctx.onCompleted();
    }

    @Override
    public void getExternalEventDef(
        GetExternalEventDefPb req,
        StreamObserver<GetExternalEventDefReplyPb> ctx
    ) {
        GetExternalEventDefReplyPb.Builder out = GetExternalEventDefReplyPb.newBuilder();

        try {
            ExternalEventDef spec = backend.getExternalEventDef(
                req.getName(),
                req.hasVersion() ? req.getVersion() : null
            );
            if (spec == null) {
                out.setMessage("Couldn't find specified ExternalEventDef.");
                out.setCode(LHResponseCodePb.NOT_FOUND_ERROR);
            } else {
                out.setResult(spec.toProto());
                out.setCode(LHResponseCodePb.OK);
            }
        } catch (LHConnectionError exn) {
            out.setCode(LHResponseCodePb.CONNECTION_ERROR);
            out.setMessage("Had an internal connection error: " + exn.getMessage());
        }

        ctx.onNext(out.build());
        ctx.onCompleted();
    }

    @Override
    public void putTaskDef(PutTaskDefPb req, StreamObserver<PutTaskDefReplyPb> ctx) {
        PutTaskDef ptd = PutTaskDef.fromProto(req);
        PutTaskDefReply response = backend.process(ptd, PutTaskDefReply.class);
        ctx.onNext(response.toProto().build());
        ctx.onCompleted();
    }

    @Override
    public void putExternalEvent(
        PutExternalEventPb req,
        StreamObserver<PutExternalEventReplyPb> ctx
    ) {
        PutExternalEvent peed = PutExternalEvent.fromProto(req);
        PutExternalEventReply response = backend.process(
            peed,
            PutExternalEventReply.class
        );
        ctx.onNext(response.toProto().build());
        ctx.onCompleted();
    }

    @Override
    public void putExternalEventDef(
        PutExternalEventDefPb req,
        StreamObserver<PutExternalEventDefReplyPb> ctx
    ) {
        PutExternalEventDef peed = PutExternalEventDef.fromProto(req);
        PutExternalEventDefReply response = backend.process(
            peed,
            PutExternalEventDefReply.class
        );
        ctx.onNext(response.toProto().build());
        ctx.onCompleted();
    }

    @Override
    public void putWfSpec(PutWfSpecPb req, StreamObserver<PutWfSpecReplyPb> ctx) {
        PutWfSpec ptd = PutWfSpec.fromProto(req);
        PutWfSpecReply response = backend.process(ptd, PutWfSpecReply.class);
        ctx.onNext(response.toProto().build());
        ctx.onCompleted();
    }

    @Override
    public void runWf(RunWfPb req, StreamObserver<RunWfReplyPb> ctx) {
        RunWf rwf = RunWf.fromProto(req);
        RunWfReply response = backend.process(rwf, RunWfReply.class);
        ctx.onNext(response.toProto().build());
        ctx.onCompleted();
    }

    @Override
    public void getWfRun(GetWfRunPb req, StreamObserver<GetWfRunReplyPb> ctx) {
        ctx.onNext(backend.getWfRun(req));
        ctx.onCompleted();
    }

    @Override
    public void getNodeRun(GetNodeRunPb req, StreamObserver<GetNodeRunReplyPb> ctx) {
        ctx.onNext(backend.getNodeRun(req));
        ctx.onCompleted();
    }

    @Override
    public void getVariable(
        GetVariablePb req,
        StreamObserver<GetVariableReplyPb> ctx
    ) {
        ctx.onNext(backend.getVariable(req));
        ctx.onCompleted();
    }

    @Override
    public void getExternalEvent(
        GetExternalEventPb req,
        StreamObserver<GetExternalEventReplyPb> ctx
    ) {
        ctx.onNext(backend.getExternalEvent(req));
        ctx.onCompleted();
    }

    @Override
    public void searchWfRun(
        SearchWfRunPb req,
        StreamObserver<SearchWfRunReplyPb> ctx
    ) {
        ctx.onNext(backend.searchWfRun(req));
        ctx.onCompleted();
    }

    public void start() throws IOException {
        backend.start();
        grpcServer.start();
    }

    public void close() {
        grpcServer.shutdown();
        backend.close();
    }

    public static void doMain(LHConfig config) throws IOException {
        LHServer server = new LHServer(config);
        Runtime
            .getRuntime()
            .addShutdownHook(
                new Thread(() -> {
                    server.close();
                    config.cleanup();
                })
            );
        server.start();
    }
}