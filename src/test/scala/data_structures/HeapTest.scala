package data_structures

import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class HeapTest extends AnyFunSuite with BeforeAndAfter {

  val list: List[Int] = List(6,4,7,8,9,5,3,1)

  test("get min") {
    assertResult(1)(Heap.heapifyMin(list).head)
  }

  test("get max") {
    assertResult(9)(Heap.heapifyMax(list).head)
  }

  test("custom priority logic") {
    val l = list.map(n => Dummy(n, null))
    val r = Heap.heapifyDummy(l)
    assert(r.nonEmpty)
  }
}
