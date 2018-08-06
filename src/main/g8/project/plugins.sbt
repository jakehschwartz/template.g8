logLevel := Level.Warn

credentials += Credentials("Artifactory Realm", "zignal.artifactoryonline.com", "buildserver", "buildserver")

resolvers ++= Seq("Artifactory Cache" at "https://zignal.artifactoryonline.com/zignal/zignal-repos")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.3")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.3.4")
