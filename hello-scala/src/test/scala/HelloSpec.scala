import org.scalatest.{Matchers, FlatSpec}

class HelloSpec extends FlatSpec with Matchers {
  "Hello" should "have tests" in {
    true should be (true)
  }
}
