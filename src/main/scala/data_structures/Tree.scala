package data_structures

import scala.annotation.tailrec
import scala.collection.mutable

import models.BinaryTreeNode

object Tree {

  @tailrec
  def sum(root: BinaryTreeNode, queue: mutable.Queue[BinaryTreeNode] = mutable.Queue(), total: Int = 0): Int = {
    if (root.left == null && root.right == null && queue.isEmpty) {
        root.value + total
    } else {
        if (root.left != null) queue.addOne(root.left)
        if (root.right != null) queue.addOne(root.right)
        sum(queue.dequeue(), queue, root.value + total)
    }
  }
}
