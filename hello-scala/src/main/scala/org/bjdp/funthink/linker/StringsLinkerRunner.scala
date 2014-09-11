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

  def linkStrings(bjdp: Array[String]): String = {
    var i = 0
    var result = ""
    while (i < bjdp.length) {
      result += bjdp(i)
      i += 1
    }
    result
  }
}
