import sbt._
import sbt.Keys._
import com.github.siasia.WebPlugin
import com.zantekk.sbt.sbtzantekk.{ZantekkPlugin, ZantekkKeys}
import com.zantekk.sbt.lift.{LiftPlugin, LiftKeys}
import ZantekkKeys._
import LiftKeys._

object Build extends sbt.Build {

  lazy val $name;format="camel"$ = Project(id = "$name;format="norm"$", base = file("."), settings = appSettings)

  lazy val appSettings :Seq[Setting[_]] = Project.defaultSettings ++ ZantekkPlugin.defaultSettings ++ Seq(
    name := "$name$",
    organization := "$organization$",
    version := "$version$",
    startYear := Some(2013),
    scalaVersion := "$scala_version$"
  )

  object LibraryDependencies {
    lazy val liftUtil = "net.liftweb" %% "lift-util" % "2.5-RC2"  % "compile"

    def libs = Seq[ModuleID](liftUtil)
  }
}
