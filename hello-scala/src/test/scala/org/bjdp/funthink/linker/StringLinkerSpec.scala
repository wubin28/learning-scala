package org.bjdp.funthink.linker

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by ben on 9/12/14.
 */
class StringLinkerSpec extends FlatSpec with Matchers {
  "A StringLinker" should "link several strings into one string" in {
    var stringLinker = new StringLinker()
    var bjdp = Array("Beijing", "Design", "Patterns", "Study", "Group")
    stringLinker.linkStrings(bjdp) should be ("BeijingDesignPatternsStudyGroup")
  }
}
