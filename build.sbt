val audioFileURI = uri("https://github.com/Sciss/AudioFile.git#v2.3.1")
val lAudioFile   = ProjectRef(audioFileURI, "rootJVM")

val root = project.in(file("."))
  .enablePlugins(ScalaUnidocPlugin)
  .aggregate(lAudioFile)

