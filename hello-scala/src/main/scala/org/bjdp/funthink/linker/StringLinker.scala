package org.bjdp.funthink.linker

/**
 * Created by ben on 9/12/14.
 */
class StringLinker() {
  def linkStrings(strings: Array[String]): String = {
    var i = 0
    var result = ""
    while (i < strings.length) {
      result += strings(i)
      i += 1
    }
    result
  }
}
