package algorithms.search

import scala.util.Random

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class SearchTest extends AnyFunSuite with BeforeAndAfter {

  val list: List[Int] = (0 to 100000).toList
  var st: Long = 0L

  before {
    st = System.nanoTime()
  }

  after {
    println(s"\tExecution Time: ${(System.nanoTime()-st)*1e-9}")
  }

  test("Linear - Do not find") {
    println("Linear - TEST: o not find")
    assertResult(-1)(Search.lineal(-1, list))
  }

  test("Binary - Do not find") {
    println("Binary - TEST: o not find")
    assertResult(-1)(Search.binary(-1, list))
  }
  test("BinaryMutable - Do not find") {
    println("Binary2 - TEST: o not find")
    assertResult(-1)(Search.binaryMutable(-1, list))
  }

  test("Linear - smaller element") {
    println("Linear - TEST: smaller element")
    assertResult(0)(Search.lineal(0, list))
  }

  test("Binary - smaller element") {
    println("Binary - TEST: smaller element")
    assertResult(0)(Search.binary(0, list))
  }
  test("BinaryMutable - smaller element") {
    println("BinaryB - TEST: smaller element")
    assertResult(0)(Search.binaryMutable(0, list))
  }

  test("Linear - mid element") {
    println("Linear - TEST: mid element")
    assertResult(5000)(Search.lineal(5000, list))
  }

  test("Binary - mid element") {
    println("Binary - TEST: mid element")
    assertResult(5000)(Search.binary(5000, list))
  }
  test("BinaryMutable - mid element") {
    println("BinaryMutable - TEST: mid element")
    assertResult(5000)(Search.binaryMutable(5000, list))
  }

  test("Linear - biggest element") {
    println("Linear - TEST: biggest element")
    assertResult(10000)(Search.lineal(10000, list))
  }

  test("Binary - biggest element") {
    println("Binary - TEST: biggest element")
    assertResult(10000)(Search.binary(10000, list))
  }
  test("BinaryMutable - biggest element") {
    println("BinaryMutable - TEST: biggest element")
    assertResult(10000)(Search.binaryMutable(10000, list))
  }



  test("random test") {
    println("Random Test")

    val nums = (1 to 100).map(_ => Random.nextInt()).toList


    val stm = System.nanoTime()
    nums.foreach(Search.binary(_, list))
    println(s"Matias Total Time: ${System.nanoTime()-stm}" )
    val stb = System.nanoTime()
    nums.foreach(Search.binaryMutable(_, list))
    println(s"Binary Total Time: ${System.nanoTime()-stb}" )
    // Linear
    val stl = System.nanoTime()
    nums.foreach(Search.lineal(_, list))
    println(s"Linear Total Time: ${System.nanoTime()-stl}" )
  }
}
