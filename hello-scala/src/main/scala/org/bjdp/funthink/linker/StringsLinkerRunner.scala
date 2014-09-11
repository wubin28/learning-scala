package org.bjdp.funthink.linker

/**
 * Created by ben on 9/11/14.
 */
object StringsLinkerRunner {
  def main(args: Array[String]): Unit = {
    var bjdp = Array("Beijing", "Design", "Patterns", "Study", "Group")

    var linker = new StringLinker()
    var result: String = linker.linkStrings(bjdp)
    print(result)
  }
}
