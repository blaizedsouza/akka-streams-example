name := "akka-reddit-wordcount"
 
version := "0.1.0 "
 
scalaVersion := "2.11.5"

val akkaVersion = "2.4.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-agent" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
  "net.databinder.dispatch" %% "dispatch-json4s-native" % "0.11.2",
  "com.google.protobuf" % "protobuf-java" % "2.5.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.2",
  "org.scalaz" %% "scalaz-core" % "7.1.0"  
)

scalacOptions ++= Seq("-feature")
