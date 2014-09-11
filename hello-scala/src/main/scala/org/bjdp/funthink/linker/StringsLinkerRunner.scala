package org.bjdp.funthink.linker

/**
 * Created by ben on 9/11/14.
 */
object StringsLinkerRunner {
  def main(args: Array[String]): Unit = {
    val bjdp = Array("Beijing", "Design", "Patterns", "Study", "Group")

    val linker = new StringLinker()
    val result: String = linker.linkStrings(bjdp)
    print(result)
  }
}
