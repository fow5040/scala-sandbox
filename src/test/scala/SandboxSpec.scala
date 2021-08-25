import org.scalatest.FlatSpec
import com.fow5040.scalasandbox.Sandbox._

class SandboxSpec extends FlatSpec {

  "The sandmaker" should "make sand!" in {
    assert(makeSand() == "sand")
  }

}
