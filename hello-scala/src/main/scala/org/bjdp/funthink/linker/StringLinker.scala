package org.bjdp.funthink.linker

/**
 * Created by ben on 9/12/14.
 */
class StringLinker() {
  def linkStrings(strings: Array[String]): String = {
    var result = ""
    for (string <- strings)
      result += string
    result
  }
}
