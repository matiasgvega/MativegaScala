package algorithms.search

import scala.annotation.tailrec

object Search {

    /**
     * Returns index of an element present in sorted list.
     * Returns -1 if element is not prsent.
     * @param n to find element
     * @param nums sorted list of elements
     * @return index of found element, -1 if not prsent
     */
  def linealStandardLib(n: Int, nums: List[Int]): Int = {
    nums.iterator.indexOf(n)
  }

  def lineal(n: Int, nums: List[Int]): Int = {
    nums.view
        .zipWithIndex
        .find({ case (v, _) => n == v})
        .map(_._2)
        .getOrElse(-1)
  }

    def binary(n: Int, nums: List[Int]): Int = {
        binaryTailrec(n, nums, 0, nums.size-1)
    }

    @tailrec
    private def binaryTailrec(n: Int, nums: List[Int], lo: Int, hi: Int): Int = {
      if (lo > hi) return -1

      val mid = (hi - lo) / 2 + lo
      val toEval = nums(mid)
      n match {
          case `toEval` => mid
          case mv if mv > toEval => binaryTailrec(n, nums, mid + 1, hi)
          case _ => binaryTailrec(n, nums, lo, mid -1)
      }
  }

  def binaryMutable(elem: Int, arr: List[Int]): Int = {
    var lo = 0
    var hi = arr.size - 1
    var mid = (lo + hi)/2
    while (elem != arr(mid) && lo < hi) {
      if (elem > arr(mid)) lo = mid + 1 else hi = mid -1
      mid = (lo + hi) / 2
    }
    if (elem == arr(mid)) mid else -1
  }

}
