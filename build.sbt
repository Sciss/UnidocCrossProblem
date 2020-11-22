val audioFileURI        = uri("https://github.com/Sciss/AudioFile.git#v2.3.1")
val lAudioFile          = ProjectRef(audioFileURI, "rootJVM")

lazy val unidocSettings = Seq(
  mappings in packageDoc in Compile := (mappings in (ScalaUnidoc, packageDoc)).value,
  unidocProjectFilter in (ScalaUnidoc, unidoc) := inAnyProject,
)

val site = project.in(file("."))
  .enablePlugins(ScalaUnidocPlugin).settings(unidocSettings)
  .enablePlugins(ParadoxSitePlugin, SiteScaladocPlugin)
  .settings(
    siteSubdirName in SiteScaladoc := "latest/api",
  )
  .aggregate(lAudioFile)

