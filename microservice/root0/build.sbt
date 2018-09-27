name := "${IJ_PROJECT_NAME}" // имя проекта

version := "1.0"

lazy val `${IJ_PROJECT_NAME}` = (project in file(".")).enablePlugins(PlayJava,PlayScala)

javacOptions ++= Seq("-Xlint:all")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

version := "2.6.x"

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice // обязательно
libraryDependencies += ws // обязательно
libraryDependencies += javaWs // ?обязательно
libraryDependencies += jcache  // не обязательно, для кэширования выдачи
libraryDependencies += ehcache  // не обязательно, для кэширования выдачи
libraryDependencies += cacheApi  // не обязательно, для кэширования выдачи
libraryDependencies += "org.assertj" % "assertj-core" % "3.8.0" % Test  // обязательно для тестов
libraryDependencies += "org.awaitility" % "awaitility" % "3.0.0" % Test  // обязательно для тестов
libraryDependencies += "org.mybatis.caches" % "mybatis-ehcache" % "1.1.0"  // обязательно для mybatis
libraryDependencies += "org.postgresql" % "postgresql" % "42.1.4"  // обязательно для БД
libraryDependencies += "org.jsr107.ri" % "cache-annotations-ri-guice" % "1.0.0"  // не обязательно, для кэша
libraryDependencies += "io.swagger" %% "swagger-play2" % "1.6.0"  // обязательно для документации в swagger

libraryDependencies ++= Seq(
  javaJdbc, 
  "org.mybatis" % "mybatis" % "3.3.1",
  "org.mybatis" % "mybatis-guice" % "3.10",
  "com.nimbusds" % "nimbus-jose-jwt" % "4.40",
  "com.google.inject.extensions" % "guice-multibindings" % "4.1.0"
)

updateOptions := updateOptions.value.withCachedResolution(true)
routesGenerator := InjectedRoutesGenerator

// Needed to make JUnit report the tests being run
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v")) // verbose тесты

unmanagedResourceDirectories in Compile += (baseDirectory.value / "conf")

