// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/security.proto

package org.wso2.choreo.connect.discovery.config.enforcer;

public final class SecurityProto {
  private SecurityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_config_enforcer_Security_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_config_enforcer_Security_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-wso2/discovery/config/enforcer/securit" +
      "y.proto\022\036wso2.discovery.config.enforcer\032" +
      "+wso2/discovery/config/enforcer/issuer.p" +
      "roto\0320wso2/discovery/config/enforcer/aut" +
      "h_header.proto\"\210\001\n\010Security\022<\n\014tokenServ" +
      "ice\030\001 \003(\0132&.wso2.discovery.config.enforc" +
      "er.Issuer\022>\n\nauthHeader\030\002 \001(\0132*.wso2.dis" +
      "covery.config.enforcer.AuthHeaderB\224\001\n1or" +
      "g.wso2.choreo.connect.discovery.config.e" +
      "nforcerB\rSecurityProtoP\001ZNgithub.com/env" +
      "oyproxy/go-control-plane/wso2/discovery/" +
      "config/enforcer;enforcerb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.choreo.connect.discovery.config.enforcer.IssuerProto.getDescriptor(),
          org.wso2.gateway.discovery.config.enforcer.AuthHeaderProto.getDescriptor(),
        });
    internal_static_wso2_discovery_config_enforcer_Security_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_config_enforcer_Security_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_config_enforcer_Security_descriptor,
        new java.lang.String[] { "TokenService", "AuthHeader", });
    org.wso2.choreo.connect.discovery.config.enforcer.IssuerProto.getDescriptor();
    org.wso2.gateway.discovery.config.enforcer.AuthHeaderProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
