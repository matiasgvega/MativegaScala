import org.scalatest.funsuite.AnyFunSuite

class IntToBinaryTest extends AnyFunSuite {
  test("Test even numbers") {
    val nums = Array(124, 10888, 0)
    nums.foreach( i =>
      assertResult(i.toBinaryString)(IntToBinary.convert(i))
    )
  }

  test("Test odd numbers") {
    val nums = Array(123, 122221, 1)
    nums.foreach( i =>
      assertResult(i.toBinaryString)(IntToBinary.convert(i))
    )
  }
}