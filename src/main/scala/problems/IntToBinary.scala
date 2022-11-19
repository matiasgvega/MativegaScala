package problems

import scala.annotation.tailrec

/**
 * Take an Integer and convert it into Binary String
 * Ex.
 *  123 --> 1111011
 */
object IntToBinary {

    def convert(i: Int): String = {
        if (i < 0) throw new IllegalArgumentException("Invalid negative number.")
        if (i == 0) return "0"
        recConvert(i)
    }

    @tailrec
    def recConvert(i: Int, s: String = ""): String = {
        if (i == 0) return s
        val r = i % 2
        recConvert(i/2, s"$r$s")
    }
}
